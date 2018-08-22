package com.tly.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Administrator;
import com.tly.service.IAdministratorService;

/**
 * 管理员
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/administrator")
public class AdministratorController {
	
	@Autowired
	private IAdministratorService ias;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 新增管理员
	 * @param a
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Administrator a){
		int result = ias.insert(a);
		return "administrator/insert";
	}
	
	/**
	 * 查询全部
	 * @return
	 */
	@RequestMapping("/select")
	public String selectAll(){
		List<Administrator> list = ias.selectAll();
		request.setAttribute("list", list);
		return "administrator/manage";
	}
}
