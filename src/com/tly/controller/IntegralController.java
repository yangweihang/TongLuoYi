package com.tly.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.dao.IIntegralDao;
import com.tly.model.Integral;

@Controller
@RequestMapping("/integral")
public class IntegralController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IIntegralDao itdao;
	
	/**
	 * 新增
	 * @param i
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Integral i){
		int result = itdao.insert(i);
		return selectOne("2109-09");
	}
	
	/**
	 * 按微信id查询
	 * @param wxid
	 * @return
	 */
	@RequestMapping("/selectOne")
	public String selectOne(String wxid){
		Integral it = itdao.selectOne(wxid);
		request.setAttribute("it", it);
		return "integral/manage";
	}
	
}
