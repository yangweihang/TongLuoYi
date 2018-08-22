package com.tly.model;

/**
 * 会员使用统计
 * @author yangweihang
 *
 */
public class UseStatistical {
	private int id;//id;
	private String serialnum;//设备编号
	private String kjtime;//开机时间
	private int duration;//本次时长
	private int uid;//会员id
	public UseStatistical() {
	}
	public UseStatistical(int id, String serialnum, String kjtime, int duration, int uid) {
		this.id = id;
		this.serialnum = serialnum;
		this.kjtime = kjtime;
		this.duration = duration;
		this.uid = uid;
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
	public String getKjtime() {
		return kjtime;
	}
	public void setKjtime(String kjtime) {
		this.kjtime = kjtime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "UseStatistical [id=" + id + ", serialnum=" + serialnum + ", kjtime=" + kjtime + ", duration=" + duration
				+ ", uid=" + uid + "]";
	}
}