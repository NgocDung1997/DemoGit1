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
@Table(name="Location",schema="Group_2")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="site_id")
	private int siteId;
	
	@Column(name="site_name")
	private String siteName;
	@Column(name="remark")
	private String remark;
	
	@OneToMany(mappedBy = "location")
	private Set<CandidateProfile> candidateProfiles;

	public Location(int siteId, String siteName, String remark, Set<CandidateProfile> candidateProfiles) {
		super();
		this.siteId = siteId;
		this.siteName = siteName;
		this.remark = remark;
		this.candidateProfiles = candidateProfiles;
	}

	public Location() {
		super();
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
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
