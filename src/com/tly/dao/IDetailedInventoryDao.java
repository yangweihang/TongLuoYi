package com.tly.dao;

import java.util.Map;

import com.tly.model.DetailedInventory;

/**
 * 设备明细
 * @author yangweihang
 *
 */
public interface IDetailedInventoryDao {
	//新增
	public int insert(DetailedInventory di);
	//按条件查询
	public DetailedInventory selectByTJ(Map<String,Object> map);
}
