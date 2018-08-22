package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IPartnerEquipmentDao;
import com.tly.model.PartnerEquipment;
import com.tly.service.IPartnerEquipmentService;

/**
 * 合伙人设备对应
 * @author yangweihang
 *
 */
public class PartnerEquipmentService implements IPartnerEquipmentService {
	
	private IPartnerEquipmentDao ipedao;
	
	public IPartnerEquipmentDao getIpedao() {
		return ipedao;
	}

	public void setIpedao(IPartnerEquipmentDao ipedao) {
		this.ipedao = ipedao;
	}

	/*
	 *新增
	 */
	@Override
	public int insert(PartnerEquipment pe) {
		return ipedao.insert(pe);
	}

	/*
	 *按微信id查询租用设备信息
	 */
	@Override
	public List<Map<String, Object>> selectByZYEquipment(Map<String, Object> map) {
		return ipedao.selectByZYEquipment(map);
	}

	/*
	 *按微信id查询销售设备信息
	 */
	@Override
	public List<Map<String, Object>> selectByXSEquipment(Map<String, Object> map) {
		return ipedao.selectByXSEquipment(map);
	}

	/*
	 *按微信id查询合伙人消费的金额
	 */
	@Override
	public Double selectBySumMoney(String wxid) {
		return ipedao.selectBySumMoney(wxid);
	}

}
