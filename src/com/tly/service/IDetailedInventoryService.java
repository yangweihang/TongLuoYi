package com.tly.service;

import java.util.Map;

import com.tly.model.DetailedInventory;

public interface IDetailedInventoryService {
	//新增
	public int insert(DetailedInventory di);
	//按条件查询
	public DetailedInventory selectByTJ(Map<String,Object> map);

}
