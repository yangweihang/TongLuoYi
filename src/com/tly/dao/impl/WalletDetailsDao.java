package com.tly.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IWalletDetailsDao;
import com.tly.model.WalletDetails;

/**
 * 钱包明细
 * @author yangweihang
 *
 */
public class WalletDetailsDao extends SqlSessionDaoSupport implements IWalletDetailsDao {

	/*
	 * 新增
	 */
	@Override
	public int insert(WalletDetails wd) {
		return getSqlSession().insert("com.tly.dao.IWalletDetailsDao.insert", wd);
	}

}
