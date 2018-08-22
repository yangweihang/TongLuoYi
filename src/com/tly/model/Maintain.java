package com.tly.model;

/**
 * 故障设备维修明细
 * @author yangweihang
 *
 */
public class Maintain {
	private int id;//id
	private String dname;//设备名称
	private String address;//设备地址
	private String pname;//合伙人姓名
	private String pwxid;//合伙人微信id
	private String lname;//联系人姓名
	private String phonenum;//联系人电话
	private String gdescribe;//故障描述
	private String wxid;//维修工程师微信id
	private String judge;//工程师判断
	private String record;//维修记录
	private String result;//维修结果
	private String starttime;//申请时间
	private String endtime;//维修结束时间
	public Maintain() {
	}
	public Maintain(int id, String dname, String address, String pname, String pwxid, String lname, String phonenum,
			String gdescribe, String wxid, String judge, String record, String result, String starttime,
			String endtime) {
		this.id = id;
		this.dname = dname;
		this.address = address;
		this.pname = pname;
		this.pwxid = pwxid;
		this.lname = lname;
		this.phonenum = phonenum;
		this.gdescribe = gdescribe;
		this.wxid = wxid;
		this.judge = judge;
		this.record = record;
		this.result = result;
		this.starttime = starttime;
		this.endtime = endtime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPwxid() {
		return pwxid;
	}
	public void setPwxid(String pwxid) {
		this.pwxid = pwxid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getGdescribe() {
		return gdescribe;
	}
	public void setGdescribe(String gdescribe) {
		this.gdescribe = gdescribe;
	}
	public String getWxid() {
		return wxid;
	}
	public void setWxid(String wxid) {
		this.wxid = wxid;
	}
	public String getJudge() {
		return judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	@Override
	public String toString() {
		return "Maintain [id=" + id + ", dname=" + dname + ", address=" + address + ", pname=" + pname + ", pwxid="
				+ pwxid + ", lname=" + lname + ", phonenum=" + phonenum + ", gdescribe=" + gdescribe + ", wxid=" + wxid
				+ ", judge=" + judge + ", record=" + record + ", result=" + result + ", starttime=" + starttime
				+ ", endtime=" + endtime + "]";
	}
}
