package com.zhiche.model.po;

/**
 * Kind entity. @author MyEclipse Persistence Tools
 */

public class Kind implements java.io.Serializable {

	// Fields

	private Integer id;
	private Website website;
	private Series series;
	private Integer erpId;
	private Integer kindId;
	private Integer validTag;

	// Constructors

	/** default constructor */
	public Kind() {
	}

	/** full constructor */
	public Kind(Website website, Series series, Integer erpId, Integer kindId,
			Integer validTag) {
		this.website = website;
		this.series = series;
		this.erpId = erpId;
		this.kindId = kindId;
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

	public Series getSeries() {
		return this.series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Integer getErpId() {
		return this.erpId;
	}

	public void setErpId(Integer erpId) {
		this.erpId = erpId;
	}

	public Integer getKindId() {
		return this.kindId;
	}

	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}

	public Integer getValidTag() {
		return this.validTag;
	}

	public void setValidTag(Integer validTag) {
		this.validTag = validTag;
	}

}