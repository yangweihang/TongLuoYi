package com.tly.service.impl;

import com.tly.dao.IMembershipLevelDao;
import com.tly.model.MembershipLevel;
import com.tly.service.IMembershipLevelService;

/**
 * 会员等级对应
 * @author yangweihang
 *
 */
public class MembershipLevelService implements IMembershipLevelService {

	private IMembershipLevelDao imldao;
	
	public IMembershipLevelDao getImldao() {
		return imldao;
	}

	public void setImldao(IMembershipLevelDao imldao) {
		this.imldao = imldao;
	}

	/*
	 *新增
	 */
	@Override
	public int insert(MembershipLevel ml) {
		return imldao.insert(ml);
	}

	/*
	 *修改
	 */
	@Override
	public int update(MembershipLevel ml) {
		return imldao.update(ml);
	}

	/*
	 * 按微信id查询
	 */
	@Override
	public MembershipLevel selectByWxid(String wxid) {
		return imldao.selectByWxid(wxid);
	}

}
