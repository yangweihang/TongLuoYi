package com.tly.service.impl;

import com.tly.dao.IPartnerGradeDao;
import com.tly.model.PartnerGrade;
import com.tly.service.IPartnerGradeService;

/**
 * 合伙人上下级对应
 * @author yangweihang
 *
 */
public class PartnerGradeService implements IPartnerGradeService {
	
	private IPartnerGradeDao ipgdao;
	
	public IPartnerGradeDao getIpgdao() {
		return ipgdao;
	}

	public void setIpgdao(IPartnerGradeDao ipgdao) {
		this.ipgdao = ipgdao;
	}

	/*
	 *新增上级
	 */
	@Override
	public int inserton(PartnerGrade pg) {
		return ipgdao.inserton(pg);
	}

	/*
	 *新增下级
	 */
	@Override
	public int insertup(PartnerGrade pg) {
		return ipgdao.insertup(pg);
	}

}
