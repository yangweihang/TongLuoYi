package com.tly.model;

/**
 * 积分详情
 * @author yangweihang
 *
 */
public class Integral {
	private int id;//id;
	private String wxid;//微信id
	private String date;//获取时间
	private int xiaofei;//消费
	private int xingping;//星评
	private int liuyan;//留言
	public Integral() {
	}
	public Integral(int id, String wxid, String date, int xiaofei, int xingping, int liuyan) {
		this.id = id;
		this.wxid = wxid;
		this.date = date;
		this.xiaofei = xiaofei;
		this.xingping = xingping;
		this.liuyan = liuyan;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getXiaofei() {
		return xiaofei;
	}
	public void setXiaofei(int xiaofei) {
		this.xiaofei = xiaofei;
	}
	public int getXingping() {
		return xingping;
	}
	public void setXingping(int xingping) {
		this.xingping = xingping;
	}
	public int getLiuyan() {
		return liuyan;
	}
	public void setLiuyan(int liuyan) {
		this.liuyan = liuyan;
	}
	@Override
	public String toString() {
		return "Integral [id=" + id + ", wxid=" + wxid + ", date=" + date + ", xiaofei=" + xiaofei + ", xingping="
				+ xingping + ", liuyan=" + liuyan + "]";
	}
}
