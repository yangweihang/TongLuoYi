package com.tly.controller;

import java.text.SimpleDateFormat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tly.dao.IDeviceinoutDao;
import com.tly.model.Deviceinout;
import com.tly.model.Inventory;
import com.tly.service.IDeviceinoutService;
import com.tly.service.IInventoryService;

/**
 * 设备出入库明细
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/deviceinout")
public class DeviceinoutController {
	@Autowired
	private IDeviceinoutService ids;
	@Autowired
	private IInventoryService iis;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 新增
	 * @param d
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Deviceinout d){
		d.setInventorystatus("入库");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String date = sdf.format(new Date());
		d.setIntime(date);
		ids.insert(d);
		return selectByPage(1);
	}
	
	/**
	 * 分页查询
	 * @param pageNum 页数
	 * @return
	 */
	@RequestMapping("/selectByPage")
	public String selectByPage(int pageNum){
		int page = (pageNum - 1) * 3;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageNum", page);
		map.put("pageSize", 3);
		List<Deviceinout> list = ids.selectByPage(map);
		Integer total = ids.selectByTotal(map,3);
		request.setAttribute("list", list);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("total", total);
		return "deviceinout/manage";
	}
	
	/**
	 * 批量删除
	 * @param arr
	 * @return
	 */
	@RequestMapping("/deleteByd")
	public String delete(Integer[] arr){
		int i = ids.delete(arr);
		String result = "fail";
		if(i > 0){
			result = "success";
		}
		return selectByPage(1);
	}
	
	/**
	 * 修改
	 * @param d
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Deviceinout d){
		if(d.getInventorystatus().equals("出库")){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			String date = sdf.format(new Date());
			d.setOuttime(date);
		}
		int i = ids.update(d);
		String result = "fail";
		if(i > 0){
			result = "success";
		}
		return selectByPage(1);
	}
	
	/**
	 * 按id查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectOne")
	public String selectOne(int id){
		Deviceinout d = ids.selectOne(id);
		request.setAttribute("d", d);
		return "deviceinout/update";
	}
	
	/**
	 * 按设备编号查询
	 * @param serialnum
	 * @return
	 */
	@RequestMapping("/selectbyserialnum")
	public String selectBySerialnum(String serialnum){
		List<Deviceinout> list = ids.selectBySerialnum(serialnum);
		request.setAttribute("list", list);
		return "deviceinout/select";
	}
	
	/**
	 * 增加入库
	 * @param d
	 * @return
	 */
	@RequestMapping("/insertin")
	public String insertin(Deviceinout d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String date = sdf.format(new Date());
		d.setIntime(date);
		d.setInventorystatus("入库");
		ids.insertin(d);
		//跳转到该页面查询
		List<Inventory> list = iis.selectAll();
		request.setAttribute("list", list);
		return "equipmentanage/manage";
	}
	
	/**
	 * 新增出库
	 * @param d
	 * @return
	 */
	@RequestMapping("/insertout")
	public String insertout(Deviceinout d){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String date = sdf.format(new Date());
		d.setOuttime(date);
		d.setInventorystatus("出库");
		ids.insertout(d);
		//跳转到该页面查询
		List<Inventory> list = iis.selectAll();
		request.setAttribute("list", list);
		return "equipmentanage/manage";
	}
	
	/**
	 * 新增报废
	 * @param d
	 * @return
	 */
	@RequestMapping("/insertscrap")
	public String insertscrap(Deviceinout d){
		d.setInventorystatus("报废");
		ids.insertscrap(d);
		//跳转到该页面查询
		List<Inventory> list = iis.selectAll();
		request.setAttribute("list", list);
		return "equipmentanage/manage";
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
		IDeviceinoutDao fdao = ac.getBean(IDeviceinoutDao.class);
		Deviceinout d = fdao.selectmax("9TE04","出库");
	}
}
