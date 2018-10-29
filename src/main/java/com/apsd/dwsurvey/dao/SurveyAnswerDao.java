package com.apsd.dwsurvey.dao;

import java.util.Map;

import com.apsd.common.dao.BaseDao;
import com.apsd.dwsurvey.entity.SurveyStats;
import com.apsd.dwsurvey.entity.SurveyAnswer;

public interface SurveyAnswerDao extends BaseDao<SurveyAnswer, String>{

	public void saveAnswer(SurveyAnswer surveyAnswer,
			Map<String, Map<String, Object>> quMaps);

	public SurveyStats surveyStatsData(SurveyStats surveyStats);
}
