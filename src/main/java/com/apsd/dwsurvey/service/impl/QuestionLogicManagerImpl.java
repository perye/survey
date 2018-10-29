package com.apsd.dwsurvey.service.impl;

import java.util.List;

import com.apsd.dwsurvey.dao.QuestionLogicDao;
import com.apsd.dwsurvey.entity.QuestionLogic;
import com.apsd.dwsurvey.service.QuestionLogicManager;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 题逻辑
 * @author  Perye
 *
 *
 *
 */
@Service
public class QuestionLogicManagerImpl implements QuestionLogicManager {
		@Autowired
		private QuestionLogicDao questionLogicDao;
	
		@Override
		public List<QuestionLogic> findByCkQuId(String ckQuId) {
			Criterion cri1=Restrictions.eq("ckQuId", ckQuId);
			Criterion cri2=Restrictions.eq("visibility", 1);
			return questionLogicDao.find(cri1,cri2);
		}
}
