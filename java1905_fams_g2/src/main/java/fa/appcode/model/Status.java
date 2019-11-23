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
@Table(name="Status",schema ="Group_2")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	@Column(name="status_name")
	private String statusName;
	@Column(name="remark")
	private String remark;
	@OneToMany(mappedBy = "status")
	private Set<CandidateProfile> candidateProfiles;
	public Status(int statusId, String statusName, String remark, Set<CandidateProfile> candidateProfiles) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.remark = remark;
		this.candidateProfiles = candidateProfiles;
	}
	public Status() {
		super();
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
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
