package com.tly.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.model.Maintain;
import com.tly.service.IMaintainService;

/**
 * 故障设备维修明细
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/maintain")
public class MaintainController {
	
	@Autowired
	private IMaintainService ims;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 新增
	 * @param m
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Maintain m){
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(new Date());
		m.setStarttime(date);
		ims.insert(m);
		return select("djs");
	}
	
	/**
	 * 查询
	 * @return
	 */
	@RequestMapping("/select")
	public String select(String wxid){
		List<Maintain> list = ims.select(wxid);
		request.setAttribute("list", list);
		return "maintain/manage";
	}
	
	/**
	 * 修改
	 * @param m
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Maintain m) {
		ims.update(m);
		return select("djs");
	}
	
}
