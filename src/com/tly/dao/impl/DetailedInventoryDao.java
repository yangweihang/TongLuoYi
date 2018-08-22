package com.tly.dao.impl;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IDetailedInventoryDao;
import com.tly.model.DetailedInventory;

public class DetailedInventoryDao extends SqlSessionDaoSupport implements IDetailedInventoryDao {

	/*
	 * 新增
	 */
	@Override
	public int insert(DetailedInventory di) {
		return getSqlSession().insert("com.tly.dao.IDetailedInventoryDao.insert", di);
	}

	/*
	 * 按条件查询
	 */
	@Override
	public DetailedInventory selectByTJ(Map<String, Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IDetailedInventoryDao.selectByTJ", map);
	}

}
