package com.tly.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.CommissionReward;
import com.tly.service.ICommissionRewardService;

/**
 * 会员、合伙人提成奖励对应表
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/commissionreward")
public class CommissionRewardController {
	
	@Autowired
	private ICommissionRewardService ics;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 查询
	 * @return
	 */
	@RequestMapping("/select")
	public String select(){
		List<CommissionReward> list = ics.select();
		request.setAttribute("list", list);
		return "commissionreward/manage";
	}
}
