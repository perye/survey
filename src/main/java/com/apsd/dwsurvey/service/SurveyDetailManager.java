package com.apsd.dwsurvey.service;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.SurveyDetail;

/**
 * 问卷评情
 * @author  Perye
 *
 *
 *
 */
public interface SurveyDetailManager extends BaseService<SurveyDetail, String>{
	
	public SurveyDetail getBySurveyId(String surveyId);
	
}
