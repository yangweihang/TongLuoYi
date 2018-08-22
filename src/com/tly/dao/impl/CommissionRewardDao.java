package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.ICommissionRewardDao;
import com.tly.model.CommissionReward;

/**
 * 会员、合伙人提成奖励对应表
 * @author yangweihang
 *
 */
public class CommissionRewardDao extends SqlSessionDaoSupport implements ICommissionRewardDao {

	/*
	 *查询
	 */
	@Override
	public List<CommissionReward> select() {
		return getSqlSession().selectList("com.tly.dao.ICommissionRewardDao.select", null);
	}

	/*
	 * 按条件查询
	 */
	@Override
	public CommissionReward selectByC(Map<String, Object> map) {
		return getSqlSession().selectOne("com.tly.dao.ICommissionRewardDao.selectByC", map);
	}

}
