package com.apsd.dwsurvey.service.impl;

import java.util.List;

import com.apsd.dwsurvey.dao.AnChenScoreDao;
import com.apsd.dwsurvey.entity.AnChenScore;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.service.AnChenScoreManager;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsd.common.service.BaseServiceImpl;

/**
 * 矩陈评分题
 * @author  Perye
 *
 *
 *
 */
@Service
public class AnChenScoreManagerImpl extends BaseServiceImpl<AnChenScore, String> implements AnChenScoreManager {

	@Autowired
	private AnChenScoreDao anChenScoreDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=anChenScoreDao;
	}

	@Override
	public List<AnChenScore> findAnswer(String belongAnswerId, String quId) {//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anChenScoreDao.find(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anChenScoreDao.findGroupStats(question);
	}
	
}
