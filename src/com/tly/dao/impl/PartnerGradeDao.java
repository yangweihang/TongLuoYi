package com.tly.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IPartnerGradeDao;
import com.tly.model.PartnerGrade;

/**
 * 合伙人上下级对应表
 * @author yangweihang
 *
 */
public class PartnerGradeDao extends SqlSessionDaoSupport implements IPartnerGradeDao {

	/*
	 *增加上级
	 */
	@Override
	public int inserton(PartnerGrade pg) {
		return getSqlSession().insert("com.tly.dao.IPartnerGradeDao.inserton", pg);
	}

	/*
	 *增加下级
	 */
	@Override
	public int insertup(PartnerGrade pg) {
		return getSqlSession().insert("com.tly.dao.IPartnerGradeDao.insertup", pg);
	}

}
