package com.tly.model;

/**
 * 合伙人级别对应表
 * @author yangweihang
 *
 */
public class PartnerLevel {
	private int id;//id
	private String wxid;//合伙人微信id
	private String level;//合伙人级别
	public PartnerLevel() {
	}
	public PartnerLevel(int id, String wxid, String level) {
		this.id = id;
		this.wxid = wxid;
		this.level = level;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "PartnerLevel [id=" + id + ", wxid=" + wxid + ", level=" + level + "]";
	}
}
