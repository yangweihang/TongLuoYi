package com.tly.model;

/**
 * 用户级别表
 * @author yangweihang
 *
 */
public class Grade {
	private int id;//会员id
	private int onwxid;//上级id
	private int upwxid;//下级id
	public Grade() {
	}
	public Grade(int id, int onwxid, int upwxid) {
		this.id = id;
		this.onwxid = onwxid;
		this.upwxid = upwxid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOnwxid() {
		return onwxid;
	}
	public void setOnwxid(int onwxid) {
		this.onwxid = onwxid;
	}
	public int getUpwxid() {
		return upwxid;
	}
	public void setUpwxid(int upwxid) {
		this.upwxid = upwxid;
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", onwxid=" + onwxid + ", upwxid=" + upwxid + "]";
	}
}
