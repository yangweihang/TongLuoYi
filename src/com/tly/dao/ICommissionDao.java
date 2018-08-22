package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Commission;

/**
 * 上级提成对应表
 * @author yangweihang
 *
 */
public interface ICommissionDao {
	//新增
	public int insert(Commission c);
	//查询租用一级
	public Integer selectZyOne(String wxid);
	//查询租用二级
	public Integer selectZyTwo(String wxid);
	//查询消费一级
	public Integer selectXfOne(String wxid);
	//查询消费二级
	public Integer selectXfTwo(String wxid);
	//查询购买一级
	public Integer selectGmOne(String wxid);
	//查询购买二级
	public Integer selectGmTwo(String wxid);
	//查询总收益
	public Integer selectsumsy(String wxid);
	//按条件查询
	public List<Commission> selecttj(Map<String,Object> map);
}
