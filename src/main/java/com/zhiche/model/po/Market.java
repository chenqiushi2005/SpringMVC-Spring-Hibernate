package com.zhiche.model.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Market entity. @author MyEclipse Persistence Tools
 */

public class Market implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String interfaceUrl;
	private Integer validTag;
	private Set carDealers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Market() {
	}

	/** full constructor */
	public Market(String name, String interfaceUrl, Integer validTag,
			Set carDealers) {
		this.name = name;
		this.interfaceUrl = interfaceUrl;
		this.validTag = validTag;
		this.carDealers = carDealers;
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

	public String getInterfaceUrl() {
		return this.interfaceUrl;
	}

	public void setInterfaceUrl(String interfaceUrl) {
		this.interfaceUrl = interfaceUrl;
	}

	public Integer getValidTag() {
		return this.validTag;
	}

	public void setValidTag(Integer validTag) {
		this.validTag = validTag;
	}

	public Set getCarDealers() {
		return this.carDealers;
	}

	public void setCarDealers(Set carDealers) {
		this.carDealers = carDealers;
	}

}