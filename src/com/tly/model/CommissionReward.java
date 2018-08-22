package com.tly.model;

/**
 * 会员、合伙人提成奖励对应表
 * @author yangweihang
 *
 */
public class CommissionReward {
	private int id;//id
	private String level;//级别
	private String identity;//身份
	private Double xftcone;//一级上线消费提成
	private Double xftctwo;//二级上线消费提成
	private Double zytcone;//一级上线租用提成
	private Double zytctwo;//二级上线租用提成
	private Double xstcone;//一级上线销售提成
	private Double xstctwo;//二级上线销售提成
	public CommissionReward(int id, String level, String identity, Double xftcone, Double xftctwo, Double zytcone,
			Double zytctwo, Double xstcone, Double xstctwo) {
		this.id = id;
		this.level = level;
		this.identity = identity;
		this.xftcone = xftcone;
		this.xftctwo = xftctwo;
		this.zytcone = zytcone;
		this.zytctwo = zytctwo;
		this.xstcone = xstcone;
		this.xstctwo = xstctwo;
	}
	public CommissionReward() {
	}
	@Override
	public String toString() {
		return "CommissionReward [id=" + id + ", level=" + level + ", identity=" + identity + ", xftcone=" + xftcone
				+ ", xftctwo=" + xftctwo + ", zytcone=" + zytcone + ", zytctwo=" + zytctwo + ", xstcone=" + xstcone
				+ ", xstctwo=" + xstctwo + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public Double getXftcone() {
		return xftcone;
	}
	public void setXftcone(Double xftcone) {
		this.xftcone = xftcone;
	}
	public Double getXftctwo() {
		return xftctwo;
	}
	public void setXftctwo(Double xftctwo) {
		this.xftctwo = xftctwo;
	}
	public Double getZytcone() {
		return zytcone;
	}
	public void setZytcone(Double zytcone) {
		this.zytcone = zytcone;
	}
	public Double getZytctwo() {
		return zytctwo;
	}
	public void setZytctwo(Double zytctwo) {
		this.zytctwo = zytctwo;
	}
	public Double getXstcone() {
		return xstcone;
	}
	public void setXstcone(Double xstcone) {
		this.xstcone = xstcone;
	}
	public Double getXstctwo() {
		return xstctwo;
	}
	public void setXstctwo(Double xstctwo) {
		this.xstctwo = xstctwo;
	}
	
}
