package fa.appcode.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Channel",schema="Group_2")
public class Channel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="channel_id")
	private int channelId;
	
	@Column(name="channel_name")
	private String channelName;
	
	@Column(name="remark")
	private String remark;
	
	@OneToMany(mappedBy = "channel")
	private Set<Candidate> candidates;

	public Channel(int channelId, String channelName, String remark, Set<Candidate> candidates) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.remark = remark;
		this.candidates = candidates;
	}

	public Channel() {
		super();
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(Set<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	
	
}
