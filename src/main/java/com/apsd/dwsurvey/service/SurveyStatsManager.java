package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.SurveyStats;
import com.apsd.dwsurvey.entity.DataCross;
import com.apsd.dwsurvey.entity.SurveyDirectory;

/**
 * 统计报表
 * @author  Perye
 *
 *
 *
 */
public interface SurveyStatsManager extends BaseService<SurveyStats, String>{

	public SurveyStats findBySurvey(String surveyId);
	public SurveyStats findBySurvey(SurveyDirectory surveyDirectory);
	public SurveyStats findNewStatsData(SurveyDirectory survey);
	public List<Question> findFrequency(SurveyDirectory survey);
	public List<Question> findRowVarQus(SurveyDirectory survey);
	public List<Question> findColVarQus(SurveyDirectory survey);
	public List<DataCross> findStatsDataCross(String rowQuId, String colQuId);
	public List<DataCross> findDataChart(String quId);
	public List<Question> dataChart1s(SurveyDirectory survey);
	public void questionDateCross(Question question) ;
}
