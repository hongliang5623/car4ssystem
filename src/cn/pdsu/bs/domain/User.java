package cn.pdsu.bs.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String password;
	private String truename;
	private Integer right1;
	private String department;
	private String userNote;
	private Set applyToolsesForShenpiName = new HashSet(0);
	private Set baoyangs = new HashSet(0);
	private Set applyToolsesForApplyToolsName = new HashSet(0);
	private Set applyReparesForShenpiName = new HashSet(0);
	private Set applyReparesForApplyRepareName = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set applyOutsForApplyOutNameid = new HashSet(0);
	private Set carpackages = new HashSet(0);
	private Set applyOutsForShenpiOutNameid = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username) {
		this.username = username;
	}

	/** full constructor */
	public User(String username, String password, String truename,
			Integer right1, String department, String userNote,
			Set applyToolsesForShenpiName, Set baoyangs,
			Set applyToolsesForApplyToolsName, Set applyReparesForShenpiName,
			Set applyReparesForApplyRepareName, Set orders,
			Set applyOutsForApplyOutNameid, Set carpackages,
			Set applyOutsForShenpiOutNameid) {
		this.username = username;
		this.password = password;
		this.truename = truename;
		this.right1 = right1;
		this.department = department;
		this.userNote = userNote;
		this.applyToolsesForShenpiName = applyToolsesForShenpiName;
		this.baoyangs = baoyangs;
		this.applyToolsesForApplyToolsName = applyToolsesForApplyToolsName;
		this.applyReparesForShenpiName = applyReparesForShenpiName;
		this.applyReparesForApplyRepareName = applyReparesForApplyRepareName;
		this.orders = orders;
		this.applyOutsForApplyOutNameid = applyOutsForApplyOutNameid;
		this.carpackages = carpackages;
		this.applyOutsForShenpiOutNameid = applyOutsForShenpiOutNameid;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTruename() {
		return this.truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public Integer getRight1() {
		return this.right1;
	}

	public void setRight1(Integer right1) {
		this.right1 = right1;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUserNote() {
		return this.userNote;
	}

	public void setUserNote(String userNote) {
		this.userNote = userNote;
	}

	public Set getApplyToolsesForShenpiName() {
		return this.applyToolsesForShenpiName;
	}

	public void setApplyToolsesForShenpiName(Set applyToolsesForShenpiName) {
		this.applyToolsesForShenpiName = applyToolsesForShenpiName;
	}

	public Set getBaoyangs() {
		return this.baoyangs;
	}

	public void setBaoyangs(Set baoyangs) {
		this.baoyangs = baoyangs;
	}

	public Set getApplyToolsesForApplyToolsName() {
		return this.applyToolsesForApplyToolsName;
	}

	public void setApplyToolsesForApplyToolsName(
			Set applyToolsesForApplyToolsName) {
		this.applyToolsesForApplyToolsName = applyToolsesForApplyToolsName;
	}

	public Set getApplyReparesForShenpiName() {
		return this.applyReparesForShenpiName;
	}

	public void setApplyReparesForShenpiName(Set applyReparesForShenpiName) {
		this.applyReparesForShenpiName = applyReparesForShenpiName;
	}

	public Set getApplyReparesForApplyRepareName() {
		return this.applyReparesForApplyRepareName;
	}

	public void setApplyReparesForApplyRepareName(
			Set applyReparesForApplyRepareName) {
		this.applyReparesForApplyRepareName = applyReparesForApplyRepareName;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getApplyOutsForApplyOutNameid() {
		return this.applyOutsForApplyOutNameid;
	}

	public void setApplyOutsForApplyOutNameid(Set applyOutsForApplyOutNameid) {
		this.applyOutsForApplyOutNameid = applyOutsForApplyOutNameid;
	}

	public Set getCarpackages() {
		return this.carpackages;
	}

	public void setCarpackages(Set carpackages) {
		this.carpackages = carpackages;
	}

	public Set getApplyOutsForShenpiOutNameid() {
		return this.applyOutsForShenpiOutNameid;
	}

	public void setApplyOutsForShenpiOutNameid(Set applyOutsForShenpiOutNameid) {
		this.applyOutsForShenpiOutNameid = applyOutsForShenpiOutNameid;
	}

}