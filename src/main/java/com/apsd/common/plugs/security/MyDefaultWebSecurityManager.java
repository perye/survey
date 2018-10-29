package com.apsd.common.plugs.security;

import com.apsd.common.base.entity.User;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;

import com.apsd.common.base.service.AccountManager;

public class MyDefaultWebSecurityManager extends DefaultWebSecurityManager{
	@Autowired
	private AccountManager accountManager;
	
	public String getUserId(){
		User user=accountManager.getCurUser();
		if(user!=null){
			return user.getId();
		}
		return null;
	}
	
}
