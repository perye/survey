package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.dao.AnAnswerDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.service.AnAnswerManager;
import com.apsd.dwsurvey.entity.AnAnswer;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsd.common.service.BaseServiceImpl;

/**
 * @author Perye
 *
 *
 */

@Service
public class AnAnswerManagerImpl extends BaseServiceImpl<AnAnswer, String> implements AnAnswerManager {

	@Autowired
	private AnAnswerDao anAnswerDao;

	@Override
	public void setBaseDao() {
		this.baseDao=anAnswerDao;
	}
	
	
	//根据exam_user信息查询答案
		public AnAnswer findAnswer(String belongAnswerId,String quId){
			Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
			Criterion criterion2=Restrictions.eq("quId", quId);
			return anAnswerDao.findUnique(criterion1,criterion2);
		}


		@Override
		public void findGroupStats(Question question) {
			anAnswerDao.findGroupStats(question);
		}
			
}
