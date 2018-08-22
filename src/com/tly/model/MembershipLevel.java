package com.tly.model;

/**
 * 会员级别对应
 * @author yangweihang
 *
 */
public class MembershipLevel {
	private int id;//id
	private String wxid;//会员微信id
	private String level;//会员级别
	public MembershipLevel() {
	}
	public MembershipLevel(int id, String wxid, String level) {
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
		return "MembershipLevel [id=" + id + ", wxid=" + wxid + ", level=" + level + "]";
	}
}
