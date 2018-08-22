package com.tly.model;

/**
 * 库存详细
 * @author yangweihang
 *
 */
public class DetailedInventory {
	private int id;//id
	private String model;//设备型号
	private String serialnum;//设备编号
	private String ewm;//二维码
	public DetailedInventory() {
	}
	public DetailedInventory(int id, String model, String serialnum, String ewm) {
		this.id = id;
		this.model = model;
		this.serialnum = serialnum;
		this.ewm = ewm;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public String getEwm() {
		return ewm;
	}
	public void setEwm(String ewm) {
		this.ewm = ewm;
	}
	@Override
	public String toString() {
		return "DetailedInventory [id=" + id + ", serialnum=" + serialnum + ", ewm=" + ewm + "]";
	}
}
