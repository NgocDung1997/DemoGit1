package fa.appcode.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Offer",schema="Group_2")
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="offer_id")
	private int offerId;
	
	@Column(name="job_rank")
	private String jobRank;
	@Column(name="technology")
	private String technology;
	@Column(name="contract_type")
	private String contractType;
	@Column(name="offer_salary")
	private Double offerSalary;
	@Column(name="remark")
	private String remark;
	
	@OneToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;

	public Offer(int offerId, String jobRank, String technology, String contractType, Double offerSalary, String remark,
			Candidate candidate) {
		super();
		this.offerId = offerId;
		this.jobRank = jobRank;
		this.technology = technology;
		this.contractType = contractType;
		this.offerSalary = offerSalary;
		this.remark = remark;
		this.candidate = candidate;
	}

	public Offer() {
		super();
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

	public String getJobRank() {
		return jobRank;
	}

	public void setJobRank(String jobRank) {
		this.jobRank = jobRank;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Double getOfferSalary() {
		return offerSalary;
	}

	public void setOfferSalary(Double offerSalary) {
		this.offerSalary = offerSalary;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}	
}
