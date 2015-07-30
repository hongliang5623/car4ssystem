package cn.pdsu.bs.domain;

/**
 * Repare entity. @author MyEclipse Persistence Tools
 */

public class Repare implements java.io.Serializable {

	// Fields

	private Integer weixdId;
	private String repareName;
	private String carName;
	private String repareResons;
	private String repareTime;
	private String reparePlan;
	private String repareTools;
	private String repareResult;
	private String repareSum;
	private String zhuguanname;

	// Constructors

	/** default constructor */
	public Repare() {
	}

	/** full constructor */
	public Repare(String repareName, String carName, String repareResons,
			String repareTime, String reparePlan, String repareTools,
			String repareResult, String repareSum, String zhuguanname) {
		this.repareName = repareName;
		this.carName = carName;
		this.repareResons = repareResons;
		this.repareTime = repareTime;
		this.reparePlan = reparePlan;
		this.repareTools = repareTools;
		this.repareResult = repareResult;
		this.repareSum = repareSum;
		this.zhuguanname = zhuguanname;
	}

	// Property accessors

	public Integer getWeixdId() {
		return this.weixdId;
	}

	public void setWeixdId(Integer weixdId) {
		this.weixdId = weixdId;
	}

	public String getRepareName() {
		return this.repareName;
	}

	public void setRepareName(String repareName) {
		this.repareName = repareName;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getRepareResons() {
		return this.repareResons;
	}

	public void setRepareResons(String repareResons) {
		this.repareResons = repareResons;
	}

	public String getRepareTime() {
		return this.repareTime;
	}

	public void setRepareTime(String repareTime) {
		this.repareTime = repareTime;
	}

	public String getReparePlan() {
		return this.reparePlan;
	}

	public void setReparePlan(String reparePlan) {
		this.reparePlan = reparePlan;
	}

	public String getRepareTools() {
		return this.repareTools;
	}

	public void setRepareTools(String repareTools) {
		this.repareTools = repareTools;
	}

	public String getRepareResult() {
		return this.repareResult;
	}

	public void setRepareResult(String repareResult) {
		this.repareResult = repareResult;
	}

	public String getRepareSum() {
		return this.repareSum;
	}

	public void setRepareSum(String repareSum) {
		this.repareSum = repareSum;
	}

	public String getZhuguanname() {
		return this.zhuguanname;
	}

	public void setZhuguanname(String zhuguanname) {
		this.zhuguanname = zhuguanname;
	}

}