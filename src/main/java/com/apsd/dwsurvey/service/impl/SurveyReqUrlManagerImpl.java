package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.dao.SurveyReqUrlDao;
import com.apsd.dwsurvey.entity.SurveyReqUrl;
import com.apsd.dwsurvey.service.SurveyReqUrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apsd.common.utils.RandomUtils;


/**
 * 短链地址
 * @author  Perye
 *
 *
 *
 */
@Service
public class SurveyReqUrlManagerImpl  implements SurveyReqUrlManager {
	
	@Autowired
	private SurveyReqUrlDao surveyReqUrlDao;
	
	@Transactional
	public void save(SurveyReqUrl entity){
		String sId=entity.getSid();
		if(sId==null || "".equals(sId)){
			sId=RandomUtils.randomStr(6, 12);
			entity.setSid(sId);
		}
		surveyReqUrlDao.save(entity);
	}
	
	public void getByShortId(String shortId){
		
	}
	
}
