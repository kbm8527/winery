package kr.co.winery.controller;

import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class MainController {

	

	
	@GetMapping(value={"index"})
	public String index() {
		
	
		
		return "/index";
	}
}
