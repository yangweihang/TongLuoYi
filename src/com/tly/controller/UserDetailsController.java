package com.tly.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.MembershipLevel;
import com.tly.model.UserDetails;
import com.tly.service.IMembershipLevelService;
import com.tly.service.IUserDetailsService;

@Controller
@SuppressWarnings("unused")
@RequestMapping("/userdetails")
public class UserDetailsController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IUserDetailsService ius;
	
	@Autowired
	private IMembershipLevelService imls;
	
	/**
	 * 新增
	 * @param ud
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(UserDetails ud){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String date = sdf.format(new Date());
		ud.setJrtime(date);
		int result = ius.insert(ud);
		//新增会员级别
		if(result > 0){
			MembershipLevel ml = new MembershipLevel();
			ml.setWxid(ud.getWxid());
			ml.setLevel("普通会员");
			imls.insert(ml);
		}
		request.setAttribute("result", result);
		return selectAll();
	}
	
	/**
	 * 查询全部
	 * @return
	 */
	@RequestMapping("/selectall")
	public String selectAll(){
		List<UserDetails> list = ius.selectAll();
		request.setAttribute("list", list);
		return "userdetails/manage";
	}
	
	/**
	 * 增加一级上线
	 * @param ud
	 * @return
	 */
	@RequestMapping("/oneonwxid")
	public String updateByOneonwxid(UserDetails ud){
		int result = ius.updateByOneonwxid(ud);
		return selectAll();
	}
	
	/**
	 * 增加二级下线
	 * @param ud
	 * @return
	 */
	@RequestMapping("/twoonwxid")
	public String updateByTwoonwxid(UserDetails ud){
		int result = ius.updateByTwoonwxid(ud);
		return selectAll();
	}
	
	/**
	 * 增加一级下线
	 * @param ud
	 * @return
	 */
	@RequestMapping("/oneupwxid")
	public String updateByOneupwxid(UserDetails ud){
		int result = ius.updateByOneupwxid(ud);
		return selectAll();
	}
	
	/**
	 * 增加二级下线
	 * @param ud
	 * @return
	 */
	@RequestMapping("/twoupwxid")
	public String updateByTwoupwxid(UserDetails ud){
		int result = ius.updateByTwoupwxid(ud);
		return selectAll();
	}
	
	/**
	 * 查询会员一级上线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectuseron")
	public String selectuseron(int id){
		UserDetails ud = ius.selectuseron(id);
		request.setAttribute("u", ud);
		return "userdetails/ongrade";
	}
	
	/**
	 * 查询会员二级上线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selecttwouseron")
	public String selecttwouseron(int id){
		UserDetails ud = ius.selecttwouseron(id);
		request.setAttribute("u", ud);
		return "userdetails/ongrade";
	}
	
	/**
	 * 查询会员一级下线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectuserup")
	public String selectuserup(int id){
		List<UserDetails> list = ius.selectuserup(id);
		request.setAttribute("list", list);
		return "userdetails/upgrade";
	}
	
	/**
	 * 查询会员二级下线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selecttwouserup")
	public String selecttwouserup(int id){
		List<UserDetails> list = ius.selecttwouserup(id);
		request.setAttribute("list", list);
		return "userdetails/upgrade";
	}
	
}
