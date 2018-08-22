package com.tly.dao;

import com.tly.model.MembershipLevel;

/**
 * 会员级别对应
 * @author yangweihang
 *
 */
public interface IMembershipLevelDao {
	//增加
	public int insert(MembershipLevel ml);
	//修改
	public int update(MembershipLevel ml);
	//按微信id查询
	public MembershipLevel selectByWxid(String wxid);
}
