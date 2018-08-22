package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.CommissionReward;

/**
 * 会员、合伙人提成奖励对应表
 * @author yangweihang
 *
 */
public interface ICommissionRewardService {
	//查询
	public List<CommissionReward> select();
	//按条件查询
	public CommissionReward selectByC(Map<String,Object> map);
}
