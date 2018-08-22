package com.tly.model;

/**
 * 库存设备表
 * @author yangweihang
 *
 */
public class Inventory {
	private int id;//id
	private String name;//设备名称
	private String model;//型号
	private Double deposit;//押金
	private Double price;//售价
	private Integer num;//库存数量
	private String serialnum;//设备编号
	private String ewm;//二维码
	private long dvsum;//设备总数
	public Inventory() {
	}
	public Inventory(int id, String name, String model, Double deposit, Double price, Integer num, String serialnum,
			String ewm) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.deposit = deposit;
		this.price = price;
		this.num = num;
		this.serialnum = serialnum;
		this.ewm = ewm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}
	public String getEwm() {
		return ewm;
	}
	public void setEwm(String ewm) {
		this.ewm = ewm;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", model=" + model + ", deposit=" + deposit + ", price="
				+ price + ", num=" + num + ", serialnum=" + serialnum + ", ewm=" + ewm + "]";
	}
}
