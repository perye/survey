package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuScore;

/**
 * 评分题
 * @author  Perye
 *
 *
 *
 */
public interface QuScoreManager extends BaseService<QuScore, String>{

	public List<QuScore> findByQuId(String id);
	
	public QuScore upOptionName(String quId,String quItemId, String optionName);

	public List<QuScore> saveManyOptions(String quId,List<QuScore> quScores);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId);
}
