package com.tly.service.impl;

import com.tly.dao.IIntegralDao;
import com.tly.model.Integral;
import com.tly.service.IIntegralService;

/**
 * 积分详情
 * @author yangweihang
 *
 */
public class IntegralService implements IIntegralService {
	
	private IIntegralDao itdao;
	
	public IIntegralDao getItdao() {
		return itdao;
	}

	public void setItdao(IIntegralDao itdao) {
		this.itdao = itdao;
	}

	/*
	 *新增
	 */
	@Override
	public int insert(Integral i) {
		return itdao.insert(i);
	}

	/*
	 *按微信id查询一个
	 */
	@Override
	public Integral selectOne(String wxid) {
		return itdao.selectOne(wxid);
	}

	/**
	 * 修改消费
	 * @param i
	 * @return
	 */
	@Override
	public int updatexiaofei(Integral i) {
		return itdao.updatexiaofei(i);
	}

	/**
	 * 修改星评
	 * @param i
	 * @return
	 */
	@Override
	public int updatexingping(Integral i) {
		return itdao.updatexingping(i);
	}

	/**
	 * 修改留言
	 * @param i
	 * @return
	 */
	@Override
	public int updateliuyan(Integral i) {
		return itdao.updateliuyan(i);
	}

	
}
