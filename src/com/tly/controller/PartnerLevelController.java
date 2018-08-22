package com.tly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.PartnerLevel;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerLevelService;

/**
 * 合伙人级别对应
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/partnerlevel")
public class PartnerLevelController {
	
	@Autowired
	private IPartnerLevelService ipls;
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	/**
	 * 修改合伙人级别
	 * @param pl
	 * @return
	 */
	@RequestMapping("/update")
	public String update(PartnerLevel pl){
		Double money = ipes.selectBySumMoney(pl.getWxid());
		if(money < 100000){
			pl.setLevel("普通");
		}else if(money >= 100000 && money < 200000){
			pl.setLevel("金牌");
		}else if(money >= 200000 && money < 500000){
			pl.setLevel("钻石");
		}else if(money >= 500000){
			pl.setLevel("超级");
		}
		System.out.println(pl.getLevel());
		int result = ipls.update(pl);
		return "partnerlevel/verification";
	}
}
