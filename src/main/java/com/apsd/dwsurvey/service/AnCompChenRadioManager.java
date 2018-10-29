package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.AnCompChenRadio;

/**
 * 复合矩陈单选题
 * @author  Perye
 *
 *
 *
 */

public interface AnCompChenRadioManager extends BaseService<AnCompChenRadio, String>{
	
	public List<AnCompChenRadio> findAnswer(String belongAnswerId,String quId);
	
}
