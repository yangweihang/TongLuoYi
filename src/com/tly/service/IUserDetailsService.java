package com.tly.service;

import java.util.List;
import java.util.Map;

import com.tly.model.UserDetails;

/**
 * 会员
 * @author yangweihang
 *
 */
public interface IUserDetailsService {
	//新增
	public int insert(UserDetails ud);
	//查询全部
	public List<UserDetails> selectAll();
	//添加一级上线
	public int updateByOneonwxid(UserDetails ud);
	//添加二级上线
	public int updateByTwoonwxid(UserDetails ud);
	//添加一级下线
	public int updateByOneupwxid(UserDetails ud);
	//添加二级下线
	public int updateByTwoupwxid(UserDetails ud);
	//查看会员一级上线
	public UserDetails selectuseron(int id);
	//查询会员二级上线
	public UserDetails selecttwouseron(int id);
	//查看会员一级下线
	public List<UserDetails> selectuserup(int id);
	//查询会员二级下线
	public List<UserDetails> selecttwouserup(int id);
	//按微信id查询
	public UserDetails selectByWxid(String wxid);
	//查询当月没有消费的会员
	public List<Integer> selectNotXiaofei(Map<String,Object> map);
	//按微信id查询
	public UserDetails selectOne(int id);
}
