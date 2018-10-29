package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuChenRow;

/**
 * 矩陈题行
 * @author  Perye
 *
 *
 *
 */
public interface QuChenRowManager extends BaseService<QuChenRow, String>{
	public List<QuChenRow> findByQuId(String quId);
	
	public String getContentByQuId(String quId);
	
	public QuChenRow upOptionName(String quId,String quItemId, String optionName);

	public void ajaxDelete(String quItemId);
}
