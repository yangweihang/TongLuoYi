package com.tly.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.MembershipLevel;
import com.tly.model.UserDetails;
import com.tly.service.IGradeService;
import com.tly.service.IMembershipLevelService;
import com.tly.service.IUserDetailsService;

/**
 * 会员等级对应
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/membershiplevel")
public class MembershipLevelController {
	
	@Autowired
	private IMembershipLevelService imls;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IGradeService igs;
	
	@Autowired
	private IUserDetailsService ius;
	
	/**
	 * 修改会员级别
	 * @param ml
	 * @return
	 */
	@RequestMapping("/update")
	public String update(MembershipLevel ml){
		//按微信id查询当前的会员
		UserDetails ud = ius.selectByWxid(ml.getWxid());
		//查询改会员有多少一级下线
		Integer total = igs.selectByUp(ud.getId());
		if(total < 100){
			ml.setLevel("普通");
		}else if(total >= 100 && total < 500){
			ml.setLevel("金牌");
		}else if(total >= 500 && total < 1000){
			ml.setLevel("钻石");
		}else if(total >= 1000){
			ml.setLevel("超级");
		}
		int result = imls.update(ml);
		return "membershiplevel/update";
	}
	
}
