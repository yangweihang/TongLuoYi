package com.tly.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IPartnerLevelDao;
import com.tly.model.PartnerLevel;

/**
 * 合伙人级别对应
 * @author yangweihang
 *
 */
public class PartnerLevelDao extends SqlSessionDaoSupport implements IPartnerLevelDao {

	/*
	 *新增
	 */
	@Override
	public int insert(PartnerLevel pl) {
		return getSqlSession().insert("com.tly.dao.IPartnerLevelDao.insert", pl);
	}

	/*
	 *修改合伙人级别
	 */
	@Override
	public int update(PartnerLevel pl) {
		return getSqlSession().update("com.tly.dao.IPartnerLevelDao.update", pl);
	}

}
