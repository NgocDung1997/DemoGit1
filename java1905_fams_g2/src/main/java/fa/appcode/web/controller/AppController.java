package fa.appcode.web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping(value = { "/", "index" })
	public String goToIndex() {
		return "/views/contents/index";
	}
	
	@GetMapping(value = "/landing-page")
	String getIndex() {
		return "views/contents/landing-page";
	}
}
