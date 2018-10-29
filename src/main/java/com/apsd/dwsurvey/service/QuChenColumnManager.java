package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuChenColumn;

/**
 * 矩陈题列
 * @author  Perye
 *
 *
 *
 */
public interface QuChenColumnManager extends BaseService<QuChenColumn, String> {

	public List<QuChenColumn> findByQuId(String quId);
	
	public String getContentByQuId(String quId);
	
	public QuChenColumn upOptionName(String quId,String quItemId, String optionName);

	public void ajaxDelete(String quItemId);
	
}
