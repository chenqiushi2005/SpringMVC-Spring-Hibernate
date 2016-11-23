package com.zhiche.model.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Series entity. @author MyEclipse Persistence Tools
 */

public class Series implements java.io.Serializable {

	// Fields

	private Integer id;
	private Website website;
	private Brand brand;
	private Integer erpId;
	private Integer seriesId;
	private Integer validTag;
	private Set kinds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Series() {
	}

	/** full constructor */
	public Series(Website website, Brand brand, Integer erpId,
			Integer seriesId, Integer validTag, Set kinds) {
		this.website = website;
		this.brand = brand;
		this.erpId = erpId;
		this.seriesId = seriesId;
		this.validTag = validTag;
		this.kinds = kinds;
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

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Integer getErpId() {
		return this.erpId;
	}

	public void setErpId(Integer erpId) {
		this.erpId = erpId;
	}

	public Integer getSeriesId() {
		return this.seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public Integer getValidTag() {
		return this.validTag;
	}

	public void setValidTag(Integer validTag) {
		this.validTag = validTag;
	}

	public Set getKinds() {
		return this.kinds;
	}

	public void setKinds(Set kinds) {
		this.kinds = kinds;
	}

}