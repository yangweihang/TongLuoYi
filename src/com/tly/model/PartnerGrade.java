package com.tly.model;

/**
 * 合伙人上下级对应表
 * @author yangweihang
 *
 */
public class PartnerGrade {
	private int id;//合伙人id
	private int onid;//合伙人上级id
	private int upid;//合伙人下级id
	public PartnerGrade() {
	}
	public PartnerGrade(int id, int onid, int upid) {
		this.id = id;
		this.onid = onid;
		this.upid = upid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOnid() {
		return onid;
	}
	public void setOnid(int onid) {
		this.onid = onid;
	}
	public int getUpid() {
		return upid;
	}
	public void setUpid(int upid) {
		this.upid = upid;
	}
	@Override
	public String toString() {
		return "PartnerGrade [id=" + id + ", onid=" + onid + ", upid=" + upid + "]";
	}
}
