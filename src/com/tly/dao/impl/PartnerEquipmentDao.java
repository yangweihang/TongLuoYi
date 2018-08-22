package com.tly.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.tly.dao.IPartnerEquipmentDao;
import com.tly.model.PartnerEquipment;

/**
 * 合伙人设备对应表
 * @author yangweihang
 *
 */
public class PartnerEquipmentDao extends SqlSessionDaoSupport implements IPartnerEquipmentDao {

	/*
	 *新增
	 */
	@Override
	public int insert(PartnerEquipment pe) {
		return getSqlSession().insert("com.tly.dao.IPartnerEquipmentDao.insert", pe);
	}

	/*
	 *按微信id查询租用设备信息
	 */
	@Override
	public List<Map<String, Object>> selectByZYEquipment(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IPartnerEquipmentDao.selectByZYEquipment", map);
	}

	/*
	 *按微信id查询销售设备信息
	 */
	@Override
	public List<Map<String, Object>> selectByXSEquipment(Map<String, Object> map) {
		return getSqlSession().selectList("com.tly.dao.IPartnerEquipmentDao.selectByXSEquipment", map);
	}

	/*
	 *按微信id查询合伙人消费的金额
	 */
	@Override
	public Double selectBySumMoney(String wxid) {
		return getSqlSession().selectOne("com.tly.dao.IPartnerEquipmentDao.selectBySumMoney", wxid);
	}

}
