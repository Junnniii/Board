package jun.spring.prj.board1.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import javax.servlet.ServletContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;
import jun.spring.prj.board1.service.BoardService;


@Controller("boardController")
@RequestMapping("/board/1")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@Autowired
	private ServletContext context;
	protected String path = "/static/upload";
	
	
	@GetMapping(value="/list")
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
//				
//				System.out.println(entity.getRegdate());
			}
		}
		mv.addObject("list",list);
		return mv;
	}
	
	@GetMapping(value="/detail")
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
	
// 빠른 글 만들기 함수
//	@GetMapping(value="/regmacro")
//	public String regMacro() throws ClassNotFoundException, SQLException, InterruptedException {
//		BoardEntity entity = new BoardEntity();
//		for(int i=1 ; i<=300 ; i++) {
//			entity.setTitle("테스트"+i);
//			entity.setWriter_id("HJBOARD");
//			entity.setContent("콘텐츠"+i+"\nThe form element that the textarea element is associated with (its \"form owner\"). The value of the attribute must be an ID of a form element in the same document. If this attribute is not specified, the textarea element must be a descendant of a form element. This attribute enables you to place textarea elements anywhere within a document, not just as descendants of their form elements.");
//			int num = service.insert(entity);
//			System.out.println("실행 "+i+"번째 완료 결과 : "+num);
//			Thread.sleep(50);
//		}
//		return "";
//	}
	
	@PostMapping(value = "/regboard")
	public String regBoard(@ModelAttribute BoardEntity entity,@RequestParam(value="upload_file") MultipartFile file) throws ClassNotFoundException, SQLException, IOException {
		
		if(file.getSize() > 0)
		{
			String filename = file.getOriginalFilename();
			entity.setFiles(filename);
			
			String realPath = context.getRealPath(path);
			
	//		경로상 업로드폴더가 없을경우 생성
			File savePath = new File(realPath);
			if(!savePath.exists())
				savePath.mkdirs();
			
			realPath += File.separator + filename;
			System.out.println("파일저장 위치 : "+realPath);
			File saveFile = new File(realPath);
			file.transferTo(saveFile);
		}

		int i = service.insert(entity);
		System.out.println("reg 실행결과 : "+i);

		
		return "redirect:list";
		
	}
	
	@GetMapping(value="/edit")
	public ModelAndView edit(int id) throws ClassNotFoundException, SQLException 
	{
		ModelAndView mv = new ModelAndView("board.edit");
		System.out.println("=========================edit 요청이 들어왔습니다 ===================");
		BoardEntity entity = service.getBoard(id);
		System.out.println("받은 파라미터 id : "+id);
		mv.addObject("board", entity);
		mv.addObject("id",id);
		return mv;
	}
	
	@PostMapping(value="/editboard")
	public String editBoard(@ModelAttribute BoardEntity entity,@RequestParam(value="upload_file")MultipartFile file,@RequestParam int id) throws ClassNotFoundException, SQLException, IllegalStateException, IOException
	{
		String url="redirect:";
		System.out.println("============editBoard 요청 ===============");
		entity.setId(id);
		System.out.println(entity.toString());
		if(file.getSize() > 0)
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
		else {
			entity.setFiles("");
		}
		
		int i = service.update(entity);
		System.out.println("edit 실행결과 : "+i);
		
		if(entity.getId()==null || entity.getId()==0)
		{
			url += "list";
		}
		else 
		{
			url = "detail?id="+entity.getId();
		}
		return "redirect:list";
	}
	
	@GetMapping(value = "/delete")
	public String delete(int id) throws ClassNotFoundException, SQLException {
		System.out.println("================== delete 요청 ===================");
		System.out.println("받은 id 값 : "+id);
		int i = service.delete(id);
		System.out.println("delete 실행결과 : "+i);
		return "redirect:list";
	}
}
