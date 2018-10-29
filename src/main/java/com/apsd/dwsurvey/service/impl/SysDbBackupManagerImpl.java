package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.service.SysDbBackupManager;
import com.apsd.dwsurvey.dao.SysDbBackupDao;
import com.apsd.dwsurvey.entity.SysDbBackup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsd.common.service.BaseServiceImpl;


/**
 * 问卷备份
 * @author  Perye
 *
 *
 *
 */
@Service
public class SysDbBackupManagerImpl extends BaseServiceImpl<SysDbBackup, String> implements SysDbBackupManager {

	@Autowired
	private SysDbBackupDao sysDbBackupDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=sysDbBackupDao;
	}
	
}
