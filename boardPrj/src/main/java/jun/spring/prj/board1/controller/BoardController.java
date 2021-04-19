package jun.spring.prj.board1.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;
import jun.spring.prj.board1.service.BoardService;
import jun.spring.prj.dto.DeptDTO;

@Controller("boardController")
@RequestMapping("/")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping("boardList")
	public ModelAndView test() throws ClassNotFoundException, SQLException {
		List<BoardViewEntity> list = service.getList(1, "writer_id", "한준");
		if(list.isEmpty()) {
			System.out.println("출력할 데이터x");
		}
		else
		{
			for (BoardViewEntity entity : list)
			{
				System.out.println("11");
				System.out.println(entity);
			}
		}
		return null;
	}
}
