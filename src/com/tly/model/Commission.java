package com.tly.model;

/**
 * 上级提成对应表
 * @author yangweihang
 *
 */
public class Commission {
	private int id;
	private String wxid;//我的微信id
	private String onewxid;//一级上级微信id
	private String twowxid;//二级上级微信id
	private Double xfone;//消费一级上线提成
	private Double xftwo;//消费二级上线提成
	private Double zyone;//租用一级上线提成
	private Double zytwo;//租用二级上线提成
	private Double gmone;//购买一级上线提成
	private Double gmtwo;//购买二级上线提成
	private String time;//时间
	public Commission() {
	}
	public Commission(int id, String wxid, String onewxid, String twowxid, Double xfone, Double xftwo, Double zyone,
			Double zytwo, Double gmone, Double gmtwo, String time) {
		this.id = id;
		this.wxid = wxid;
		this.onewxid = onewxid;
		this.twowxid = twowxid;
		this.xfone = xfone;
		this.xftwo = xftwo;
		this.zyone = zyone;
		this.zytwo = zytwo;
		this.gmone = gmone;
		this.gmtwo = gmtwo;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWxid() {
		return wxid;
	}
	public void setWxid(String wxid) {
		this.wxid = wxid;
	}
	public String getOnewxid() {
		return onewxid;
	}
	public void setOnewxid(String onewxid) {
		this.onewxid = onewxid;
	}
	public String getTwowxid() {
		return twowxid;
	}
	public void setTwowxid(String twowxid) {
		this.twowxid = twowxid;
	}
	public Double getXfone() {
		return xfone;
	}
	public void setXfone(Double xfone) {
		this.xfone = xfone;
	}
	public Double getXftwo() {
		return xftwo;
	}
	public void setXftwo(Double xftwo) {
		this.xftwo = xftwo;
	}
	public Double getZyone() {
		return zyone;
	}
	public void setZyone(Double zyone) {
		this.zyone = zyone;
	}
	public Double getZytwo() {
		return zytwo;
	}
	public void setZytwo(Double zytwo) {
		this.zytwo = zytwo;
	}
	public Double getGmone() {
		return gmone;
	}
	public void setGmone(Double gmone) {
		this.gmone = gmone;
	}
	public Double getGmtwo() {
		return gmtwo;
	}
	public void setGmtwo(Double gmtwo) {
		this.gmtwo = gmtwo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Commission [id=" + id + ", wxid=" + wxid + ", onewxid=" + onewxid + ", twowxid=" + twowxid + ", xfone="
				+ xfone + ", xftwo=" + xftwo + ", zyone=" + zyone + ", zytwo=" + zytwo + ", gmone=" + gmone + ", gmtwo="
				+ gmtwo + ", time=" + time + "]";
	}
}
