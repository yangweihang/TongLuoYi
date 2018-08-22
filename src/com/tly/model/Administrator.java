package com.tly.model;

/**
 * 管理员
 * @author yangweihang
 *
 */
public class Administrator {
	private int id;//id
	private String wxid;//管理员微信id
	private String name;//管理员姓名
	private String phonenum;//管理员手机号
	public Administrator() {
	}
	public Administrator(int id, String wxid, String name, String phonenum) {
		this.id = id;
		this.wxid = wxid;
		this.name = name;
		this.phonenum = phonenum;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	@Override
	public String toString() {
		return "Administrator [id=" + id + ", wxid=" + wxid + ", name=" + name + ", phonenum=" + phonenum + "]";
	}
}
