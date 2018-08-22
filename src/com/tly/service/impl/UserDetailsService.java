package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IUserDetailsDao;
import com.tly.model.UserDetails;
import com.tly.service.IUserDetailsService;

/**
 * 会员
 * @author yangweihang
 *
 */
public class UserDetailsService implements IUserDetailsService {
	
	private IUserDetailsDao iudao;
	
	public IUserDetailsDao getIudao() {
		return iudao;
	}

	public void setIudao(IUserDetailsDao iudao) {
		this.iudao = iudao;
	}
	
	/**
	 * 新增
	 * @param ud
	 * @return
	 */
	public int insert(UserDetails ud){
		return iudao.insert(ud);
	}

	/*
	 *查询全部
	 */
	@Override
	public List<UserDetails> selectAll() {
		return iudao.selectAll();
	}

	/*
	 *增加一级上线
	 */
	@Override
	public int updateByOneonwxid(UserDetails ud) {
		return iudao.updateByOneonwxid(ud);
	}

	/*
	 *增加二级上线
	 */
	@Override
	public int updateByTwoonwxid(UserDetails ud) {
		return iudao.updateByTwoonwxid(ud);
	}

	/*
	 *增加一级下线
	 */
	@Override
	public int updateByOneupwxid(UserDetails ud) {
		return iudao.updateByOneupwxid(ud);
	}

	/*
	 *增加二级下线
	 */
	@Override
	public int updateByTwoupwxid(UserDetails ud) {
		return iudao.updateByTwoupwxid(ud);
	}

	/*
	 *查询会员一级上线
	 */
	@Override
	public UserDetails selectuseron(int id) {
		return iudao.selectuseron(id);
	}

	/*
	 *查询会员二级上线
	 */
	@Override
	public UserDetails selecttwouseron(int id) {
		return iudao.selecttwouseron(id);
	}
	
	/*
	 *查询会员一级下线
	 */
	@Override
	public List<UserDetails> selectuserup(int id) {
		return iudao.selectuserup(id);
	}


	/*
	 *查询会员二级下线
	 */
	@Override
	public List<UserDetails> selecttwouserup(int id) {
		return iudao.selecttwouserup(id);
	}

	/*
	 *按微信id查询
	 */
	@Override
	public UserDetails selectByWxid(String wxid) {
		return iudao.selectByWxid(wxid);
	}

	/*
	 *查询当月没有消费的会员
	 */
	@Override
	public List<Integer> selectNotXiaofei(Map<String, Object> map) {
		return iudao.selectNotXiaofei(map);
	}

	/*
	 * 按微信id查询
	 */
	@Override
	public UserDetails selectOne(int id) {
		return iudao.selectOne(id);
	}
}
