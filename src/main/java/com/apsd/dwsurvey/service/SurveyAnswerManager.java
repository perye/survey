package com.apsd.dwsurvey.service;

import java.util.List;
import java.util.Map;

import com.apsd.common.base.entity.User;
import com.apsd.common.plugs.page.Page;
import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.SurveyAnswer;
import com.apsd.dwsurvey.entity.SurveyDetail;
import com.apsd.dwsurvey.entity.SurveyStats;

/**
 * 问卷回答
 * @author  Perye
 *
 *
 *
 */
public interface SurveyAnswerManager extends BaseService<SurveyAnswer, String>{

	public void saveAnswer(SurveyAnswer surveyAnswer, Map<String, Map<String, Object>> quMaps);

	public List<Question> findAnswerDetail(SurveyAnswer answer);
	
	public List<SurveyAnswer> answersByIp(String surveyId, String ip);
	
	public SurveyAnswer getTimeInByIp(SurveyDetail surveyDetail, String ip);
	
	public Long getCountByIp(String surveyId, String ip);

	public String exportXLS(String surveyId,String savePath);
	
	public SurveyStats surveyStatsData(SurveyStats surveyStats);
	
	public Page<SurveyAnswer> joinSurvey(Page<SurveyAnswer> page, User user) ;
	
	/**
	 * 取出某份问卷的答卷数据
	 * @param page
	 * @param surveyId
	 * @return
	 */
	public Page<SurveyAnswer> answerPage(Page<SurveyAnswer> page,String surveyId);

}
