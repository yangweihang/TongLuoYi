package com.tly.dao;

import com.tly.model.PartnerLevel;

/**
 * 合伙人级别对应
 * @author yangweihang
 *
 */
public interface IPartnerLevelDao {
	//新增
	public int insert(PartnerLevel pl);
	//修改合伙人级别
	public int update(PartnerLevel pl);
}
