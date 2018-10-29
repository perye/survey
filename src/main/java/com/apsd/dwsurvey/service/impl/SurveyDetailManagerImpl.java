package com.apsd.dwsurvey.service.impl;

import java.util.List;

import com.apsd.dwsurvey.dao.SurveyDetailDao;
import com.apsd.dwsurvey.entity.SurveyDetail;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apsd.common.service.BaseServiceImpl;
import com.apsd.common.utils.ReflectionUtils;
import com.apsd.dwsurvey.service.SurveyDetailManager;


/**
 * 问卷详情
 * @author  Perye
 *
 *
 *
 */
@Service
public class SurveyDetailManagerImpl extends BaseServiceImpl<SurveyDetail, String> implements SurveyDetailManager{
	
	@Autowired
	private SurveyDetailDao surveyDetailDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=surveyDetailDao;
	}
	
	@Transactional
	@Override
	public void save(SurveyDetail t) {
		//判断有无，有则更新
		SurveyDetail surveyDetail=findUn(t.getDirId());
		if(surveyDetail==null){
			surveyDetail=new SurveyDetail();
		}
		ReflectionUtils.copyAttr(t,surveyDetail);
		super.save(surveyDetail);
	}
	
	private SurveyDetail findUn(String dirId){
		Criterion criterion=Restrictions.eq("dirId", dirId);
		 List<SurveyDetail> details=surveyDetailDao.find(criterion);
		 if(details!=null && details.size()>0){
			 return details.get(0);
		 }
		 return null;
	}

	@Override
	public SurveyDetail getBySurveyId(String surveyId) {
		 return findUn(surveyId);
	}
	
}
