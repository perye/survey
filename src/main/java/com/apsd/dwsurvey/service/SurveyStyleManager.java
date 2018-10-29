package com.apsd.dwsurvey.service;

import com.apsd.dwsurvey.entity.SurveyStyle;

/**
 * 问卷样式
 * @author  Perye
 *
 *
 *
 */
public interface SurveyStyleManager  {

	public SurveyStyle get(String id) ;
	
	public SurveyStyle getBySurveyId(String surveyId) ;
	
	public void save(SurveyStyle surveyStyle) ;
}
