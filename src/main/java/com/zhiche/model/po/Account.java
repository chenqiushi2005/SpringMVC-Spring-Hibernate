package com.zhiche.model.po;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer id;
	private Website website;
	private CarDealer carDealer;
	private String userName;
	private String password;
	private String secretKey;
	private String remark;
	private Integer validTag;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(Website website, CarDealer carDealer, String userName,
			String password, String secretKey, String remark, Integer validTag) {
		this.website = website;
		this.carDealer = carDealer;
		this.userName = userName;
		this.password = password;
		this.secretKey = secretKey;
		this.remark = remark;
		this.validTag = validTag;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Website getWebsite() {
		return this.website;
	}

	public void setWebsite(Website website) {
		this.website = website;
	}

	public CarDealer getCarDealer() {
		return this.carDealer;
	}

	public void setCarDealer(CarDealer carDealer) {
		this.carDealer = carDealer;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getValidTag() {
		return this.validTag;
	}

	public void setValidTag(Integer validTag) {
		this.validTag = validTag;
	}

}