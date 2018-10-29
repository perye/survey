package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuMultiFillblank;

/**
 * 多项填空题
 * @author  Perye
 *
 *
 *
 */
public interface QuMultiFillblankManager  extends BaseService<QuMultiFillblank, String>{

	public List<QuMultiFillblank> findByQuId(String quId);
	
	public QuMultiFillblank upOptionName(String quId,String quItemId, String optionName);

	public List<QuMultiFillblank> saveManyOptions(String quId,List<QuMultiFillblank> quMultiFillblanks);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId);
}
