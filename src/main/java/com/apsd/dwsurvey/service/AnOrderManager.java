package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnOrder;

/**
 * 排序题
 * @author  Perye
 *
 *
 *
 */
public interface AnOrderManager extends BaseService<AnOrder, String>{
	public List<AnOrder>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
