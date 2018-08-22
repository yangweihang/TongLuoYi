package com.tly.service.impl;

import java.util.List;
import java.util.Map;

import com.tly.dao.ICommissionDao;
import com.tly.model.Commission;
import com.tly.service.ICommissionService;

/**
 * 上级提成对应表
 * @author yangweihang
 *
 */
public class CommissionService implements ICommissionService {
	
	private ICommissionDao icmdao;
	
	public ICommissionDao getIcmdao() {
		return icmdao;
	}

	public void setIcmdao(ICommissionDao icmdao) {
		this.icmdao = icmdao;
	}

	/*
	 * 新增
	 */
	@Override
	public int insert(Commission c) {
		return icmdao.insert(c);
	}

	/*
	 * 查询租用一级
	 */
	@Override
	public Integer selectZyOne(String wxid) {
		return icmdao.selectZyOne(wxid);
	}

	/*
	 * 查询租用二级
	 */
	@Override
	public Integer selectZyTwo(String wxid) {
		return icmdao.selectZyTwo(wxid);
	}

	/*
	 * 查询消费一级
	 */
	@Override
	public Integer selectXfOne(String wxid) {
		return icmdao.selectXfOne(wxid);
	}

	/*
	 * 查询消费二级
	 */
	@Override
	public Integer selectXfTwo(String wxid) {
		return icmdao.selectXfTwo(wxid);
	}

	/*
	 * 查询购买一级
	 */
	@Override
	public Integer selectGmOne(String wxid) {
		return icmdao.selectGmOne(wxid);
	}

	/*
	 * 查询购买二级
	 */
	@Override
	public Integer selectGmTwo(String wxid) {
		return icmdao.selectGmTwo(wxid);
	}

	/*
	 * 查询总收益
	 */
	@Override
	public Integer selectsumsy(String wxid) {
		return icmdao.selectsumsy(wxid);
	}

	/*
	 * 按条件查询
	 */
	@Override
	public List<Commission> selecttj(Map<String, Object> map) {
		return icmdao.selecttj(map);
	}

}
