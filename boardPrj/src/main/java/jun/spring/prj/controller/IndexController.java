package jun.spring.prj.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("indexController")
public class IndexController {
	
	@GetMapping(value="/")
	public ModelAndView index(HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("root.index");
		Cookie cookie =new Cookie("view",null); 	
		cookie.setComment("게시글 조회 확인");				
		cookie.setMaxAge(60*60*24*365);	
		response.addCookie(cookie);
		return mv;
	}
}
