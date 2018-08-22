package com.tly.service;

import com.tly.model.MembershipLevel;

/**
 * 会员级别对应
 * @author yangweihang
 *
 */
public interface IMembershipLevelService {
	//新增
	public int insert(MembershipLevel ml);
	//修改
	public int update(MembershipLevel ml);
	//按微信id查询
	public MembershipLevel selectByWxid(String wxid);
}
