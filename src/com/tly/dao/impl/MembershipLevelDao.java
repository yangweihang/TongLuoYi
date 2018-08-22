package com.tly.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IMembershipLevelDao;
import com.tly.model.MembershipLevel;

/**
 * 会员级别对应
 * @author yangweihang
 *
 */
public class MembershipLevelDao extends SqlSessionDaoSupport implements IMembershipLevelDao {

	/*
	 *新增
	 */
	@Override
	public int insert(MembershipLevel ml) {
		return getSqlSession().insert("com.tly.dao.IMembershipLevelDao.insert", ml);
	}

	/*
	 *修改
	 */
	@Override
	public int update(MembershipLevel ml) {
		return getSqlSession().update("com.tly.dao.IMembershipLevelDao.update", ml);
	}

	/*
	 * 按微信id查询
	 */
	@Override
	public MembershipLevel selectByWxid(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IMembershipLevelDao.selectByWxid", wxid);
	}

}
