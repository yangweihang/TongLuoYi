package com.tly.model;

/**
 * 会员
 * @author yangweihang
 *
 */
public class UserDetails {
	private int id;//主键
	private String wxid;//微信id
	private String username;//昵称
	private String name;//姓名
	private String sex;//性别
	private String date;//出生日期
	private String phonenum;//手机号
	private String city;//所在城市
	private Double saldo;//余额
	private int integral;//积分
	private int total;//使用次数
	private String oneonwxid;//一级上线微信id
	private String twoonwxid;//二级上线微信id
	private String oneupwxid;//一级下线微信id
	private String twoupwxid;//二级下线微信id
	private int permisos;//权限 1-厂家 2-销售 3.出租 4.维护
	private String jrtime;//加入时间
	public UserDetails() {
	}
	public UserDetails(int id, String wxid, String username, String name, String sex, String date, String phonenum,
			String city, Double saldo, int integral, int total, String oneonwxid, String twoonwxid, String oneupwxid,
			String twoupwxid, int permisos, String jrtime) {
		this.id = id;
		this.wxid = wxid;
		this.username = username;
		this.name = name;
		this.sex = sex;
		this.date = date;
		this.phonenum = phonenum;
		this.city = city;
		this.saldo = saldo;
		this.integral = integral;
		this.total = total;
		this.oneonwxid = oneonwxid;
		this.twoonwxid = twoonwxid;
		this.oneupwxid = oneupwxid;
		this.twoupwxid = twoupwxid;
		this.permisos = permisos;
		this.jrtime = jrtime;
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
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getOneonwxid() {
		return oneonwxid;
	}
	public void setOneonwxid(String oneonwxid) {
		this.oneonwxid = oneonwxid;
	}
	public String getTwoonwxid() {
		return twoonwxid;
	}
	public void setTwoonwxid(String twoonwxid) {
		this.twoonwxid = twoonwxid;
	}
	public String getOneupwxid() {
		return oneupwxid;
	}
	public void setOneupwxid(String oneupwxid) {
		this.oneupwxid = oneupwxid;
	}
	public String getTwoupwxid() {
		return twoupwxid;
	}
	public void setTwoupwxid(String twoupwxid) {
		this.twoupwxid = twoupwxid;
	}
	public int getPermisos() {
		return permisos;
	}
	public void setPermisos(int permisos) {
		this.permisos = permisos;
	}
	public String getJrtime() {
		return jrtime;
	}
	public void setJrtime(String jrtime) {
		this.jrtime = jrtime;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", wxid=" + wxid + ", username=" + username + ", name=" + name + ", sex=" + sex
				+ ", date=" + date + ", phonenum=" + phonenum + ", city=" + city + ", saldo=" + saldo + ", integral="
				+ integral + ", total=" + total + ", oneonwxid=" + oneonwxid + ", twoonwxid=" + twoonwxid
				+ ", oneupwxid=" + oneupwxid + ", twoupwxid=" + twoupwxid + ", permisos=" + permisos + ", jrtime="
				+ jrtime + "]";
	}
}
