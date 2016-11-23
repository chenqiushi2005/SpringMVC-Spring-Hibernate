package com.zhiche.model.po;

import java.util.HashSet;
import java.util.Set;

/**
 * CarDealer entity. @author MyEclipse Persistence Tools
 */

public class CarDealer implements java.io.Serializable {

	// Fields

	private Integer id;
	private Market market;
	private Integer erpDealerId;
	private Integer validTag;
	private Set vehicleInfos = new HashSet(0);
	private Set accounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public CarDealer() {
	}

	/** full constructor */
	public CarDealer(Market market, Integer erpDealerId, Integer validTag,
			Set vehicleInfos, Set accounts) {
		this.market = market;
		this.erpDealerId = erpDealerId;
		this.validTag = validTag;
		this.vehicleInfos = vehicleInfos;
		this.accounts = accounts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public Integer getErpDealerId() {
		return this.erpDealerId;
	}

	public void setErpDealerId(Integer erpDealerId) {
		this.erpDealerId = erpDealerId;
	}

	public Integer getValidTag() {
		return this.validTag;
	}

	public void setValidTag(Integer validTag) {
		this.validTag = validTag;
	}

	public Set getVehicleInfos() {
		return this.vehicleInfos;
	}

	public void setVehicleInfos(Set vehicleInfos) {
		this.vehicleInfos = vehicleInfos;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}