package com.tly.service.impl;

import java.util.Map;

import com.tly.dao.IGradeDao;
import com.tly.model.Grade;
import com.tly.service.IGradeService;

public class GradeService implements IGradeService {
	
	private IGradeDao igdao;
	
	public IGradeDao getIgdao() {
		return igdao;
	}

	public void setIgdao(IGradeDao igdao) {
		this.igdao = igdao;
	}

	/*
	 *增加上级
	 */
	@Override
	public int insertOnId(Grade g) {
		return igdao.insertOnId(g);
	}

	/*
	 *增加下级
	 */
	@Override
	public int insertUpId(Grade g) {
		return igdao.insertUpId(g);
	}

	/*
	 *查询下线有多少人
	 */
	@Override
	public Integer selectByUp(int id) {
		return igdao.selectByUp(id);
	}

	/*
	 *删除没有消费的会员
	 */
	@Override
	public int deleteNotXiaofei(Integer[] in) {
		return igdao.deleteNotXiaofei(in);
	}

}
