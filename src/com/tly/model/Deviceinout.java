package com.tly.model;

/**
 * 设备出入库明细
 * @author yangweihang
 *
 */
public class Deviceinout {
	private Integer id;//主键
	private String serialnum;//设备编号外键
	private String inventorystatus;//库存状态    值：出库、入库、报废
	private String pwxid;//合伙人微信id
	private String manner;//形式     值：售出、租出
	private Double price;//价格
	private String devicestatus;//设备状态    值：在线待机
	private String note;//备注     如报废，输入报废原因
	private String intime;//入库时间
	private String outtime;//出库时间
	public Deviceinout() {
	}
	public Deviceinout(Integer id, String serialnum, String inventorystatus, String pwxid, String manner,
			Double price, String devicestatus, String note, String intime, String outtime) {
		this.id = id;
		this.serialnum = serialnum;
		this.inventorystatus = inventorystatus;
		this.pwxid = pwxid;
		this.manner = manner;
		this.price = price;
		this.devicestatus = devicestatus;
		this.note = note;
		this.intime = intime;
		this.outtime = outtime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public String getInventorystatus() {
		return inventorystatus;
	}
	public void setInventorystatus(String inventorystatus) {
		this.inventorystatus = inventorystatus;
	}
	public String getPwxid() {
		return pwxid;
	}
	public void setPwxid(String pwxid) {
		this.pwxid = pwxid;
	}
	public String getManner() {
		return manner;
	}
	public void setManner(String manner) {
		this.manner = manner;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDevicestatus() {
		return devicestatus;
	}
	public void setDevicestatus(String devicestatus) {
		this.devicestatus = devicestatus;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	@Override
	public String toString() {
		return "Deviceinout [id=" + id + ", serialnum=" + serialnum + ", inventorystatus=" + inventorystatus
				+ ", pwxid=" + pwxid + ", manner=" + manner + ", price=" + price + ", devicestatus="
				+ devicestatus + ", note=" + note + ", intime=" + intime + ", outtime=" + outtime + "]";
	}
}
