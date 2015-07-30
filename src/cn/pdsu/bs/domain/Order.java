package cn.pdsu.bs.domain;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Carowner carowner;
	private User user;
	private Short orderType;
	private String orderNote;
	private String orderTime;
	private Short orderState;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Carowner carowner, User user, Short orderType, Short orderState) {
		this.carowner = carowner;
		this.user = user;
		this.orderType = orderType;
		this.orderState = orderState;
	}

	/** full constructor */
	public Order(Carowner carowner, User user, Short orderType,
			String orderNote, String orderTime, Short orderState) {
		this.carowner = carowner;
		this.user = user;
		this.orderType = orderType;
		this.orderNote = orderNote;
		this.orderTime = orderTime;
		this.orderState = orderState;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Carowner getCarowner() {
		return this.carowner;
	}

	public void setCarowner(Carowner carowner) {
		this.carowner = carowner;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Short getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Short orderType) {
		this.orderType = orderType;
	}

	public String getOrderNote() {
		return this.orderNote;
	}

	public void setOrderNote(String orderNote) {
		this.orderNote = orderNote;
	}

	public String getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Short getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Short orderState) {
		this.orderState = orderState;
	}

}