package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.Deviceinout;

/**
 * 设备出入库明细
 * @author yangweihang
 *
 */
public interface IDeviceinoutService {
	//新增
	public int insert(Deviceinout d);
	//分页查询
	public List<Deviceinout> selectByPage(Map<String,Object> map);
	//查询总数
	public Integer selectByTotal(Map<String,Object> map,int pageSize);
	//删除
	public int delete(Integer[] arr);
	//修改
	public int update(Deviceinout d);
	//按id查询
	public Deviceinout selectOne(int id);
	//按设备编号查询
	public List<Deviceinout> selectBySerialnum(String serialnum);
	//新增入库
	public int insertin(Deviceinout d);
	//新增出库
	public int insertout(Deviceinout d);
	//查询那个是重复的
	public Deviceinout selectmax(String serialnum,String inventorystatus);
	//新增报废
	public int insertscrap(Deviceinout d);
}
