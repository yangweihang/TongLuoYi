package com.tly.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IAdministratorDao;
import com.tly.model.Administrator;

/**
 * 管理员
 * @author yangweihang
 *
 */
public class AdministratorDao extends SqlSessionDaoSupport implements IAdministratorDao  {

	/*
	 *查询全部
	 */
	@Override
	public List<Administrator> selectAll() {
		return getSqlSession().selectList("com.tly.dao.IAdministratorDao.selectAll", null);
	}

	/*
	 *新增管理员
	 */
	@Override
	public int insert(Administrator a) {
		return getSqlSession().insert("com.tly.dao.IAdministratorDao.insert", a);
	}

}
