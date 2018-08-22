package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Inventory;

/**
 * 库存明细
 * @author yangweihang
 *
 */
public interface IInventoryService {
	//新增
	public int insert(Inventory i);
	//按条件查询
	public List<Inventory> selectByInventory(Map<String,Object> map);
	//按id查询
	public Inventory selectOne(Integer id);
	//修改
	public int update(Inventory i);
	//删除
	public int delete(Integer id);
	//查询一个对象
	public Inventory selectByTJ(Map<String,Object> map);
	//设备管理查询
	public List<Map<String,Object>> selectByEquipmentanage(Map<String,Object> map);
	//修改二维码
	public int updateewm(String ewm);
	//查询全部
	public List<Inventory> selectAll();
	//查询没有出租或出售的设备
	public List<Map<String,Object>> selectNotCZAndXS(Map<String,Object> map);
}
