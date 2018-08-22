package com.tly.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.swetake.util.Qrcode;
import com.tly.model.DetailedInventory;
import com.tly.model.Deviceinout;
import com.tly.model.Inventory;
import com.tly.service.IDetailedInventoryService;
import com.tly.service.IDeviceinoutService;
import com.tly.service.IInventoryService;

/**
 * 库存设备
 * @author yangweihang
 *
 */
@Controller
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	private IInventoryService iis;
	@Autowired
	private IDeviceinoutService ids;
	@Autowired
	private IDetailedInventoryService idis;
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 新增
	 * @param i
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Inventory i){
		//形成设备编号
		char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J',
				'K', 'M', 'N', 'P','Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z','0','1','2','3','4','5','6','7','8','9'};
		Random r = new Random();
		StringBuffer sb = null;
		while(true){
			sb = new StringBuffer();
			for (int j = 0; j < 5; j++) {
				int n = r.nextInt(c.length);
				sb.append(c[n]);
			}
			//查询设备编号是否有重复的
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("mod", sb.toString());
			Inventory in = iis.selectByTJ(map);
			if(in == null){
				break;
			}
		}
		i.setSerialnum(sb.toString());
		int result = iis.insert(i);
		if(result <= 0){
			request.setAttribute("result", "新增失败！");
		}else{
			try {
				//形成的二维码
				String ewm = ewm(sb.toString());
				//把修改二维码地址
				int updateewm = iis.updateewm(ewm);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//录入入库明细
			Deviceinout d = new Deviceinout();
			d.setSerialnum(sb.toString());
			d.setInventorystatus("入库");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
			String date = sdf.format(new Date());
			d.setIntime(date);
			ids.insert(d);
		}
		return selectByInventory("通络机","");
	}
	
	/**
	 * 按条件查询
	 * @param name
	 * @param zx
	 * @return
	 */
	@RequestMapping("/select")
	public String selectByInventory(String name,String zx){
		List<Inventory> list = null;
		List<Inventory> list1 = null;
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> map1 = new HashMap<String,Object>();
		//查询名称
		map.put("name", name);
		if(zx.equals("Z")){
			//按租用机型查询
			map.put("zyjx", "Z");
			list = iis.selectByInventory(map);
			request.setAttribute("zlist", list);
		}else if(zx.equals("X")){
			//按销售机型查询
			map.put("xsjx", "X");
			list = iis.selectByInventory(map);
			request.setAttribute("xlist", list);
		}else{
			//查询全部
			map.put("zyjx", "Z");
			list = iis.selectByInventory(map);
			request.setAttribute("zlist", list);
			map1.put("xsjx", "X");
			map1.put("name", name);
			list1 = iis.selectByInventory(map1);
			request.setAttribute("xlist", list1);
		}
		request.setAttribute("zx", zx);
		request.setAttribute("name", name);
		return "inventory/select";
	}
	
	/**
	 * 按id查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectOne")
	public String selectOne(int id){
		Inventory in = iis.selectOne(id);
		request.setAttribute("in", in);
		return "inventory/update";
	}
	
	/**
	 * 修改
	 * @param i
	 * @return
	 */
	@RequestMapping("/update")
	public String update(Inventory i){
		int result = iis.update(i);
		request.setAttribute("result", result);
		return selectByInventory("通络机","");
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletein")
	public String delete(int id){
		int result = iis.delete(id);
		request.setAttribute("result", result);
		return selectByInventory("通络机","");
	}
	
	/**
	 * 设备管理
	 * @param ivs
	 * @return
	 */
	@RequestMapping("/selectbyem")
	public String selectByEquipmentanage(String ivs){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Inventory> list = iis.selectAll();
		request.setAttribute("list", list);
		request.setAttribute("ivs", ivs);
		return "equipmentanage/manage";
	}
	
	@RequestMapping("/img")
	public String GetImg(String ivs){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Inventory> list = iis.selectAll();
		request.setAttribute("list", list);
		request.setAttribute("ivs", ivs);
		return "equipmentanage/manage";
	}
	
	/**
	 * 生成二维码
	 * @param ewm
	 * @return
	 * @throws IOException
	 */
	public String ewm(String ewm) throws IOException{
	   String realPath = request.getSession().getServletContext().getRealPath("/ewm");
	   String pa = request.getContextPath();
	   File file = new File(realPath);
	   if (!file.exists()) {
		   file.mkdirs();
	   }
	   Qrcode qrcode = new Qrcode();
	   qrcode.setQrcodeErrorCorrect('M');//纠错等级（分为L、M、H三个等级）
	   qrcode.setQrcodeEncodeMode('B');//N代表数字，A代表a-Z，B代表其它字符
	   qrcode.setQrcodeVersion(7);//版本
	   //生成二维码中要存储的信息
	   String qrData = "http://www.baidu.com";
	   //设置一下二维码的像素
	   int width = 200;
	   int height = 200;
	   BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	   //绘图
	   Graphics2D gs = bufferedImage.createGraphics();
	   gs.setBackground(Color.WHITE);
	   gs.setColor(Color.BLACK);
	   gs.clearRect(0, 0, width, height);//清除下画板内容
	   
	   //设置下偏移量,如果不加偏移量，有时会导致出错。
	   int pixoff = 2;
	   
	   byte[] d = qrData.getBytes("gb2312");
	   if(d.length > 0 && d.length <120){
		   boolean[][] s = qrcode.calQrcode(d);
		   for(int i=0;i<s.length;i++){
			   for(int j=0;j<s.length;j++){
				   if(s[j][i]){
					   gs.fillRect(j*3+pixoff, i*3+pixoff, 3, 3);
				   }
			   }
		   }
	   }
	   gs.dispose();
	   bufferedImage.flush();
	   ImageIO.write(bufferedImage, "png", new File(realPath+"\\"+ewm+".jpg"));
	   String path = realPath+"\\"+ewm+".jpg";
	   return path;
   }
}
