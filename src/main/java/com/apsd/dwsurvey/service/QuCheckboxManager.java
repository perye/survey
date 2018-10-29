package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuCheckbox;

/**
 * 多选题
 * @author  Perye
 *
 *
 *
 */
public interface QuCheckboxManager  extends BaseService<QuCheckbox, String>{

	public List<QuCheckbox> findByQuId(String quId);

	public QuCheckbox upOptionName(String quId,String quItemId, String optionName);

	public List<QuCheckbox> saveManyOptions(String quId,List<QuCheckbox> quCheckboxs);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId, String isNote);
	
}
