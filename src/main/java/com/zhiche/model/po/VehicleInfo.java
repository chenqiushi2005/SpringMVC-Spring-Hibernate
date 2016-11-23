package com.zhiche.model.po;

import java.util.HashSet;
import java.util.Set;

/**
 * VehicleInfo entity. @author MyEclipse Persistence Tools
 */

public class VehicleInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private CarDealer carDealer;
	private Integer erpVehicleId;
	private Integer carid;
	private String carName;
	private Integer brandId;
	private Integer seriesId;
	private Integer productId;
	private String brandName;
	private String seriesName;
	private String productName;
	private String displacement;
	private String gearbox;
	private Integer isIncludeTransferfee;
	private Float bookPrice;
	private Integer isFixPrice;
	private Integer provinceId;
	private Integer cityId;
	private Float driveMileage;
	private Integer purposeId;
	private Integer colorId;
	private String firstRegTime;
	private String verifyTime;
	private String veticaltaxTime;
	private String insuranceDate;
	private String userComment;
	private String imgUrls;
	private String thumbimgUrls;
	private Integer qualityAssDate;
	private Float qualityAssMile;
	private Integer transferTimes;
	private String driverLicenseImage;
	private Integer views;
	private String vinCode;
	private Set publisheds = new HashSet(0);
	private Set publishs = new HashSet(0);

	// Constructors

	/** default constructor */
	public VehicleInfo() {
	}

	/** full constructor */
	public VehicleInfo(CarDealer carDealer, Integer erpVehicleId,
			Integer carid, String carName, Integer brandId, Integer seriesId,
			Integer productId, String brandName, String seriesName,
			String productName, String displacement, String gearbox,
			Integer isIncludeTransferfee, Float bookPrice, Integer isFixPrice,
			Integer provinceId, Integer cityId, Float driveMileage,
			Integer purposeId, Integer colorId, String firstRegTime,
			String verifyTime, String veticaltaxTime, String insuranceDate,
			String userComment, String imgUrls, String thumbimgUrls,
			Integer qualityAssDate, Float qualityAssMile,
			Integer transferTimes, String driverLicenseImage, Integer views,
			String vinCode, Set publisheds, Set publishs) {
		this.carDealer = carDealer;
		this.erpVehicleId = erpVehicleId;
		this.carid = carid;
		this.carName = carName;
		this.brandId = brandId;
		this.seriesId = seriesId;
		this.productId = productId;
		this.brandName = brandName;
		this.seriesName = seriesName;
		this.productName = productName;
		this.displacement = displacement;
		this.gearbox = gearbox;
		this.isIncludeTransferfee = isIncludeTransferfee;
		this.bookPrice = bookPrice;
		this.isFixPrice = isFixPrice;
		this.provinceId = provinceId;
		this.cityId = cityId;
		this.driveMileage = driveMileage;
		this.purposeId = purposeId;
		this.colorId = colorId;
		this.firstRegTime = firstRegTime;
		this.verifyTime = verifyTime;
		this.veticaltaxTime = veticaltaxTime;
		this.insuranceDate = insuranceDate;
		this.userComment = userComment;
		this.imgUrls = imgUrls;
		this.thumbimgUrls = thumbimgUrls;
		this.qualityAssDate = qualityAssDate;
		this.qualityAssMile = qualityAssMile;
		this.transferTimes = transferTimes;
		this.driverLicenseImage = driverLicenseImage;
		this.views = views;
		this.vinCode = vinCode;
		this.publisheds = publisheds;
		this.publishs = publishs;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarDealer getCarDealer() {
		return this.carDealer;
	}

	public void setCarDealer(CarDealer carDealer) {
		this.carDealer = carDealer;
	}

	public Integer getErpVehicleId() {
		return this.erpVehicleId;
	}

	public void setErpVehicleId(Integer erpVehicleId) {
		this.erpVehicleId = erpVehicleId;
	}

	public Integer getCarid() {
		return this.carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Integer getBrandId() {
		return this.brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getSeriesId() {
		return this.seriesId;
	}

	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSeriesName() {
		return this.seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDisplacement() {
		return this.displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getGearbox() {
		return this.gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}

	public Integer getIsIncludeTransferfee() {
		return this.isIncludeTransferfee;
	}

	public void setIsIncludeTransferfee(Integer isIncludeTransferfee) {
		this.isIncludeTransferfee = isIncludeTransferfee;
	}

	public Float getBookPrice() {
		return this.bookPrice;
	}

	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Integer getIsFixPrice() {
		return this.isFixPrice;
	}

	public void setIsFixPrice(Integer isFixPrice) {
		this.isFixPrice = isFixPrice;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Float getDriveMileage() {
		return this.driveMileage;
	}

	public void setDriveMileage(Float driveMileage) {
		this.driveMileage = driveMileage;
	}

	public Integer getPurposeId() {
		return this.purposeId;
	}

	public void setPurposeId(Integer purposeId) {
		this.purposeId = purposeId;
	}

	public Integer getColorId() {
		return this.colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	public String getFirstRegTime() {
		return this.firstRegTime;
	}

	public void setFirstRegTime(String firstRegTime) {
		this.firstRegTime = firstRegTime;
	}

	public String getVerifyTime() {
		return this.verifyTime;
	}

	public void setVerifyTime(String verifyTime) {
		this.verifyTime = verifyTime;
	}

	public String getVeticaltaxTime() {
		return this.veticaltaxTime;
	}

	public void setVeticaltaxTime(String veticaltaxTime) {
		this.veticaltaxTime = veticaltaxTime;
	}

	public String getInsuranceDate() {
		return this.insuranceDate;
	}

	public void setInsuranceDate(String insuranceDate) {
		this.insuranceDate = insuranceDate;
	}

	public String getUserComment() {
		return this.userComment;
	}

	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}

	public String getImgUrls() {
		return this.imgUrls;
	}

	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}

	public String getThumbimgUrls() {
		return this.thumbimgUrls;
	}

	public void setThumbimgUrls(String thumbimgUrls) {
		this.thumbimgUrls = thumbimgUrls;
	}

	public Integer getQualityAssDate() {
		return this.qualityAssDate;
	}

	public void setQualityAssDate(Integer qualityAssDate) {
		this.qualityAssDate = qualityAssDate;
	}

	public Float getQualityAssMile() {
		return this.qualityAssMile;
	}

	public void setQualityAssMile(Float qualityAssMile) {
		this.qualityAssMile = qualityAssMile;
	}

	public Integer getTransferTimes() {
		return this.transferTimes;
	}

	public void setTransferTimes(Integer transferTimes) {
		this.transferTimes = transferTimes;
	}

	public String getDriverLicenseImage() {
		return this.driverLicenseImage;
	}

	public void setDriverLicenseImage(String driverLicenseImage) {
		this.driverLicenseImage = driverLicenseImage;
	}

	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public String getVinCode() {
		return this.vinCode;
	}

	public void setVinCode(String vinCode) {
		this.vinCode = vinCode;
	}

	public Set getPublisheds() {
		return this.publisheds;
	}

	public void setPublisheds(Set publisheds) {
		this.publisheds = publisheds;
	}

	public Set getPublishs() {
		return this.publishs;
	}

	public void setPublishs(Set publishs) {
		this.publishs = publishs;
	}

}