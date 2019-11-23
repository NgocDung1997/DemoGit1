package fa.appcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.Skill;
import fa.appcode.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService{
	
	@Autowired
	SkillRepository skillRepository;

	@Override
	public List<Skill> findAllSkill() {
		return skillRepository.findAll();
	}

}
