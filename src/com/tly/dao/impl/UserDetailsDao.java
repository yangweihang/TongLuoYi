package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IUserDetailsDao;
import com.tly.model.UserDetails;

/**
 * 会员
 * @author yangweihang
 *
 */
public class UserDetailsDao extends SqlSessionDaoSupport implements IUserDetailsDao {

	/*
	 *新增会员
	 */
	@Override
	public int insert(UserDetails ud) {
		return getSqlSession().insert("com.tly.dao.IUserDetailsDao.insert",ud);
	}

	/*
	 *查询全部
	 */
	@Override
	public List<UserDetails> selectAll() {
		return getSqlSession().selectList("com.tly.dao.IUserDetailsDao.selectAll", null);
	}

	/*
	 *增加一级上线
	 */
	@Override
	public int updateByOneonwxid(UserDetails ud) {
		return getSqlSession().update("com.tly.dao.IUserDetailsDao.updateByOneonwxid", ud);
	}

	/*
	 *增加二级上线
	 */
	@Override
	public int updateByTwoonwxid(UserDetails ud) {
		return getSqlSession().update("com.tly.dao.IUserDetailsDao.updateByTwoonwxid", ud);
	}

	/*
	 *增加一级下线
	 */
	@Override
	public int updateByOneupwxid(UserDetails ud) {
		return getSqlSession().update("com.tly.dao.IUserDetailsDao.updateByOneupwxid", ud);
	}

	/*
	 *增加二级下线
	 */
	@Override
	public int updateByTwoupwxid(UserDetails ud) {
		return getSqlSession().update("com.tly.dao.IUserDetailsDao.updateByTwoupwxid", ud);
	}

	/**
	 * 查询会员一级上线
	 * @param id
	 * @return
	 */
	@Override
	public UserDetails selectuseron(int id) {
		return getSqlSession().selectOne("com.tly.dao.IUserDetailsDao.selectuseron",id);
	}

	/*
	 *查询会员二级上线
	 */
	@Override
	public UserDetails selecttwouseron(int id) {
		return getSqlSession().selectOne("com.tly.dao.IUserDetailsDao.selecttwouseron", id);
	}
	
	/*
	 *查询会员一级下线
	 */
	@Override
	public List<UserDetails> selectuserup(int id) {
		return getSqlSession().selectList("com.tly.dao.IUserDetailsDao.selectuserup", id);
	}


	/*
	 *查询会员二级下线
	 */
	@Override
	public List<UserDetails> selecttwouserup(int id) {
		return getSqlSession().selectList("com.tly.dao.IUserDetailsDao.selecttwouserup", id);
	}

	/*
	 *按微信id查询
	 */
	@Override
	public UserDetails selectByWxid(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IUserDetailsDao.selectByWxid", wxid);
	}

	/*
	 *查询当月没有消费的会员
	 */
	@Override
	public List<Integer> selectNotXiaofei(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IUserDetailsDao.selectNotXiaofei", map);
	}

	/*
	 * 按id查询
	 */
	@Override
	public UserDetails selectOne(int id) {
		return getSqlSession().selectOne("com.tly.dao.IUserDetailsDao.selectOne", id);
	}

}
