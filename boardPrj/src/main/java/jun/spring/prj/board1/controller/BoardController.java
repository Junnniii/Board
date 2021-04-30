package jun.spring.prj.board1.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.AbstractView;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;
import jun.spring.prj.board1.service.BoardService;
import jun.spring.prj.dto.DeptDTO;

@Controller("boardController")
@RequestMapping("/board/1")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@Autowired
	private ServletContext context;
	protected String path = "/static/upload";
	
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public ModelAndView getList() throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView("board.list");
		System.out.println("======================/list 요청이 왔습니다 ======================");
		List<BoardViewEntity> list = service.getList(1, "", "");
		if(list.isEmpty()) {
			System.out.println("출력할 데이터x");
		}
		else
		{
			for (BoardViewEntity entity : list)
			{
				
				System.out.println(entity.getRegdate());
			}
		}
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public ModelAndView getDetail(int id) throws ClassNotFoundException, SQLException
	{
		ModelAndView mv = new ModelAndView("board.detail");
		
		System.out.println("=====================/detail 요청이 왔습니다======================");
		
		BoardEntity entity = service.getBoard(id);
		int i = service.countHit(id);
		System.out.println(entity.toString());
		
		String realPath = context.getRealPath(path)+File.separator+entity.getFiles();
		
		
		mv.addObject("board",entity);
		mv.addObject("filePath",realPath);
		return mv;
		
	}
	
	@GetMapping(value = "/reg")
	@ResponseBody
	public ModelAndView regBoard( ) {
		ModelAndView mv = new ModelAndView("board.reg");
		return mv;
	}
	
	@PostMapping(value = "/regboard")
	public String regBoard(@ModelAttribute BoardEntity entity,@RequestParam(value="upload_file") MultipartFile file) throws ClassNotFoundException, SQLException, IOException {
		
		if(file != null)
		{
			String filename = file.getOriginalFilename();
			entity.setFiles(filename);
			
			String realPath = context.getRealPath(path);
			
	//		경로상 업로드폴더가 없을경우 생성
			File savePath = new File(realPath);
			if(!savePath.exists())
				savePath.mkdirs();
			
			realPath += File.separator + filename;
			File saveFile = new File(realPath);
			file.transferTo(saveFile);
		}

		int i = service.insert(entity);
		System.out.println("실행결과"+i);
		
		return "redirect:list";
		
	}
	
	

	
}
