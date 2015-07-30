package cn.pdsu.bs.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Carowner entity. @author MyEclipse Persistence Tools
 */

public class Carowner implements java.io.Serializable {

	// Fields

	private Integer ownerId;
	private Carpackage carpackage;
	private String owerName;
	private String owerPwd;
	private String owerTruename;
	private String owerCartype;
	private String owerSex;
	private String owerJop;
	private String owerTelephone;
	private String owerAddr;
	private String packEffecttime;
	private String accountLeft;
	private Set orders = new HashSet(0);
	private Set baoyangs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Carowner() {
	}

	/** minimal constructor */
	public Carowner(String owerTruename, String owerCartype,
			String owerTelephone, String owerAddr) {
		this.owerTruename = owerTruename;
		this.owerCartype = owerCartype;
		this.owerTelephone = owerTelephone;
		this.owerAddr = owerAddr;
	}

	/** full constructor */
	public Carowner(Carpackage carpackage, String owerName, String owerPwd,
			String owerTruename, String owerCartype, String owerSex,
			String owerJop, String owerTelephone, String owerAddr,
			String packEffecttime, String accountLeft, Set orders, Set baoyangs) {
		this.carpackage = carpackage;
		this.owerName = owerName;
		this.owerPwd = owerPwd;
		this.owerTruename = owerTruename;
		this.owerCartype = owerCartype;
		this.owerSex = owerSex;
		this.owerJop = owerJop;
		this.owerTelephone = owerTelephone;
		this.owerAddr = owerAddr;
		this.packEffecttime = packEffecttime;
		this.accountLeft = accountLeft;
		this.orders = orders;
		this.baoyangs = baoyangs;
	}

	// Property accessors

	public Integer getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Carpackage getCarpackage() {
		return this.carpackage;
	}

	public void setCarpackage(Carpackage carpackage) {
		this.carpackage = carpackage;
	}

	public String getOwerName() {
		return this.owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	public String getOwerPwd() {
		return this.owerPwd;
	}

	public void setOwerPwd(String owerPwd) {
		this.owerPwd = owerPwd;
	}

	public String getOwerTruename() {
		return this.owerTruename;
	}

	public void setOwerTruename(String owerTruename) {
		this.owerTruename = owerTruename;
	}

	public String getOwerCartype() {
		return this.owerCartype;
	}

	public void setOwerCartype(String owerCartype) {
		this.owerCartype = owerCartype;
	}

	public String getOwerSex() {
		return this.owerSex;
	}

	public void setOwerSex(String owerSex) {
		this.owerSex = owerSex;
	}

	public String getOwerJop() {
		return this.owerJop;
	}

	public void setOwerJop(String owerJop) {
		this.owerJop = owerJop;
	}

	public String getOwerTelephone() {
		return this.owerTelephone;
	}

	public void setOwerTelephone(String owerTelephone) {
		this.owerTelephone = owerTelephone;
	}

	public String getOwerAddr() {
		return this.owerAddr;
	}

	public void setOwerAddr(String owerAddr) {
		this.owerAddr = owerAddr;
	}

	public String getPackEffecttime() {
		return this.packEffecttime;
	}

	public void setPackEffecttime(String packEffecttime) {
		this.packEffecttime = packEffecttime;
	}

	public String getAccountLeft() {
		return this.accountLeft;
	}

	public void setAccountLeft(String accountLeft) {
		this.accountLeft = accountLeft;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getBaoyangs() {
		return this.baoyangs;
	}

	public void setBaoyangs(Set baoyangs) {
		this.baoyangs = baoyangs;
	}

}