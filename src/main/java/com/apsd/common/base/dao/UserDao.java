package com.apsd.common.base.dao;

import com.apsd.common.base.entity.User;
import com.apsd.common.dao.BaseDao;


/**
 * @author  Perye
 *
 *
 *
 */
public interface UserDao extends BaseDao<User, String> {

	public void resetUserGroup(String groupId);
	
}
