package com.tly.dao;

import java.util.List;
import java.util.Map;

import com.tly.model.Partner;

/**
 * 合伙人
 * @author yangweihang
 *
 */
public interface IPartnerDao {
	//增加合伙人
	public int insert(Partner p);
	//查询合伙人
	public List<Map<String,Object>> selectpartner();
	//查询一级上线
	public Partner selectOneOn(int id);
	//查询二级上线
	public Partner selectTwoOn(int id);
	//查询一级下线
	public List<Partner> selectOneUp(int id);
	//查询二级下线
	public List<Partner> selectTwoUp(int id);
	//按微信id查询
	public Partner selectWxid(String wxid);
	//修改余额
	public int updatebalance(Partner p);
	//查询余额
	public Partner selectbalance(int id);
}
