package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.service.SurveyStyleManager;
import com.apsd.dwsurvey.dao.SurveyStyleDao;
import com.apsd.dwsurvey.entity.SurveyStyle;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 问卷样式
 * @author  Perye
 *
 *
 *
 */
@Service
public class SurveyStyleManagerImpl implements SurveyStyleManager {

	@Autowired
	private SurveyStyleDao surveyStyleDao;
	
	public SurveyStyle get(String id) {
		return surveyStyleDao.findUniqueBy("id", id);
	}
	
	public SurveyStyle getBySurveyId(String surveyId) {
		Criterion cri1=Restrictions.eq("surveyId", surveyId);
		return surveyStyleDao.findFirst(cri1);
	}
	
	@Transactional
	public void save(SurveyStyle surveyStyle){
		surveyStyleDao.save(surveyStyle);
	}
	
}
