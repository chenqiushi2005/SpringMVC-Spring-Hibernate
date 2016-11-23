package com.zhiche.model.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Brand entity. @author MyEclipse Persistence Tools
 */

public class Brand implements java.io.Serializable {

	// Fields

	private Integer id;
	private Website website;
	private Integer erpId;
	private Integer brandId;
	private Integer validTag;
	private Set serieses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Brand() {
	}

	/** full constructor */
	public Brand(Website website, Integer erpId, Integer brandId,
			Integer validTag, Set serieses) {
		this.website = website;
		this.erpId = erpId;
		this.brandId = brandId;
		this.validTag = validTag;
		this.serieses = serieses;
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

	public Integer getErpId() {
		return this.erpId;
	}

	public void setErpId(Integer erpId) {
		this.erpId = erpId;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getValidTag() {
		return this.validTag;
	}

	public void setValidTag(Integer validTag) {
		this.validTag = validTag;
	}

	public Set getSerieses() {
		return this.serieses;
	}

	public void setSerieses(Set serieses) {
		this.serieses = serieses;
	}

}