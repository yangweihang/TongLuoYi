package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.IPartnerDao;
import com.tly.model.Partner;
import com.tly.service.IPartnerService;

/**
 * 合伙人
 * @author yangweihang
 *
 */
public class PartnerService implements IPartnerService {

	private IPartnerDao ipdao;
	
	public IPartnerDao getIpdao() {
		return ipdao;
	}

	public void setIpdao(IPartnerDao ipdao) {
		this.ipdao = ipdao;
	}

	/*
	 *新增
	 */
	@Override
	public int insert(Partner p) {
		return ipdao.insert(p);
	}

	/*
	 *查询合伙人
	 */
	@Override
	public List<Map<String, Object>> selectpartner() {
		return ipdao.selectpartner();
	}

	/*
	 *查询一级上线
	 */
	@Override
	public Partner selectOneOn(int id) {
		return ipdao.selectOneOn(id);
	}

	/*
	 *查询二级上线
	 */
	@Override
	public Partner selectTwoOn(int id) {
		return ipdao.selectTwoOn(id);
	}

	/*
	 *查询一级下线
	 */
	@Override
	public List<Partner> selectOneUp(int id) {
		return ipdao.selectOneUp(id);
	}

	/*
	 *查询二级下线
	 */
	@Override
	public List<Partner> selectTwoUp(int id) {
		return ipdao.selectTwoUp(id);
	}

	/*
	 * 按微信id查询
	 */
	@Override
	public Partner selectWxid(String wxid) {
		return ipdao.selectWxid(wxid);
	}

	/*
	 * 修改余额
	 */
	@Override
	public int updatebalance(Partner p) {
		return ipdao.updatebalance(p);
	}

	/*
	 * 查询余额
	 */
	@Override
	public Partner selectbalance(int id) {
		return ipdao.selectbalance(id);
	}
	
}
