package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IInventoryDao;
import com.tly.model.Deviceinout;
import com.tly.model.Inventory;

/**
 * 库存设备
 * @author yangweihang
 *
 */
public class InventoryDao extends SqlSessionDaoSupport implements IInventoryDao {
	/*
	 *新增
	 */
	public int insert(Inventory i){
		return getSqlSession().insert("com.tly.dao.IInventoryDao.insert",i);
	}
	
	/*
	 *按条件查询
	 */
	public List<Inventory> selectByInventory(Map<String,Object> map){
		return getSqlSession().selectList("com.tly.dao.IInventoryDao.selectByInventory", map);
	}
	/*
	 *按id查询
	 */
	@Override
	public Inventory selectOne(Integer id) {
		return getSqlSession().selectOne("com.tly.dao.IInventoryDao.selectOne",id);
	}

	/*
	 *修改
	 */
	@Override
	public int update(Inventory i) {
		return getSqlSession().update("com.tly.dao.IInventoryDao.update",i);
	}

	/*
	 *删除
	 */
	@Override
	public int delete(Integer id) {
		return getSqlSession().delete("com.tly.dao.IInventoryDao.delete",id);
	}

	/*
	 *查询一个
	 */
	@Override
	public Inventory selectByTJ(Map<String, Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IInventoryDao.selectByTJ",map);
	}

	/*
	 *设备管理查询
	 */
	@Override
	public List<Map<String, Object>> selectByEquipmentanage(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IInventoryDao.selectByEquipmentanage", map);
	}

	/*
	 *修改二维码
	 */
	@Override
	public int updateewm(String ewm) {
		return getSqlSession().update("com.tly.dao.IInventoryDao.updateewm",ewm);
	}
	
	/*
	 *查询全部
	 */
	@Override
	public List<Inventory> selectAll() {
		return getSqlSession().selectList("com.tly.dao.IInventoryDao.selectAll", null);
	}

	/*
	 *查询没有出租或出售的设备
	 */
	@Override
	public List<Map<String, Object>> selectNotCZAndXS(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IInventoryDao.selectNotCZAndXS", map);
	}
}
