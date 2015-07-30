package cn.pdsu.bs.domain;

/**
 * Baoyang entity. @author MyEclipse Persistence Tools
 */

public class Baoyang implements java.io.Serializable {

	// Fields

	private Integer baoyangId;
	private User user;
	private Carowner carowner;
	private String baoyangTime;
	private String beforeState;
	private String baoyangItem;

	// Constructors

	/** default constructor */
	public Baoyang() {
	}

	/** minimal constructor */
	public Baoyang(User user, Carowner carowner) {
		this.user = user;
		this.carowner = carowner;
	}

	/** full constructor */
	public Baoyang(User user, Carowner carowner, String baoyangTime,
			String beforeState, String baoyangItem) {
		this.user = user;
		this.carowner = carowner;
		this.baoyangTime = baoyangTime;
		this.beforeState = beforeState;
		this.baoyangItem = baoyangItem;
	}

	// Property accessors

	public Integer getBaoyangId() {
		return this.baoyangId;
	}

	public void setBaoyangId(Integer baoyangId) {
		this.baoyangId = baoyangId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Carowner getCarowner() {
		return this.carowner;
	}

	public void setCarowner(Carowner carowner) {
		this.carowner = carowner;
	}

	public String getBaoyangTime() {
		return this.baoyangTime;
	}

	public void setBaoyangTime(String baoyangTime) {
		this.baoyangTime = baoyangTime;
	}

	public String getBeforeState() {
		return this.beforeState;
	}

	public void setBeforeState(String beforeState) {
		this.beforeState = beforeState;
	}

	public String getBaoyangItem() {
		return this.baoyangItem;
	}

	public void setBaoyangItem(String baoyangItem) {
		this.baoyangItem = baoyangItem;
	}

}