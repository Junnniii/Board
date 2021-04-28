package jun.spring.prj.board1.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import jun.spring.prj.dto.DeptDTO;

@Controller("boardController")
@RequestMapping("/board/1")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public ModelAndView getList() throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView("board.list");
		
		List<BoardViewEntity> list = service.getList(1, "", "");
		if(list.isEmpty()) {
			System.out.println("출력할 데이터x");
		}
		else
		{
			for (BoardViewEntity entity : list)
			{
				System.out.println("11");
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
		BoardEntity entity = service.getBoard(id);
		System.out.println(entity.toString());
		mv.addObject("board",entity);
		return mv;
		
	}
	
	@GetMapping(value = "/reg")
	@ResponseBody
	public ModelAndView regBoard( ) {
		ModelAndView mv = new ModelAndView("board.reg");
		return mv;
	}
	
	@PostMapping(value = "/regboard")
	public String regBoard(@ModelAttribute BoardEntity entity) throws ClassNotFoundException, SQLException {

		int i = service.insert(entity);
		System.out.println("실행결과"+i);
		
//		entity.setFiles(file.getName());
		return "board.list";
		
	}
}
