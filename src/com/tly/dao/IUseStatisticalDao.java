package com.tly.dao;

import java.util.List;

import com.tly.model.UseStatistical;

/**
 * 会员使用统计
 * @author yangweihang
 *
 */
public interface IUseStatisticalDao {
	//新增
	public int insert(UseStatistical us);
	//按用户id查询
	public List<UseStatistical> selectByUid(int uid);
	//查询使用次数
	public Integer selectByCishu(Integer uid);
	//查询使用时长
	public Integer selectByduration(int uid);
}
