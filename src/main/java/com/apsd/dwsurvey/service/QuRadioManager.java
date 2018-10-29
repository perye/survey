package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuRadio;

/**
 * 单选题
 * @author  Perye
 *
 *
 *
 */
public interface QuRadioManager  extends BaseService<QuRadio, String>{
	public List<QuRadio> findByQuId(String quId);

	public QuRadio upOptionName(String quId,String quItemId, String optionName);

	public List<QuRadio> saveManyOptions(String quId,List<QuRadio> quRadios);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId, String isNote);
}
