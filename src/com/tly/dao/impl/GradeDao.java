package com.tly.dao.impl;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IGradeDao;
import com.tly.model.Grade;

public class GradeDao extends SqlSessionDaoSupport implements IGradeDao {

	/*
	 *增加上线
	 */
	@Override
	public int insertOnId(Grade g) {
		return getSqlSession().insert("com.tly.dao.IGradeDao.insertOnId",g);
	}

	/*
	 *增加下线
	 */
	@Override
	public int insertUpId(Grade g) {
		return getSqlSession().insert("com.tly.dao.IGradeDao.insertUpId", g);
	}

	/*
	 *查询下线有多少人
	 */
	@Override
	public Integer selectByUp(int id) {
		return getSqlSession().selectOne("com.tly.dao.IGradeDao.selectByUp", id);
	}
	
	/*
	 *删除没有消费的会员
	 */
	public int deleteNotXiaofei(Integer[] in){
		return getSqlSession().delete("com.tly.dao.IGradeDao.deleteNotXiaofei", in);
	}

}
