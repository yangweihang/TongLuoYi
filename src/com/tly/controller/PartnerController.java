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

import com.tly.model.Administrator;
import com.tly.model.Commission;
import com.tly.model.CommissionReward;
import com.tly.model.Deviceinout;
import com.tly.model.Inventory;
import com.tly.model.Partner;
import com.tly.model.PartnerEquipment;
import com.tly.model.PartnerGrade;
import com.tly.model.PartnerLevel;
import com.tly.service.IAdministratorService;
import com.tly.service.ICommissionRewardService;
import com.tly.service.ICommissionService;
import com.tly.service.IDeviceinoutService;
import com.tly.service.IInventoryService;
import com.tly.service.IPartnerEquipmentService;
import com.tly.service.IPartnerGradeService;
import com.tly.service.IPartnerLevelService;
import com.tly.service.IPartnerService;

/**
 * 合伙人
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/partner")
public class PartnerController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IPartnerService ips;
	
	@Autowired
	private IAdministratorService ias;
	
	@Autowired
	private IInventoryService iis;
	
	@Autowired
	private IPartnerEquipmentService ipes;
	
	@Autowired
	private IDeviceinoutService ids;
	
	@Autowired
	private IPartnerLevelService ipls;
	
	@Autowired
	private ICommissionService icms;
	
	@Autowired
	private IPartnerGradeService ipgs;
	
	@Autowired
	private ICommissionRewardService ics;
	
	/**
	 * 新增
	 * @param p
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Partner p,PartnerEquipment pe){
		//新增合伙人
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String date = sdf.format(new Date());
		p.setAtime(date);
		int result = ips.insert(p);
		
		
		//新增合伙人级别对应
		PartnerLevel pl = new PartnerLevel();
		pl.setWxid(p.getWxid());
		pl.setLevel(p.getLevel());
		int insert = ipls.insert(pl);
		
		
		//新增合伙人设备对应
		Double money1 = 0.0;
		Double money2 = 0.0;
		//查询该设备的租出价格
		if(pe.getZcid() != 0){
			Inventory in = iis.selectOne(pe.getZcid());
			money1 = in.getDeposit()*pe.getZcnum();
			pe.setMoney(money1);
		}
		//查询该设备的售出价格
		if(pe.getXsid() != 0){
			Inventory in = iis.selectOne(pe.getXsid());
			money2 = in.getPrice()*pe.getXsnum();
			pe.setMoney(money2);
		}
		if(pe.getXsid() != 0 && pe.getZcid() != 0){
			pe.setMoney(money1 + money2);
		}
		pe.setYstime(date);
		int result1 = ipes.insert(pe);
		//按设备id查询设备详细
		if(pe.getXsid() != 0){
			Inventory in = iis.selectOne(pe.getXsid());
			//添加设备出入库明细表
			Deviceinout d = new Deviceinout();
			d.setSerialnum(in.getSerialnum());
			d.setInventorystatus("出库");
			d.setPwxid(p.getWxid());
			d.setManner("售出");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			String date1 = sdf1.format(new Date());
			d.setOuttime(date1);
			ids.insertout(d);
		}
		if(pe.getZcid() != 0){
			Inventory in1 = iis.selectOne(pe.getZcid());
			//添加设备出入库明细表
			Deviceinout d = new Deviceinout();
			d.setSerialnum(in1.getSerialnum());
			d.setInventorystatus("出库");
			d.setPwxid(p.getWxid());
			d.setManner("租出");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			String date1 = sdf1.format(new Date());
			d.setOuttime(date1);
			ids.insertout(d);
		}
		
		
		//按微信id查询
		Partner ps = ips.selectWxid(p.getWxid());
		//新增合伙人上级
		PartnerGrade pg = new PartnerGrade();
		pg.setId(ps.getId());
		pg.setOnid(11);
		ipgs.inserton(pg);
		
		
		//合伙人销售提成
		//查询一级上线
		Partner one = ips.selectOneOn(ps.getId());
		//查询二级上线
		Partner two = ips.selectTwoOn(ps.getId());
		if(pe.getXsid() != 0) {
			//新增上级提成
			Commission c = new Commission();
			c.setWxid(ps.getWxid());
			c.setOnewxid(one.getWxid());
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("level", one.getLevel());
			map.put("identity", "合伙人");
			CommissionReward cr = ics.selectByC(map);
			//计算提成
			Double gmone = money2 * (cr.getXstcone()/10);
			c.setGmone(gmone);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			String time = sdf1.format(new Date());
			c.setTime(time);
			icms.insert(c);
			//修改余额
			Partner p1 = new Partner();
			p1.setBalance(one.getBalance()+gmone);
			p1.setId(one.getId());
			ips.updatebalance(p1);
			if(two != null) {
				//新增上级提成
				Commission c1 = new Commission();
				c1.setWxid(ps.getWxid());
				c1.setTwowxid(two.getWxid());
				Map<String,Object> map1 = new HashMap<String,Object>();
				map1.put("level", two.getLevel());
				map1.put("identity", "合伙人");
				CommissionReward cr1 = ics.selectByC(map1);
				//计算提成
				Double gmtwo = money2 * (cr1.getXstctwo()/10);
				c1.setGmtwo(gmtwo);
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
				String time1 = sdf2.format(new Date());
				c1.setTime(time1);
				icms.insert(c1);
				//修改余额
				Partner p2 = new Partner();
				p1.setBalance(two.getBalance()+gmtwo);
				p1.setId(two.getId());
				ips.updatebalance(p1);
			}
		}
		//合伙人租用提成
		if(pe.getZcid() != 0) {
			//新增上级提成
			Commission c = new Commission();
			c.setWxid(ps.getWxid());
			c.setOnewxid(one.getWxid());
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("level", one.getLevel());
			map.put("identity", "合伙人");
			CommissionReward cr = ics.selectByC(map);
			//计算提成
			Double zyone = money1 * (cr.getZytcone()/10);
			c.setZyone(zyone);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			String time = sdf1.format(new Date());
			c.setTime(time);
			icms.insert(c);
			//修改余额
			Partner p1 = new Partner();
			p1.setBalance(one.getBalance()+zyone);
			p1.setId(one.getId());
			ips.updatebalance(p1);
			if(two != null) {
				//新增上级提成
				Commission c1 = new Commission();
				c1.setWxid(ps.getWxid());
				c1.setTwowxid(two.getWxid());
				Map<String,Object> map1 = new HashMap<String,Object>();
				map1.put("level", two.getLevel());
				map1.put("identity", "合伙人");
				CommissionReward cr1 = ics.selectByC(map1);
				//计算提成
				Double zytwo = money1 * (cr1.getZytctwo()/10);
				c1.setZytwo(zytwo);
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
				String time1 = sdf2.format(new Date());
				c1.setTime(time1);
				icms.insert(c1);
				//修改余额
				Partner p2 = new Partner();
				p1.setBalance(two.getBalance()+zytwo);
				p1.setId(two.getId());
				ips.updatebalance(p1);
			}
		}
		return select();
	}
	
	/**
	 * 查询
	 * @return
	 */
	@RequestMapping("/select")
	public String select(){
		//查询全部管理员
		List<Administrator> list = ias.selectAll();
		request.setAttribute("list", list);
		//查询需要出租的设备
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("zyjx", 1);
		map.put("ivs", "入库");
		List<Map<String, Object>> zclist = iis.selectNotCZAndXS(map);
		//查询需要销售的设备
		Map<String,Object> map1 = new HashMap<String,Object>();
		map1.put("xsjx", 1);
		map1.put("ivs", "入库");
		List<Map<String, Object>> xslist = iis.selectNotCZAndXS(map1);
		request.setAttribute("zclist", zclist);
		request.setAttribute("xslist", xslist);
		return "partner/insert";
	}
	
	/**
	 * 查询合伙人
	 * @return
	 */
	@RequestMapping("/selectpartner")
	public String selectpartner(){
		List<Map<String, Object>> list = ips.selectpartner();
		request.setAttribute("list", list);
		return "partner/manage";
	}
	
	/**
	 * 查询一级上线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectone")
	public String selectOneOn(int id){
		Partner p = ips.selectOneOn(id);
		request.setAttribute("p", p);
		return "partner/gradeon";
	}
	
	/**
	 * 查询二级上线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selecttwo")
	public String selectTwoOn(int id){
		Partner p = ips.selectTwoOn(id);
		request.setAttribute("p", p);
		return "partner/gradeon";
	}
	
	/**
	 * 查询一级下线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectthree")
	public String selectOneUp(int id){
		List<Partner> list = ips.selectOneUp(id);
		request.setAttribute("list", list);
		return "partner/gradeup";
	}
	
	/**
	 * 查询二级下线
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectfour")
	public String selectTwoUp(int id){
		List<Partner> list = ips.selectTwoUp(id);
		request.setAttribute("list", list);
		return "partner/gradeup";
	}
	
}
