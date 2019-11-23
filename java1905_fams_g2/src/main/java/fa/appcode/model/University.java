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
@Table(name="University",schema="Group_2")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="university_id")
	private int universityId;
	
	@Column(name="university_name")
	private String universityName;
	@Column(name="remark")
	private String remark;
	
	@OneToMany(mappedBy = "university")
	private Set<CandidateProfile> candidateProfiles;

	
	public University() {
		super();
	}


	public University(int universityId, String universityName, String remark, Set<CandidateProfile> candidateProfiles) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.remark = remark;
		this.candidateProfiles = candidateProfiles;
	}


	public int getUniversityId() {
		return universityId;
	}


	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}


	public String getUniversityName() {
		return universityName;
	}


	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Set<CandidateProfile> getCandidateProfiles() {
		return candidateProfiles;
	}


	public void setCandidateProfiles(Set<CandidateProfile> candidateProfiles) {
		this.candidateProfiles = candidateProfiles;
	}

		
}
