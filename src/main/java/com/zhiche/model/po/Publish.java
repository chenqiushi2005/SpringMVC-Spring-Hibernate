package com.zhiche.model.po;

import java.sql.Timestamp;

/**
 * Publish entity. @author MyEclipse Persistence Tools
 */

public class Publish implements java.io.Serializable {

	// Fields

	private Integer id;
	private VehicleInfo vehicleInfo;
	private Integer state;
	private Timestamp datetime;

	// Constructors

	/** default constructor */
	public Publish() {
	}

	/** full constructor */
	public Publish(VehicleInfo vehicleInfo, Integer state, Timestamp datetime) {
		this.vehicleInfo = vehicleInfo;
		this.state = state;
		this.datetime = datetime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public VehicleInfo getVehicleInfo() {
		return this.vehicleInfo;
	}

	public void setVehicleInfo(VehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

}