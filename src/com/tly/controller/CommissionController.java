package com.tly.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Commission;
import com.tly.model.MembershipLevel;
import com.tly.model.Partner;
import com.tly.service.ICommissionService;
import com.tly.service.IMembershipLevelService;
import com.tly.service.IPartnerService;

/**
 * 上下级对应表
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/commission")
public class CommissionController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ICommissionService icms;
	
	@Autowired
	private IPartnerService ips;
	
	@Autowired
	private IMembershipLevelService imls;
	
	/**
	 * 查询钱包明细
	 * @param id
	 * @return
	 */
	@RequestMapping("/select")
	public String select(String wxid){
		//查询总收益
		Integer sm = icms.selectsumsy(wxid);
		//查询收益
		Integer xfone = icms.selectXfOne(wxid);
		Integer xftwo = icms.selectXfTwo(wxid);
		Integer zyone = icms.selectZyOne(wxid);
		Integer zytwo = icms.selectZyTwo(wxid);
		Integer gmone = icms.selectGmOne(wxid);
		Integer gmtwo = icms.selectGmTwo(wxid);
		//计算经营收益
		int money = xfone+xftwo+zyone+zytwo+gmone+gmtwo;
		//查询余额
		Partner p = ips.selectWxid(wxid);
		//查询会员
		MembershipLevel ml = imls.selectByWxid(wxid);
		request.setAttribute("sm", sm);
		request.setAttribute("xfone", xfone);
		request.setAttribute("xftwo", xftwo);
		request.setAttribute("zyone", zyone);
		request.setAttribute("zytwo", zytwo);
		request.setAttribute("gmone", gmone);
		request.setAttribute("gmtwo", gmtwo);
		request.setAttribute("money", money);
		request.setAttribute("p", p);
		request.setAttribute("ml", ml);
		return "commission/manage";
	}
	
	/**
	 * 查询明细
	 * @return
	 */
	@RequestMapping("/detail")
	public String detail(int type,String wxid){
		Map<String, Object> map = new HashMap<String,Object>();
		List<Commission> list = null;
		map.put("wxid", wxid);
		list = icms.selecttj(map);
		request.setAttribute("list", list);
		request.setAttribute("type", type);
		return "commission/detail";
	}
	
}
