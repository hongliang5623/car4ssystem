package cn.pdsu.bs.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Carpackage entity. @author MyEclipse Persistence Tools
 */

public class Carpackage implements java.io.Serializable {

	// Fields

	private Integer packageId;
	private User user;
	private String packageName;
	private String packageDetails;
	private String packageTime;
	private Integer packageCost;
	private Set carowners = new HashSet(0);
	private Set applyRepares = new HashSet(0);

	// Constructors

	/** default constructor */
	public Carpackage() {
	}

	/** full constructor */
	public Carpackage(User user, String packageName, String packageDetails,
			String packageTime, Integer packageCost, Set carowners,
			Set applyRepares) {
		this.user = user;
		this.packageName = packageName;
		this.packageDetails = packageDetails;
		this.packageTime = packageTime;
		this.packageCost = packageCost;
		this.carowners = carowners;
		this.applyRepares = applyRepares;
	}

	// Property accessors

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageDetails() {
		return this.packageDetails;
	}

	public void setPackageDetails(String packageDetails) {
		this.packageDetails = packageDetails;
	}

	public String getPackageTime() {
		return this.packageTime;
	}

	public void setPackageTime(String packageTime) {
		this.packageTime = packageTime;
	}

	public Integer getPackageCost() {
		return this.packageCost;
	}

	public void setPackageCost(Integer packageCost) {
		this.packageCost = packageCost;
	}

	public Set getCarowners() {
		return this.carowners;
	}

	public void setCarowners(Set carowners) {
		this.carowners = carowners;
	}

	public Set getApplyRepares() {
		return this.applyRepares;
	}

	public void setApplyRepares(Set applyRepares) {
		this.applyRepares = applyRepares;
	}

}