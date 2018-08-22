package com.tly.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IDeviceinoutDao;
import com.tly.model.Deviceinout;

/**
 * 设备出入库明细
 * @author yangweihang
 *
 */
public class DeviceinoutDao extends SqlSessionDaoSupport implements IDeviceinoutDao {
	
	/* 
	 * 新增
	 */
	public int insert(Deviceinout d){
		return getSqlSession().insert("com.tly.dao.IDeviceinoutDao.insert",d);
	}
	
	/*
	 *分页查询
	 */
	public List<Deviceinout> selectByPage(Map<String,Object> map){
		return getSqlSession().selectList("com.tly.dao.IDeviceinoutDao.selectByPage", map);
	}
	/*
	 *查询总数
	 */
	@Override
	public Integer selectByTotal(Map<String, Object> map) {
		return getSqlSession().selectOne("com.tly.dao.IDeviceinoutDao.selectByTotal",map);
	}
	/*
	 *删除
	 */
	@Override
	public int delete(Integer[] arr) {
		return getSqlSession().delete("com.tly.dao.IDeviceinoutDao.delete", arr);
	}
	/*
	 *修改
	 */
	@Override
	public int update(Deviceinout d) {
		return getSqlSession().update("com.tly.dao.IDeviceinoutDao.update",d);
	}
	/*
	 *按id查询
	 */
	@Override
	public Deviceinout selectOne(int id) {
		return getSqlSession().selectOne("com.tly.dao.IDeviceinoutDao.selectOne",id);
	}

	/*
	 *按设备编号查询
	 */
	@Override
	public List<Deviceinout> selectBySerialnum(String serialnum) {
		return getSqlSession().selectList("com.tly.dao.IDeviceinoutDao.selectBySerialnum", serialnum);
	}

	/*
	 *新增入库
	 */
	@Override
	public int insertin(Deviceinout d) {
		return getSqlSession().insert("com.tly.dao.IDeviceinoutDao.insertin", d);
	}

	/*
	 *新增出库
	 */
	@Override
	public int insertout(Deviceinout d) {
		return getSqlSession().insert("com.tly.dao.IDeviceinoutDao.insertout",d);
	}

	/*
	 *查询最大的
	 */
	@Override
	public Deviceinout selectmax(String serialnum,String inventorystatus) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("serialnum", serialnum);
		if(!inventorystatus.equals("") && inventorystatus != null && !inventorystatus.isEmpty()){
			map.put("inventorystatus", inventorystatus);
		}
		return getSqlSession().selectOne("com.tly.dao.IDeviceinoutDao.selectmax", map);
	}

	/*
	 *新增报废
	 */
	@Override
	public int insertscrap(Deviceinout d) {
		return getSqlSession().insert("com.tly.dao.IDeviceinoutDao.insertscrap", d);
	}
	

}
