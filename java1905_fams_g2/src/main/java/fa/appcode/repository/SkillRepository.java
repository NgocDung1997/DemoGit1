package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Skill;
@Repository
public interface SkillRepository extends JpaRepository<Skill, String>{

}
