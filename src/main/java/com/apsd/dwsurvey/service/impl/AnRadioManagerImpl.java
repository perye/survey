package com.apsd.dwsurvey.service.impl;

import java.util.List;

import com.apsd.dwsurvey.entity.AnRadio;
import com.apsd.dwsurvey.dao.AnRadioDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.service.AnRadioManager;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsd.common.service.BaseServiceImpl;
import com.apsd.dwsurvey.entity.DataCross;

/**
 * 单选题
 * @author  Perye
 *
 *
 *
 */
@Service
public class AnRadioManagerImpl extends BaseServiceImpl<AnRadio, String> implements AnRadioManager {

	@Autowired
	private AnRadioDao anRadioDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=anRadioDao;
	}
	
	//根据exam_user信息查询答案
	public AnRadio findAnswer(String belongAnswerId,String quId){
		//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anRadioDao.findUnique(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anRadioDao.findGroupStats(question);
	}

	@Override
	public List<DataCross> findStatsDataCross(Question rowQuestion,
			Question colQuestion) {
		return anRadioDao.findStatsDataCross(rowQuestion, colQuestion);
	}

	@Override
	public List<DataCross> findStatsDataChart(Question question) {
		return anRadioDao.findStatsDataChart(question);
	}
}
