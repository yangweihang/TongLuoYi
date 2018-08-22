package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.ICommissionRewardDao;
import com.tly.model.CommissionReward;
import com.tly.service.ICommissionRewardService;

/**
 * 会员、合伙人提成奖励对应表
 * @author yangweihang
 *
 */
public class CommissionRewardService implements ICommissionRewardService {

	private ICommissionRewardDao icdao;
	
	public ICommissionRewardDao getIcdao() {
		return icdao;
	}

	public void setIcdao(ICommissionRewardDao icdao) {
		this.icdao = icdao;
	}

	/*
	 *查询
	 */
	@Override
	public List<CommissionReward> select() {
		return icdao.select();
	}

	/*
	 * 按条件查询
	 */
	@Override
	public CommissionReward selectByC(Map<String, Object> map) {
		return icdao.selectByC(map);
	}

}
