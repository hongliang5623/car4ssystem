package cn.pdsu.bs.domain;

/**
 * ApplyOut entity. @author MyEclipse Persistence Tools
 */

public class ApplyOut implements java.io.Serializable {

	// Fields

	private Integer applyOutId;
	private User userByApplyOutNameid;
	private User userByShenpiOutNameid;
	private String applyOutTime;
	private String applyOutDestination;
	private String applyOutNeedtimes;
	private String applyOutReasons;
	private Integer applyOutState;
	private String applyOutNeedtools;
	private String shenpiOutAdvice;
	private String shenpiReuslt;
	private String applyReadState;

	// Constructors

	/** default constructor */
	public ApplyOut() {
	}

	/** minimal constructor */
	public ApplyOut(String applyOutTime, String applyOutDestination,
			String applyOutNeedtimes) {
		this.applyOutTime = applyOutTime;
		this.applyOutDestination = applyOutDestination;
		this.applyOutNeedtimes = applyOutNeedtimes;
	}

	/** full constructor */
	public ApplyOut(User userByApplyOutNameid, User userByShenpiOutNameid,
			String applyOutTime, String applyOutDestination,
			String applyOutNeedtimes, String applyOutReasons,
			Integer applyOutState, String applyOutNeedtools,
			String shenpiOutAdvice, String shenpiReuslt, String applyReadState) {
		this.userByApplyOutNameid = userByApplyOutNameid;
		this.userByShenpiOutNameid = userByShenpiOutNameid;
		this.applyOutTime = applyOutTime;
		this.applyOutDestination = applyOutDestination;
		this.applyOutNeedtimes = applyOutNeedtimes;
		this.applyOutReasons = applyOutReasons;
		this.applyOutState = applyOutState;
		this.applyOutNeedtools = applyOutNeedtools;
		this.shenpiOutAdvice = shenpiOutAdvice;
		this.shenpiReuslt = shenpiReuslt;
		this.applyReadState = applyReadState;
	}

	// Property accessors

	public Integer getApplyOutId() {
		return this.applyOutId;
	}

	public void setApplyOutId(Integer applyOutId) {
		this.applyOutId = applyOutId;
	}

	public User getUserByApplyOutNameid() {
		return this.userByApplyOutNameid;
	}

	public void setUserByApplyOutNameid(User userByApplyOutNameid) {
		this.userByApplyOutNameid = userByApplyOutNameid;
	}

	public User getUserByShenpiOutNameid() {
		return this.userByShenpiOutNameid;
	}

	public void setUserByShenpiOutNameid(User userByShenpiOutNameid) {
		this.userByShenpiOutNameid = userByShenpiOutNameid;
	}

	public String getApplyOutTime() {
		return this.applyOutTime;
	}

	public void setApplyOutTime(String applyOutTime) {
		this.applyOutTime = applyOutTime;
	}

	public String getApplyOutDestination() {
		return this.applyOutDestination;
	}

	public void setApplyOutDestination(String applyOutDestination) {
		this.applyOutDestination = applyOutDestination;
	}

	public String getApplyOutNeedtimes() {
		return this.applyOutNeedtimes;
	}

	public void setApplyOutNeedtimes(String applyOutNeedtimes) {
		this.applyOutNeedtimes = applyOutNeedtimes;
	}

	public String getApplyOutReasons() {
		return this.applyOutReasons;
	}

	public void setApplyOutReasons(String applyOutReasons) {
		this.applyOutReasons = applyOutReasons;
	}

	public Integer getApplyOutState() {
		return this.applyOutState;
	}

	public void setApplyOutState(Integer applyOutState) {
		this.applyOutState = applyOutState;
	}

	public String getApplyOutNeedtools() {
		return this.applyOutNeedtools;
	}

	public void setApplyOutNeedtools(String applyOutNeedtools) {
		this.applyOutNeedtools = applyOutNeedtools;
	}

	public String getShenpiOutAdvice() {
		return this.shenpiOutAdvice;
	}

	public void setShenpiOutAdvice(String shenpiOutAdvice) {
		this.shenpiOutAdvice = shenpiOutAdvice;
	}

	public String getShenpiReuslt() {
		return this.shenpiReuslt;
	}

	public void setShenpiReuslt(String shenpiReuslt) {
		this.shenpiReuslt = shenpiReuslt;
	}

	public String getApplyReadState() {
		return this.applyReadState;
	}

	public void setApplyReadState(String applyReadState) {
		this.applyReadState = applyReadState;
	}

}