package fa.appcode.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fa.appcode.model.Candidate;
import fa.appcode.model.Channel;
import fa.appcode.model.Faculity;
import fa.appcode.model.Skill;
import fa.appcode.model.University;
import fa.appcode.service.CandidateService;
import fa.appcode.service.ChannelService;
import fa.appcode.service.FaculityService;
import fa.appcode.service.SkillService;
import fa.appcode.service.UniversityService;


@Controller
public class CandidateController {


	
	@Autowired
	CandidateService candidateService;
	
	@Autowired
	ChannelService channelService;
	
	@Autowired
	SkillService skillService;
	
	@Autowired
	FaculityService faculityService;
	
	@Autowired
	UniversityService universityService;
	
	@GetMapping(value = "/add-form")
	String getAddForm(Model model) {
		List<Channel> channels = channelService.findAllChannel();
		List<Skill> skills = skillService.findAllSkill();
		List<Faculity> faculities = faculityService.findAllFaculity();
		List<University> universities = universityService.findAllUniversity();
		
		model.addAttribute("channels", channels);
		model.addAttribute("skills", skills);
		model.addAttribute("faculities", faculities);
		model.addAttribute("universities", universities);
		
		return "views/contents/add-candidate";
	}
	
	@GetMapping(value = "/candidate-listing")
	String goToCandidateListing(ModelMap model) {
		List<Candidate> candidates = candidateService.findAllCandidate();
		model.addAttribute("candidates", candidates);
		return "views/contents/candidate-listing";
	}
	
	@GetMapping(value = "/index")
	String getIndex() {
		return "views/contents/index";
	}
	
	@RequestMapping(value = "/add-candidate", method = RequestMethod.POST)
	String saveCandidate() {
		return "";

	}
}
