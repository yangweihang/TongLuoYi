package com.tly.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IUseStatisticalDao;
import com.tly.model.UseStatistical;

/**
 * 会员使用统计
 * @author yangweihang
 *
 */
public class UseStatisticalDao extends SqlSessionDaoSupport implements IUseStatisticalDao {

	/*
	 *新增
	 */
	@Override
	public int insert(UseStatistical us) {
		return getSqlSession().insert("com.tly.dao.IUseStatisticalDao.insert", us);
	}

	/*
	 *按会员id查询
	 */
	@Override
	public List<UseStatistical> selectByUid(int uid) {
		return getSqlSession().selectList("com.tly.dao.IUseStatisticalDao.selectByUid",uid);
	}

	/*
	 *查询使用次数
	 */
	@Override
	public Integer selectByCishu(Integer uid) {
		return getSqlSession().selectOne("com.tly.dao.IUseStatisticalDao.selectByCishu", uid);
	}

	/*
	 *查询使用时长
	 */
	@Override
	public Integer selectByduration(int uid) {
		return getSqlSession().selectOne("com.tly.dao.IUseStatisticalDao.selectByduration",uid);
	}

}
