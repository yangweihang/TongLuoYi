package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.PartnerEquipment;

/**
 * 合伙人设备对应
 * @author yangweihang
 *
 */
public interface IPartnerEquipmentService {
	//新增
	public int insert(PartnerEquipment pe);
	//按微信id查询租用设备信息
	public List<Map<String,Object>> selectByZYEquipment(Map<String,Object> map);
	//按微信id查询销售设备信息
	public List<Map<String,Object>> selectByXSEquipment(Map<String,Object> map);
	//按微信id查询合伙人消费的金额
	public Double selectBySumMoney(String wxid);
}
