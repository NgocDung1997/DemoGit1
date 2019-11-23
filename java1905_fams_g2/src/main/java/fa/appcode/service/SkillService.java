package fa.appcode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fa.appcode.model.Skill;

@Service
public interface SkillService {

	List<Skill> findAllSkill();
}
