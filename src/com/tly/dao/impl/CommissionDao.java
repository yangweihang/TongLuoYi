package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.ICommissionDao;
import com.tly.model.Commission;

/**
 * 上级提成对应表
 * @author yangweihang
 *
 */
public class CommissionDao extends SqlSessionDaoSupport implements ICommissionDao {

	/*
	 * 新增
	 */
	@Override
	public int insert(Commission c) {
		return getSqlSession().insert("com.tly.dao.ICommissionDao.insert", c);
	}

	/*
	 * 查询租用一级
	 */
	@Override
	public Integer selectZyOne(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectZyOne", wxid);
	}

	/*
	 * 查询租用二级
	 */
	@Override
	public Integer selectZyTwo(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectZyTwo", wxid);
	}

	/*
	 * 查询消费一级
	 */
	@Override
	public Integer selectXfOne(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectXfOne", wxid);
	}

	/*
	 * 查询消费二级
	 */
	@Override
	public Integer selectXfTwo(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectXfTwo", wxid);
	}

	/*
	 * 查询购买一级
	 */
	@Override
	public Integer selectGmOne(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectGmOne", wxid);
	}

	/*
	 * 查询购买二级
	 */
	@Override
	public Integer selectGmTwo(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectGmTwo", wxid);
	}

	/*
	 * 查询总收益
	 */
	@Override
	public Integer selectsumsy(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionDao.selectsumsy", wxid);
	}

	/*
	 * 按条件查询
	 */
	@Override
	public List<Commission> selecttj(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.ICommissionDao.selecttj", map);
	}

}
