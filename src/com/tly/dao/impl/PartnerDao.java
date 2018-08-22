package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IPartnerDao;
import com.tly.model.Partner;

/**
 * 合伙人
 * @author yangweihang
 *
 */
public class PartnerDao extends SqlSessionDaoSupport implements IPartnerDao {

	/*
	 *新增
	 */
	@Override
	public int insert(Partner p) {
		return getSqlSession().insert("com.tly.dao.IPartnerDao.insert", p);
	}

	/*
	 *查询合伙人
	 */
	@Override
	public List<Map<String, Object>> selectpartner() {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectpartner", null);
	}

	/*
	 *查询一级上线
	 */
	@Override
	public Partner selectOneOn(int id) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectOneOn", id);
	}

	/*
	 *查询二级上线
	 */
	@Override
	public Partner selectTwoOn(int id) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectTwoOn", id);
	}

	/*
	 *查询一级下线
	 */
	@Override
	public List<Partner> selectOneUp(int id) {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectOneUp", id);
	}

	/*
	 *查询二级下线
	 */
	@Override
	public List<Partner> selectTwoUp(int id) {
		return getSqlSession().selectList("com.tly.dao.IPartnerDao.selectTwoUp", id);
	}

	/*
	 * 按微信id查询
	 */
	@Override
	public Partner selectWxid(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectWxid", wxid);
	}

	/*
	 * 修改余额
	 */
	@Override
	public int updatebalance(Partner p) {
		return getSqlSession().update("com.tly.dao.IPartnerDao.updatebalance", p);
	}

	/*
	 * 查询余额
	 */
	@Override
	public Partner selectbalance(int id) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerDao.selectbalance", id);
	}

}
