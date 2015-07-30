package cn.pdsu.bs.domain;

/**
 * ApplyTools entity. @author MyEclipse Persistence Tools
 */

public class ApplyTools implements java.io.Serializable {

	// Fields

	private Integer applyToolsId;
	private User userByShenpiName;
	private ApplyRepare applyRepare;
	private User userByApplyToolsName;
	private String repareshenpi;
	private String appleToolsTime;
	private String applyTools;
	private Integer applyToolsState;
	private String applyToolsResults;
	private String applyToolsNote;
	private String applyReadState;

	// Constructors

	/** default constructor */
	public ApplyTools() {
	}

	/** minimal constructor */
	public ApplyTools(User userByApplyToolsName, String applyTools,
			Integer applyToolsState) {
		this.userByApplyToolsName = userByApplyToolsName;
		this.applyTools = applyTools;
		this.applyToolsState = applyToolsState;
	}

	/** full constructor */
	public ApplyTools(User userByShenpiName, ApplyRepare applyRepare,
			User userByApplyToolsName, String repareshenpi,
			String appleToolsTime, String applyTools, Integer applyToolsState,
			String applyToolsResults, String applyToolsNote,
			String applyReadState) {
		this.userByShenpiName = userByShenpiName;
		this.applyRepare = applyRepare;
		this.userByApplyToolsName = userByApplyToolsName;
		this.repareshenpi = repareshenpi;
		this.appleToolsTime = appleToolsTime;
		this.applyTools = applyTools;
		this.applyToolsState = applyToolsState;
		this.applyToolsResults = applyToolsResults;
		this.applyToolsNote = applyToolsNote;
		this.applyReadState = applyReadState;
	}

	// Property accessors

	public Integer getApplyToolsId() {
		return this.applyToolsId;
	}

	public void setApplyToolsId(Integer applyToolsId) {
		this.applyToolsId = applyToolsId;
	}

	public User getUserByShenpiName() {
		return this.userByShenpiName;
	}

	public void setUserByShenpiName(User userByShenpiName) {
		this.userByShenpiName = userByShenpiName;
	}

	public ApplyRepare getApplyRepare() {
		return this.applyRepare;
	}

	public void setApplyRepare(ApplyRepare applyRepare) {
		this.applyRepare = applyRepare;
	}

	public User getUserByApplyToolsName() {
		return this.userByApplyToolsName;
	}

	public void setUserByApplyToolsName(User userByApplyToolsName) {
		this.userByApplyToolsName = userByApplyToolsName;
	}

	public String getRepareshenpi() {
		return this.repareshenpi;
	}

	public void setRepareshenpi(String repareshenpi) {
		this.repareshenpi = repareshenpi;
	}

	public String getAppleToolsTime() {
		return this.appleToolsTime;
	}

	public void setAppleToolsTime(String appleToolsTime) {
		this.appleToolsTime = appleToolsTime;
	}

	public String getApplyTools() {
		return this.applyTools;
	}

	public void setApplyTools(String applyTools) {
		this.applyTools = applyTools;
	}

	public Integer getApplyToolsState() {
		return this.applyToolsState;
	}

	public void setApplyToolsState(Integer applyToolsState) {
		this.applyToolsState = applyToolsState;
	}

	public String getApplyToolsResults() {
		return this.applyToolsResults;
	}

	public void setApplyToolsResults(String applyToolsResults) {
		this.applyToolsResults = applyToolsResults;
	}

	public String getApplyToolsNote() {
		return this.applyToolsNote;
	}

	public void setApplyToolsNote(String applyToolsNote) {
		this.applyToolsNote = applyToolsNote;
	}

	public String getApplyReadState() {
		return this.applyReadState;
	}

	public void setApplyReadState(String applyReadState) {
		this.applyReadState = applyReadState;
	}

}