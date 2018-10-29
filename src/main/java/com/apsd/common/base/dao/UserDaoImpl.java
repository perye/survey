package com.apsd.common.base.dao;

import com.apsd.common.base.entity.User;
import com.apsd.common.dao.BaseDaoImpl;
import org.springframework.stereotype.Repository;


/**
 * @author  Perye
 *
 *
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao{

	@Override
	public void resetUserGroup(String groupId) {
		String sql="UPDATE t_user SET user_group_id = '' WHERE id = id";
		this.getSession().createSQLQuery(sql).executeUpdate();
	}
	
}
