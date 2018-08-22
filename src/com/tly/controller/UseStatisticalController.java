package com.tly.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Commission;
import com.tly.model.CommissionReward;
import com.tly.model.MembershipLevel;
import com.tly.model.Partner;
import com.tly.model.UseStatistical;
import com.tly.model.UserDetails;
import com.tly.service.ICommissionRewardService;
import com.tly.service.ICommissionService;
import com.tly.service.IMembershipLevelService;
import com.tly.service.IPartnerService;
import com.tly.service.IUseStatisticalService;
import com.tly.service.IUserDetailsService;

/**
 * 会员使用统计
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/usestatistical")
public class UseStatisticalController {
	
	@Autowired
	private IUseStatisticalService iuss;
	
	@Autowired
	private IUserDetailsService ius;
	
	@Autowired
	private ICommissionService icms;
	
	@Autowired
	private ICommissionRewardService ics;
	
	@Autowired
	private IMembershipLevelService imls;
	
	@Autowired
	private IPartnerService ips;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 增加
	 * @param us
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(UseStatistical us){
		//新增会员使用
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String date = sdf.format(new Date());
		us.setKjtime(date);
		int result = iuss.insert(us);
		
		//新增会员消费提成
		//按会员id查询会员
		UserDetails u = ius.selectOne(us.getUid());
		//查询一级上级
		UserDetails u1 = ius.selectuseron(u.getId());
		//查询二级上级
		UserDetails u2 = ius.selecttwouseron(u.getId());
		//增加一级上线提成
		if(u1 != null){
			Commission c = new Commission();
			//查询级别
			MembershipLevel m = imls.selectByWxid(u1.getWxid());
			c.setWxid(u.getWxid());
			c.setOnewxid(u1.getWxid());
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("level", m.getLevel());
			map.put("identity", "会员");
			CommissionReward cr = ics.selectByC(map);
			c.setXfone(cr.getXftcone());
			icms.insert(c);
		}
		//新增二级上线提成
		if(u2 != null){
			Commission c1 = new Commission();
			//查询级别
			MembershipLevel m = imls.selectByWxid(u2.getWxid());
			c1.setWxid(u.getWxid());
			c1.setTwowxid(u2.getWxid());
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("level", m.getLevel());
			map.put("identity", "会员");
			CommissionReward cr = ics.selectByC(map);
			c1.setXftwo(cr.getXftctwo());
			icms.insert(c1);
		}
		
		return "usestatistical/insert";
	}
	
	/**
	 * 按微信id查询
	 * @param uid
	 * @return
	 */
	@RequestMapping("/selectByUid")
	public String selectByUid(int uid){
		List<UseStatistical> list = iuss.selectByUid(uid);
		request.setAttribute("list", list);
		return "usestatistical/manage";
	}
	
}
