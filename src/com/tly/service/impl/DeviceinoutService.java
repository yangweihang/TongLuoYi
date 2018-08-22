package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tly.dao.impl.DeviceinoutDao;
import com.tly.model.Deviceinout;
import com.tly.service.IDeviceinoutService;

/**
 * 设备出入库明细
 * @author yangweihang
 *
 */
@Service
public class DeviceinoutService implements IDeviceinoutService {
	private DeviceinoutDao ddao;
	
	public DeviceinoutDao getDdao() {
		return ddao;
	}

	public void setDdao(DeviceinoutDao ddao) {
		this.ddao = ddao;
	}

	public int insert(Deviceinout d){
		return ddao.insert(d);
	}

	/*
	 *分页查询
	 */
	@Override
	public List<Deviceinout> selectByPage(Map<String, Object> map) {
		return ddao.selectByPage(map);
	}

	/*
	 *查询总数
	 */
	@Override
	public Integer selectByTotal(Map<String, Object> map,int pageSize) {
		int total = ddao.selectByTotal(map);
		int totalpage = total/pageSize;
		if(total%pageSize>0){
			totalpage++;
		}
		return totalpage;
	}

	/*
	 *删除
	 */
	@Override
	public int delete(Integer[] arr) {
		return ddao.delete(arr);
	}

	/*
	 *修改
	 */
	@Override
	public int update(Deviceinout d) {
		return ddao.update(d);
	}

	/*
	 *按id查询
	 */
	@Override
	public Deviceinout selectOne(int id) {
		return ddao.selectOne(id);
	}

	/*
	 *按设备编号查询
	 */
	@Override
	public List<Deviceinout> selectBySerialnum(String serialnum) {
		return ddao.selectBySerialnum(serialnum);
	}

	/*
	 *新增入库
	 */
	@Override
	public int insertin(Deviceinout d) {
		return ddao.insertin(d);
	}

	/*
	 *新增出库
	 */
	@Override
	public int insertout(Deviceinout d) {
		return ddao.insertout(d);
	}

	/*
	 *查询重复的字段
	 */
	@Override
	public Deviceinout selectmax(String serialnum,String inventorystatus) {
		return ddao.selectmax(serialnum,inventorystatus);
	}

	/*
	 *新增报废
	 */
	@Override
	public int insertscrap(Deviceinout d) {
		return ddao.insertscrap(d);
	}

}
