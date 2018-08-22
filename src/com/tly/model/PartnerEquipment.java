package com.tly.model;

/**
 *合伙人设备对应表
 * @author yangweihang
 *
 */
public class PartnerEquipment {
	private int id;//id
	private String pwxid;//合伙人微信id
	private int zcid;//租出设备id
	private int zcnum;//租出数量
	private int xsid;//销售设备id
	private int xsnum;//销售数量
	private String ystime;//验收时间
	private Double money;//价格
	public PartnerEquipment() {
	}
	public PartnerEquipment(int id, String pwxid, int zcid, int zcnum, int xsid, int xsnum, String ystime, Double money) {
		this.id = id;
		this.pwxid = pwxid;
		this.zcid = zcid;
		this.zcnum = zcnum;
		this.xsid = xsid;
		this.xsnum = xsnum;
		this.ystime = ystime;
		this.money = money;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getYstime() {
		return ystime;
	}
	public void setYstime(String ystime) {
		this.ystime = ystime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwxid() {
		return pwxid;
	}
	public void setPwxid(String pwxid) {
		this.pwxid = pwxid;
	}
	public int getZcid() {
		return zcid;
	}
	public void setZcid(int zcid) {
		this.zcid = zcid;
	}
	public int getZcnum() {
		return zcnum;
	}
	public void setZcnum(int zcnum) {
		this.zcnum = zcnum;
	}
	public int getXsid() {
		return xsid;
	}
	public void setXsid(int xsid) {
		this.xsid = xsid;
	}
	public int getXsnum() {
		return xsnum;
	}
	public void setXsnum(int xsnum) {
		this.xsnum = xsnum;
	}
	@Override
	public String toString() {
		return "PartnerEquipment [id=" + id + ", pwxid=" + pwxid + ", zcid=" + zcid + ", zcnum=" + zcnum + ", xsid="
				+ xsid + ", xsnum=" + xsnum + "]";
	}
}
