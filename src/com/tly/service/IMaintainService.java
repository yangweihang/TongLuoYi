package com.tly.service;

import java.util.List;

import com.tly.model.Maintain;

/**
 * 故障设备维修明细表 
 * @author yangweihang
 *
 */
public interface IMaintainService {
	
	//新增
	public int insert(Maintain m);
	//修改
	public int update(Maintain m);
	//查询
	public List<Maintain> select(String wxid);
}
