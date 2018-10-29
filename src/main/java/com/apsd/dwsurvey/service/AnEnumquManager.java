package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnEnumqu;

/**
 * 枚举题
 * @author  Perye
 *
 *
 *
 */
public interface AnEnumquManager extends BaseService<AnEnumqu, String> {
	public  List<AnEnumqu> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
