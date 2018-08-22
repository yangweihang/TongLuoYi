package com.tly.service;

import java.util.List;

import com.tly.model.UseStatistical;

/**
 * 会员使用统计
 * @author yangweihang
 *
 */
public interface IUseStatisticalService {
	
	//新增
	public int insert(UseStatistical us);
	//按用户id查询
	public List<UseStatistical> selectByUid(int uid);
	/*//查询使用次数
	public int selectByTime(int uid);
	//查询使用时长
	public int selectByduration(int uid);*/

}
