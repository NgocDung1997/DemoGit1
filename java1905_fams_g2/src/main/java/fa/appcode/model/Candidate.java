package fa.appcode.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Candidate",schema="Group_2")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_id")
	private int candidateId;
	
	@Column(name="application_date")
	private LocalDate applicationDate;
	
	@Column(name="remark")
	private String remark;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="candidate_profile_id")
	private CandidateProfile candidateProfile;
	
	@OneToMany(mappedBy = "candidate")
	private Set<EntryTest> entryTests;

	@OneToOne
	@JoinColumn(name="candidate_id")
	private Offer offer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "channel_id")
	private Channel channel;
	
	@OneToMany(mappedBy = "candidate")
	private Set<Interview> interviews;

	public Candidate(int candidateId, LocalDate applicationDate, String remark, CandidateProfile candidateProfile,
			Set<EntryTest> entryTests, Offer offer, Channel channel, Set<Interview> interviews) {
		super();
		this.candidateId = candidateId;
		this.applicationDate = applicationDate;
		this.remark = remark;
		this.candidateProfile = candidateProfile;
		this.entryTests = entryTests;
		this.offer = offer;
		this.channel = channel;
		this.interviews = interviews;
	}

	public Candidate() {
		super();
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CandidateProfile getCandidateProfile() {
		return candidateProfile;
	}

	public void setCandidateProfile(CandidateProfile candidateProfile) {
		this.candidateProfile = candidateProfile;
	}

	public Set<EntryTest> getEntryTests() {
		return entryTests;
	}

	public void setEntryTests(Set<EntryTest> entryTests) {
		this.entryTests = entryTests;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Set<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(Set<Interview> interviews) {
		this.interviews = interviews;
	}
	
	
}
