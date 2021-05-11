package jun.spring.prj.board1.common;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 다운로드 링크 클릭시 작동하는 컨트롤러
@Controller("commonController")
public class CommonController {
	
	@Autowired
	private ServletContext context;
	private static final String path = "/static/upload";
	
	@RequestMapping(value="/file/download")
	public ModelAndView fileDownload(String filename, ModelAndView mv ) throws UnsupportedEncodingException {
		
		String realPath = context.getRealPath(path) + File.separator + filename;
		File file = new File(realPath);
//		DownloadView로 이동
		mv.addObject("downloadFile", file);
		mv.setViewName("downloadView");
		return mv;
	}
}
