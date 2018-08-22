package com.tly.controller;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Grade;
import com.tly.service.IGradeService;
import com.tly.service.IUserDetailsService;

@Controller
@RequestMapping("/grade")
public class GradeController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IGradeService igs;
	
	@Autowired
	private IUserDetailsService ius;
	
	/**
	 * 增加上级会员
	 * @param g
	 * @return
	 */
	@RequestMapping("/insertonid")
	public String insertOnId(Grade g){
		int result = igs.insertOnId(g);
		return "userdetails/ongrade";
	}
	
	/**
	 * 增加下级会员
	 * @param g
	 * @return
	 */
	@RequestMapping("/insertupid")
	public String insertUpId(Grade g){
		int result = igs.insertUpId(g);
		return "userdetails/upgrade";
	}
	
	/**
	 * 删除没有消费记录的下级会员
	 * @return
	 */
	@RequestMapping("/deleteuser")
	public String deleteUser(){
		Map<String,Object> map = new HashMap<String,Object>();
		Calendar date = Calendar.getInstance();
		//获取系统的年份
        int year = date.get(Calendar.YEAR);
        //获取系统的月份
        String month = String.valueOf(date.get(Calendar.MONTH) + 1);
		map.put("year", year);
		map.put("month", month);
		String mon = null;
		if(month.length() == 1){
			mon = "%-0"+month+"-%";
		}else{
			mon = "%-"+month+"-%";
		}
		map.put("mon", mon);
		List<Integer> list = ius.selectNotXiaofei(map);
		System.out.println("list"+list);
		Integer[] in = new Integer[list.size()];
		for (int i = 0; i < list.size(); i++) {
			in[i] = list.get(i);
		}
		int result = igs.deleteNotXiaofei(in);
		return "membershiplevel/update";
	}
}
