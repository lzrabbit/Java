package nb.ghotel.domain;

import java.util.Date;

public class GProduct {
	private long ProductId;
	private String RateCode;
	private Date AvailableDate;
	private String RoomTypeCode;
	private long HotelId;
	private int CurrentAllotment;
	private String SupplierType;
	private int BaseRate;
	private int Rate;
	private int Surcharge;
	private int TotalRate;
	private int CommissionableUsdTotal;
	private Date CreateTime;
	private Date UpdateTime;
	private String RateType;
	private String Remark;

	public long getProductId() {
		return ProductId;
	}
	public void setProductId(long productId) {
		ProductId = productId;
	}
	public String getRateCode() {
		return RateCode;
	}
	public void setRateCode(String rateCode) {
		RateCode = rateCode;
	}
	public Date getAvailableDate() {
		return AvailableDate;
	}
	public void setAvailableDate(Date availableDate) {
		AvailableDate = availableDate;
	}
	public String getRoomTypeCode() {
		return RoomTypeCode;
	}
	public void setRoomTypeCode(String roomTypeCode) {
		RoomTypeCode = roomTypeCode;
	}
	public long getHotelId() {
		return HotelId;
	}
	public void setHotelId(long hotelId) {
		HotelId = hotelId;
	}
	public int getCurrentAllotment() {
		return CurrentAllotment;
	}
	public void setCurrentAllotment(int currentAllotment) {
		CurrentAllotment = currentAllotment;
	}
	public String getSupplierType() {
		return SupplierType;
	}
	public void setSupplierType(String supplierType) {
		SupplierType = supplierType;
	}
	public int getBaseRate() {
		return BaseRate;
	}
	public void setBaseRate(int baseRate) {
		BaseRate = baseRate;
	}
	public int getRate() {
		return Rate;
	}
	public void setRate(int rate) {
		Rate = rate;
	}
	public int getSurcharge() {
		return Surcharge;
	}
	public void setSurcharge(int surcharge) {
		Surcharge = surcharge;
	}
	public int getTotalRate() {
		return TotalRate;
	}
	public void setTotalRate(int totalRate) {
		TotalRate = totalRate;
	}
	public int getCommissionableUsdTotal() {
		return CommissionableUsdTotal;
	}
	public void setCommissionableUsdTotal(int commissionableUsdTotal) {
		CommissionableUsdTotal = commissionableUsdTotal;
	}
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		CreateTime = createTime;
	}
	public Date getUpdateTime() {
		return UpdateTime;
	}
	public void setUpdateTime(Date updateTime) {
		UpdateTime = updateTime;
	}
	public String getRateType() {
		return RateType;
	}
	public void setRateType(String rateType) {
		RateType = rateType;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
}