package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.entity.AnChenCheckbox;

/**
 * 矩陈多选题业务
 * @author  Perye
 *
 *
 *
 */

public interface AnChenCheckboxManager extends BaseService<AnChenCheckbox, String> {
	public List<AnChenCheckbox> findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
