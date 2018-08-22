package com.tly.model;

/**
 * 合伙人
 * @author yangweihang
 *
 */
public class Partner {
	private int id;//id
	private String wxid;//微信id
	private String username;//合伙人昵称
	private String name;//合伙人姓名
	private String sex;//性别
	private String date;//出生日期
	private String phonenum;//手机号码
	private String city;//所在城市
	private String manner;//合伙人类型
	private String level;//合伙人级别
	private Double balance;//余额
	private int aid;//店铺管理员
	private String atime;//申请时间
	private Double price;//价格
	private int num;//数量
	private int uid;//会员表id
	public Partner() {
	}
	public Partner(int id, String wxid, String username, String name, String sex, String date, String phonenum,
			String city, String manner, String level, Double balance, int aid, String atime, Double price, int num,
			int uid) {
		this.id = id;
		this.wxid = wxid;
		this.username = username;
		this.name = name;
		this.sex = sex;
		this.date = date;
		this.phonenum = phonenum;
		this.city = city;
		this.manner = manner;
		this.level = level;
		this.balance = balance;
		this.aid = aid;
		this.atime = atime;
		this.price = price;
		this.num = num;
		this.uid = uid;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getManner() {
		return manner;
	}
	public void setManner(String manner) {
		this.manner = manner;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Partner [id=" + id + ", wxid=" + wxid + ", username=" + username + ", name=" + name + ", sex=" + sex
				+ ", date=" + date + ", phonenum=" + phonenum + ", city=" + city + ", manner=" + manner + ", level="
				+ level + ", balance=" + balance + ", aid=" + aid + ", atime=" + atime + ", price=" + price + ", num="
				+ num + ", uid=" + uid + "]";
	}
}
