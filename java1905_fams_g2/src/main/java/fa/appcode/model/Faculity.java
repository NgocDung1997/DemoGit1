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
@Table(name="Faculity",schema="Group_2")
public class Faculity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="faculity_id")
	private int faculityId;
	
	@Column(name="faculity_name")
	private String faculityName;
	
	@Column(name="remark")
	private String remark;

	@OneToMany(mappedBy = "faculity")
	private Set<CandidateProfile> candidateProfiles;

	public Faculity(int faculityId, String faculityName, String remark, Set<CandidateProfile> candidateProfiles) {
		super();
		this.faculityId = faculityId;
		this.faculityName = faculityName;
		this.remark = remark;
		this.candidateProfiles = candidateProfiles;
	}

	public Faculity() {
		super();
	}

	public int getFaculityId() {
		return faculityId;
	}

	public void setFaculityId(int faculityId) {
		this.faculityId = faculityId;
	}

	public String getFaculityName() {
		return faculityName;
	}

	public void setFaculityName(String faculityName) {
		this.faculityName = faculityName;
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
