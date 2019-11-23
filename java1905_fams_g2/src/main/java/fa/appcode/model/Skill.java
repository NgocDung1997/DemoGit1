package fa.appcode.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Skill",schema="Group_2")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillId;
	
	@Column(name="skill_name")
	private String skillName;
	
	@OneToMany(mappedBy = "skill")
	private Set<CandidateProfile> candidateProfiles;

	public Skill(int skillId, String skillName, Set<CandidateProfile> candidateProfiles) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.candidateProfiles = candidateProfiles;
	}

	public Skill() {
		super();
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Set<CandidateProfile> getCandidateProfiles() {
		return candidateProfiles;
	}

	public void setCandidateProfiles(Set<CandidateProfile> candidateProfiles) {
		this.candidateProfiles = candidateProfiles;
	}

}
