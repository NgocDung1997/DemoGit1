package fa.appcode.model;

import java.io.File;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CandidateProfile", schema = "Group_2")
public class CandidateProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "candidate_profile_id")
	private int candidateProfileId;

	@Column(name = "graduation_year")
	private LocalDate graduationYear;

	@OneToOne
	@JoinColumn(name = "candidate__id")
	private Candidate candidate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "skill_id")
	private Skill skill;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "faculity_id")
	private Faculity faculity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "university_id")
	private University university;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id")
	private Location location;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id")
	private Status status;

	@Column(name = "type")
	private String type;

	@Column(name = "foreign_language")
	private String foreignLanguage;

	@Column(name = "level")
	private String level;

	@Column(name = "cv")
	private String cv;

	@Column(name = "allocation_status")
	private boolean allocationStatus;

	@Column(name = "note")
	private String note;

	@Column(name = "history")
	private String history;
	
	private String account;

	@Column(name = "remark")
	private String remark;
	
	@OneToOne
	@JoinColumn(name = "profile_id")
	private Profile profile;

	public CandidateProfile(int candidateProfileId, LocalDate graduationYear, Candidate candidate, Skill skill,
			Faculity faculity, University university, Location location, Status status, String type,
			String foreignLanguage, String level, String cv, boolean allocationStatus, String note, String history,
			String remark) {
		super();
		this.candidateProfileId = candidateProfileId;
		this.graduationYear = graduationYear;
		this.candidate = candidate;
		this.skill = skill;
		this.faculity = faculity;
		this.university = university;
		this.location = location;
		this.status = status;
		this.type = type;
		this.foreignLanguage = foreignLanguage;
		this.level = level;
		this.cv = cv;
		this.allocationStatus = allocationStatus;
		this.note = note;
		this.history = history;
		this.remark = remark;
	}

	public int getCandidateProfileId() {
		return candidateProfileId;
	}

	public void setCandidateProfileId(int candidateProfileId) {
		this.candidateProfileId = candidateProfileId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Faculity getFaculity() {
		return faculity;
	}

	public void setFaculity(Faculity faculity) {
		this.faculity = faculity;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getForeignLanguage() {
		return foreignLanguage;
	}

	public void setForeignLanguage(String foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public boolean isAllocationStatus() {
		return allocationStatus;
	}

	public void setAllocationStatus(boolean allocationStatus) {
		this.allocationStatus = allocationStatus;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CandidateProfile() {
		super();
	}

	public LocalDate getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(LocalDate graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
