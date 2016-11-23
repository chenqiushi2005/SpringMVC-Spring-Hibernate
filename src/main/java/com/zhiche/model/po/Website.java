package com.zhiche.model.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Website entity. @author MyEclipse Persistence Tools
 */

public class Website implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String remark;
	private Integer validTag;
	private Set brands = new HashSet(0);
	private Set kinds = new HashSet(0);
	private Set serieses = new HashSet(0);
	private Set accounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Website() {
	}

	/** full constructor */
	public Website(String name, String remark, Integer validTag, Set brands,
			Set kinds, Set serieses, Set accounts) {
		this.name = name;
		this.remark = remark;
		this.validTag = validTag;
		this.brands = brands;
		this.kinds = kinds;
		this.serieses = serieses;
		this.accounts = accounts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set getBrands() {
		return this.brands;
	}

	public void setBrands(Set brands) {
		this.brands = brands;
	}

	public Set getKinds() {
		return this.kinds;
	}

	public void setKinds(Set kinds) {
		this.kinds = kinds;
	}

	public Set getSerieses() {
		return this.serieses;
	}

	public void setSerieses(Set serieses) {
		this.serieses = serieses;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}