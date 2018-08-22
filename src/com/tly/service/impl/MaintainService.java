package com.tly.service.impl;

import java.util.List;

import com.tly.dao.IMaintainDao;
import com.tly.model.Maintain;
import com.tly.service.IMaintainService;

/**
 * 故障设备维修明细
 * @author yangweihang
 *
 */
public class MaintainService implements IMaintainService {
	
	private IMaintainDao imdao;
	
	

	public IMaintainDao getImdao() {
		return imdao;
	}

	public void setImdao(IMaintainDao imdao) {
		this.imdao = imdao;
	}

	/*
	 * 新增
	 */
	@Override
	public int insert(Maintain m) {
		return imdao.insert(m);
	}
	
	/*
	 * 修改
	 */
	public int update(Maintain m) {
		return imdao.update(m);
	}

	/*
	 * 查询
	 */
	@Override
	public List<Maintain> select(String wxid) {
		return imdao.select(wxid);
	}
	
}
