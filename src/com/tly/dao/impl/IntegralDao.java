package com.tly.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IIntegralDao;
import com.tly.model.Integral;

/**
 * 积分明细
 * @author yangweihang
 *
 */
public class IntegralDao extends SqlSessionDaoSupport implements IIntegralDao {
	/*
	 *新增
	 */
	public int insert(Integral i){
		return getSqlSession().insert("com.tly.dao.IIntegralDao.insert", i);
	}

	/*
	 *按微信id查询一个
	 */
	@Override
	public Integral selectOne(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IIntegralDao.selectOne", wxid);
	}

	/*
	 *修改消费
	 */
	@Override
	public int updatexiaofei(Integral i) {
		return getSqlSession().update("com.tly.dao.IIntegralDao.updatexiaofei", i);
	}

	/*
	 *修改星评
	 */
	@Override
	public int updatexingping(Integral i) {
		return getSqlSession().update("com.tly.dao.IIntegralDao.updatexingping", i);
	}

	/*
	 *修改留言
	 */
	@Override
	public int updateliuyan(Integral i) {
		return getSqlSession().update("com.tly.dao.IIntegralDao.updateliuyan", i);
	}

	/*
	 *按微信查询积分
	 */
	@Override
	public Integer selectByWxid(Map<String,Object> map) {
		System.out.println("wxid"+map);
		Integer s = getSqlSession().selectOne("com.tly.dao.IIntegralDao.selectByWxid", map);
		System.out.println("s"+s);
		return s;
	}
}
