package com.tly.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IMaintainDao;
import com.tly.model.Maintain;

/**
 * 故障设备维修明细表 
 * @author yangweihang
 *
 */
public class MaintainDao extends SqlSessionDaoSupport implements IMaintainDao {
	
	/*
	 * 新增
	 */
	public int insert(Maintain m){
		return getSqlSession().insert("com.tly.dao.IMaintainDao.insert", m);
	}

	/*
	 * 修改
	 */
	@Override
	public int update(Maintain m) {
		return getSqlSession().update("com.tly.dao.IMaintainDao.update", m);
	}

	/*
	 * 查询
	 */
	@Override
	public List<Maintain> select(String wxid) {
		return getSqlSession().selectList("com.tly.dao.IMaintainDao.select", wxid);
	}
}
