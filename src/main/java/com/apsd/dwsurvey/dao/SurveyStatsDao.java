package com.apsd.dwsurvey.dao;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.SurveyStats;

public interface SurveyStatsDao extends BaseDao<SurveyStats, String>{

	public void findStatsDataCross(Question rowQuestion, Question colQuestion);

}
