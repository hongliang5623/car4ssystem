package cn.pdsu.bs.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ApplyRepare entity. @author MyEclipse Persistence Tools
 */

public class ApplyRepare implements java.io.Serializable {

	// Fields

	private Integer applyRepareId;
	private User userByShenpiName;
	private User userByApplyRepareName;
	private Carpackage carpackage;
	private String applyRepareTime;
	private String applyBaoxiuTime;
	private String repareReasons;
	private String repareNeedtime;
	private String reparePlan;
	private Integer applyRepareState;
	private String shenpiAdvice;
	private String applyResult;
	private String applyReadState;
	private Set applyToolses = new HashSet(0);

	// Constructors

	/** default constructor */
	public ApplyRepare() {
	}

	/** minimal constructor */
	public ApplyRepare(User userByApplyRepareName, Carpackage carpackage,
			String applyRepareTime, String repareNeedtime,
			Integer applyRepareState) {
		this.userByApplyRepareName = userByApplyRepareName;
		this.carpackage = carpackage;
		this.applyRepareTime = applyRepareTime;
		this.repareNeedtime = repareNeedtime;
		this.applyRepareState = applyRepareState;
	}

	/** full constructor */
	public ApplyRepare(User userByShenpiName, User userByApplyRepareName,
			Carpackage carpackage, String applyRepareTime,
			String applyBaoxiuTime, String repareReasons,
			String repareNeedtime, String reparePlan, Integer applyRepareState,
			String shenpiAdvice, String applyResult, String applyReadState,
			Set applyToolses) {
		this.userByShenpiName = userByShenpiName;
		this.userByApplyRepareName = userByApplyRepareName;
		this.carpackage = carpackage;
		this.applyRepareTime = applyRepareTime;
		this.applyBaoxiuTime = applyBaoxiuTime;
		this.repareReasons = repareReasons;
		this.repareNeedtime = repareNeedtime;
		this.reparePlan = reparePlan;
		this.applyRepareState = applyRepareState;
		this.shenpiAdvice = shenpiAdvice;
		this.applyResult = applyResult;
		this.applyReadState = applyReadState;
		this.applyToolses = applyToolses;
	}

	// Property accessors

	public Integer getApplyRepareId() {
		return this.applyRepareId;
	}

	public void setApplyRepareId(Integer applyRepareId) {
		this.applyRepareId = applyRepareId;
	}

	public User getUserByShenpiName() {
		return this.userByShenpiName;
	}

	public void setUserByShenpiName(User userByShenpiName) {
		this.userByShenpiName = userByShenpiName;
	}

	public User getUserByApplyRepareName() {
		return this.userByApplyRepareName;
	}

	public void setUserByApplyRepareName(User userByApplyRepareName) {
		this.userByApplyRepareName = userByApplyRepareName;
	}

	public Carpackage getCarpackage() {
		return this.carpackage;
	}

	public void setCarpackage(Carpackage carpackage) {
		this.carpackage = carpackage;
	}

	public String getApplyRepareTime() {
		return this.applyRepareTime;
	}

	public void setApplyRepareTime(String applyRepareTime) {
		this.applyRepareTime = applyRepareTime;
	}

	public String getApplyBaoxiuTime() {
		return this.applyBaoxiuTime;
	}

	public void setApplyBaoxiuTime(String applyBaoxiuTime) {
		this.applyBaoxiuTime = applyBaoxiuTime;
	}

	public String getRepareReasons() {
		return this.repareReasons;
	}

	public void setRepareReasons(String repareReasons) {
		this.repareReasons = repareReasons;
	}

	public String getRepareNeedtime() {
		return this.repareNeedtime;
	}

	public void setRepareNeedtime(String repareNeedtime) {
		this.repareNeedtime = repareNeedtime;
	}

	public String getReparePlan() {
		return this.reparePlan;
	}

	public void setReparePlan(String reparePlan) {
		this.reparePlan = reparePlan;
	}

	public Integer getApplyRepareState() {
		return this.applyRepareState;
	}

	public void setApplyRepareState(Integer applyRepareState) {
		this.applyRepareState = applyRepareState;
	}

	public String getShenpiAdvice() {
		return this.shenpiAdvice;
	}

	public void setShenpiAdvice(String shenpiAdvice) {
		this.shenpiAdvice = shenpiAdvice;
	}

	public String getApplyResult() {
		return this.applyResult;
	}

	public void setApplyResult(String applyResult) {
		this.applyResult = applyResult;
	}

	public String getApplyReadState() {
		return this.applyReadState;
	}

	public void setApplyReadState(String applyReadState) {
		this.applyReadState = applyReadState;
	}

	public Set getApplyToolses() {
		return this.applyToolses;
	}

	public void setApplyToolses(Set applyToolses) {
		this.applyToolses = applyToolses;
	}

}