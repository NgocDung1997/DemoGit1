package fa.appcode.model;

import java.time.LocalDate;
import java.time.LocalTime;
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
import javax.persistence.Table;

@Entity
@Table(name="Interview",schema="Group_2")
public class Interview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="interview_id")
	private int interviewId;
	
	@Column(name="interview_time")
	private int time;
	
	@Column(name="interview_date")
	private LocalDate date;
	
	@Column(name="interviewer")
	private String interviewer;
	@Column(name="comments")
	private String comments;
	@Column(name="result")
	private boolean result;
	@Column(name="remark")
	private String remark;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="candidate_id")
	private Candidate candidate;

	public Interview(int interviewId, int time, LocalDate date, String interviewer, String comments,
			boolean result, String remark, Candidate candidate) {
		super();
		this.interviewId = interviewId;
		this.time = time;
		this.date = date;
		this.interviewer = interviewer;
		this.comments = comments;
		this.result = result;
		this.remark = remark;
		this.candidate = candidate;
	}

	public Interview() {
		super();
	}

	public int getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
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
