package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.dwsurvey.entity.QuestionLogic;

/**
 * 题逻辑
 * @author  Perye
 *
 *
 *
 */
public interface QuestionLogicManager {

	List<QuestionLogic> findByCkQuId(String quId);

}
