package fa.appcode.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EntryTest",schema="Group_2")
public class EntryTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="entry_test_id")
	private int entryTestId;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@Column(name="entry_test_date")
	private LocalDate entryTestDate;
	
	@Column(name="entry_test_time")
	private int entryTestTime;
	
	@Column(name="language_valuator")
	private String languageValuator;
	@Column(name="language_result")
	private Double languageResult;
	@Column(name="technical_valuator")
	private String technicalValuator;
	@Column(name="technical_result")
	private Double technicalResult;
	@Column(name="result")
	private boolean result;
	@Column(name="remark")
	private String remark;
	public EntryTest(int entryTestId, Candidate candidate, LocalDate entryTestDate, int entryTestTime,
			String languageValuator, Double languageResult, String technicalValuator, Double technicalResult,
			boolean result, String remark) {
		super();
		this.entryTestId = entryTestId;
		this.candidate = candidate;
		this.entryTestDate = entryTestDate;
		this.entryTestTime = entryTestTime;
		this.languageValuator = languageValuator;
		this.languageResult = languageResult;
		this.technicalValuator = technicalValuator;
		this.technicalResult = technicalResult;
		this.result = result;
		this.remark = remark;
	}
	public EntryTest() {
		// TODO Auto-generated constructor stub
	}
	public int getEntryTestId() {
		return entryTestId;
	}
	public void setEntryTestId(int entryTestId) {
		this.entryTestId = entryTestId;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public LocalDate getEntryTestDate() {
		return entryTestDate;
	}
	public void setEntryTestDate(LocalDate entryTestDate) {
		this.entryTestDate = entryTestDate;
	}
	public int getEntryTestTime() {
		return entryTestTime;
	}
	public void setEntryTestTime(int entryTestTime) {
		this.entryTestTime = entryTestTime;
	}
	public String getLanguageValuator() {
		return languageValuator;
	}
	public void setLanguageValuator(String languageValuator) {
		this.languageValuator = languageValuator;
	}
	public Double getLanguageResult() {
		return languageResult;
	}
	public void setLanguageResult(Double languageResult) {
		this.languageResult = languageResult;
	}
	public String getTechnicalValuator() {
		return technicalValuator;
	}
	public void setTechnicalValuator(String technicalValuator) {
		this.technicalValuator = technicalValuator;
	}
	public Double getTechnicalResult() {
		return technicalResult;
	}
	public void setTechnicalResult(Double technicalResult) {
		this.technicalResult = technicalResult;
	}
	public boolean getResult() {
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
	
	
}
