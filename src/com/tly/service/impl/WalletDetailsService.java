package com.tly.service.impl;

import com.tly.dao.IWalletDetailsDao;
import com.tly.model.WalletDetails;

/**
 * 钱包明细
 * @author yangweihang
 *
 */
public class WalletDetailsService implements IWalletDetailsDao {
	
	private IWalletDetailsDao iwddao;
	
	public IWalletDetailsDao getIwddao() {
		return iwddao;
	}

	public void setIwddao(IWalletDetailsDao iwddao) {
		this.iwddao = iwddao;
	}

	/*
	 * 新增
	 */
	@Override
	public int insert(WalletDetails wd) {
		return iwddao.insert(wd);
	}
	
}
