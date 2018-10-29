package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.entity.ImportError;
import com.apsd.dwsurvey.dao.ImportErrorDao;
import com.apsd.dwsurvey.service.ImportErrorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 导入错误记录题
 * @author  Perye
 *
 *
 *
 */
@Service
public class ImportErrorManagerImpl implements ImportErrorManager {
    @Autowired
    private ImportErrorDao importErrorDao;
    @Transactional
    public void save(ImportError entity) {
	importErrorDao.save(entity);
    }
    
}
