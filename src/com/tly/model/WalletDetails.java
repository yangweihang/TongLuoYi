package com.tly.model;

/**
 * 会员、合伙人钱包明细表
 * @author yangweihang
 *
 */
public class WalletDetails {
	private int id;//id
	private String wxid;//微信id
	private Double summoney;//收入累计金额
	private Double money;//经营收益(元)
	private Double txmoney;//已体现金额(元)
	private Double balance;//钱包余额
	public WalletDetails() {
	}
	public WalletDetails(int id, String wxid, Double summoney, Double money, Double txmoney, Double balance) {
		this.id = id;
		this.wxid = wxid;
		this.summoney = summoney;
		this.money = money;
		this.txmoney = txmoney;
		this.balance = balance;
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
	public Double getSummoney() {
		return summoney;
	}
	public void setSummoney(Double summoney) {
		this.summoney = summoney;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getTxmoney() {
		return txmoney;
	}
	public void setTxmoney(Double txmoney) {
		this.txmoney = txmoney;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "WalletDetails [id=" + id + ", wxid=" + wxid + ", summoney=" + summoney + ", money=" + money
				+ ", txmoney=" + txmoney + ", balance=" + balance + "]";
	}
}
