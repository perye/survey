package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuOrderby;

/**
 * 排序题
 * @author  Perye
 *
 *
 *
 */
public interface QuOrderbyManager extends BaseService<QuOrderby, String>{

	public List<QuOrderby> findByQuId(String id);
	
	public QuOrderby upOptionName(String quId,String quItemId, String optionName);

	public List<QuOrderby> saveManyOptions(String quId,List<QuOrderby> quOrderbys);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId);
}
