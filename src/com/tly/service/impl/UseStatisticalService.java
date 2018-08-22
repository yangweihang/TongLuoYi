package com.tly.service.impl;

import java.util.List;

import com.tly.dao.IUseStatisticalDao;
import com.tly.model.UseStatistical;
import com.tly.service.IUseStatisticalService;

/**
 * 会员使用统计
 * @author yangweihang
 *
 */
public class UseStatisticalService implements IUseStatisticalService {
	
	private IUseStatisticalDao iusdao;
	
	public IUseStatisticalDao getIusdao() {
		return iusdao;
	}

	public void setIusdao(IUseStatisticalDao iusdao) {
		this.iusdao = iusdao;
	}

	/*
	 *新增
	 */
	@Override
	public int insert(UseStatistical us) {
		return iusdao.insert(us);
	}

	/*
	 *按微信id查询
	 */
	@Override
	public List<UseStatistical> selectByUid(int uid) {
		return iusdao.selectByUid(uid);
	}

	/*
	 *查询使用次数
	 
	@Override
	public int selectByTime(int uid) {
		return iusdao.selectByTime(uid);
	}

	
	 *查询使用时长
	 
	@Override
	public int selectByduration(int uid) {
		return iusdao.selectByduration(uid);
	}*/

}
