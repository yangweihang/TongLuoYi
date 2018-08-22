package com.tly.service.impl;

import com.tly.dao.IPartnerLevelDao;
import com.tly.model.PartnerLevel;
import com.tly.service.IPartnerLevelService;

/**
 * 合伙人级别对应
 * @author yangweihang
 *
 */
public class PartnerLevelService implements IPartnerLevelService {

	private IPartnerLevelDao ipldao;
	
	public IPartnerLevelDao getIpldao() {
		return ipldao;
	}

	public void setIpldao(IPartnerLevelDao ipldao) {
		this.ipldao = ipldao;
	}

	/*
	 *新增
	 */
	@Override
	public int insert(PartnerLevel pl) {
		return ipldao.insert(pl);
	}

	/*
	 *修改合伙人级别
	 */
	@Override
	public int update(PartnerLevel pl) {
		return ipldao.update(pl);
	}

}
