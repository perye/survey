package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.dao.SysEmailDao;
import com.apsd.dwsurvey.entity.SysEmail;
import com.apsd.dwsurvey.service.SysEmailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsd.common.service.BaseServiceImpl;

@Service
public class SysEmailManagerImpl extends BaseServiceImpl<SysEmail, String> implements SysEmailManager {
	
	@Autowired
	private SysEmailDao sysEmailDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=sysEmailDao;
	}
	
}
