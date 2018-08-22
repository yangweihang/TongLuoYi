package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.impl.InventoryDao;
import com.tly.model.Deviceinout;
import com.tly.model.Inventory;
import com.tly.service.IInventoryService;

/**
 * 库存设备
 * @author yangweihang
 *
 */
/**
 * @author yangweihang
 *
 */
public class InventoryService implements IInventoryService {
	
	private InventoryDao iidao;
	
	public InventoryDao getIidao() {
		return iidao;
	}
	public void setIidao(InventoryDao iidao) {
		this.iidao = iidao;
	}
	
	/*
	 *新增
	 */
	@Override
	public int insert(Inventory i) {
		return iidao.insert(i);
	}
	
	/*
	 *按条件查询
	 */
	public List<Inventory> selectByInventory(Map<String,Object> map){
		return iidao.selectByInventory(map);
	}
	
	/*
	 *按id查询
	 */
	@Override
	public Inventory selectOne(Integer id) {
		return iidao.selectOne(id);
	}
	
	/*
	 *修改
	 */
	@Override
	public int update(Inventory i) {
		return iidao.update(i);
	}
	
	/*
	 *删除
	 */
	@Override
	public int delete(Integer id) {
		return iidao.delete(id);
	}
	
	/*
	 *查询一个对象
	 */
	@Override
	public Inventory selectByTJ(Map<String, Object> map) {
		return iidao.selectByTJ(map);
	}
	
	/*
	 *设备管理查询
	 */
	@Override
	public List<Map<String, Object>> selectByEquipmentanage(Map<String, Object> map) {
		return iidao.selectByEquipmentanage(map);
	}
	
	/*
	 *修改二维码
	 */
	@Override
	public int updateewm(String ewm) {
		return iidao.updateewm(ewm);
	}
	
	/*
	 *查询全部
	 */
	@Override
	public List<Inventory> selectAll() {
		return iidao.selectAll();
	}
	
	
	/*
	 *查询没有出租或出售的设备
	 */
	@Override
	public List<Map<String, Object>> selectNotCZAndXS(Map<String, Object> map) {
		return iidao.selectNotCZAndXS(map);
	}

}
