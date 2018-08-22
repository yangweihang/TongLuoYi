package com.tly.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.service.IPartnerEquipmentService;

/**
 * 合伙人设备对应
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/partnerequipment")
public class PartnerEquipmentController {
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询合伙人设备信息
	 * @param pwxid
	 * @return
	 */
	@RequestMapping("/select")
	public String selectEquipment(String pwxid){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pwxid", pwxid);
		List<Map<String, Object>> list = ipes.selectByXSEquipment(map);
		List<Map<String, Object>> list1 = ipes.selectByZYEquipment(map);
		request.setAttribute("list", list);
		request.setAttribute("list1", list1);
		return "partner/selectequipment";
	}
}
