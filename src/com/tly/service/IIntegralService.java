package com.tly.service;

import com.tly.model.Integral;

/**
 * 积分详细
 * @author yangweihang
 *
 */
public interface IIntegralService {
	//新增
	public int insert(Integral i);
	//按微信id查询一个
	public Integral selectOne(String wxid);
	//修改消费
	public int updatexiaofei(Integral i);
	//修改星评
	public int updatexingping(Integral i);
	//修改留言
	public int updateliuyan(Integral i);
}
