package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuChenOption;

/**
 * 矩陈题选项
 * @author  Perye
 *
 *
 *
 */
public interface QuChenOptionManager extends BaseService<QuChenOption, String>{
	public List<QuChenOption> findByQuId(String quId);
	
	public String getContentByQuId(String quId);
	
	public QuChenOption upOptionName(String quId,String quItemId, String optionName); 
}
