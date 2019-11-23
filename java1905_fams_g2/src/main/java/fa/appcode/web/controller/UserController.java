package fa.appcode.web.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import fa.appcode.model.CandidateProfile;
import fa.appcode.service.CandidateProfileService;
import fa.appcode.service.CandidateProfileServiceImpl;
import fa.appcode.service.CandidateService;
import fa.appcode.service.CandidateServiceImpl;
import fa.appcode.service.UserService;
import fa.appcode.service.UserServiceImpl;
@SpringBootApplication
@Controller
public class UserController {
	@Autowired  
	private CandidateService candidateService;
//	@Autowired
//	private ProfileService profileService;
	@Autowired
	UserService userService=new UserServiceImpl();
	@Autowired
	CandidateProfileService candidateProfileService=new CandidateProfileServiceImpl();
	
	@GetMapping("/login")
	public String login() {
		System.out.println(candidateProfileService.countCandidate());
		return "/views/contents/login-page";
	}
	
	@GetMapping("/goIndex")
	public String goIndex(Authentication auth) {
		return "/views/contents/index";
		}

	public String goLandingPage() {		
		return "/views/contents/viewdetail-result.html";

	}
	
	@GetMapping("/logout")
	public String logout() {
		return "/views/contents/login-page";
	}
	
	@GetMapping("/goAdminPage")
	public String goAdminPage() {
		return "/views/contents/admin-page";
	}
	
	@GetMapping("/goRecPage")
	public String goRecPage() {
		return "/views/contents/rec-page";
	}
	
	
	
	
}