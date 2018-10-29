package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.plugs.page.Page;
import com.apsd.common.service.BaseService;
import com.apsd.dwsurvey.entity.QuestionBank;

/**
 * 题库
 * @author  Perye
 *
 *
 *
 */
public interface QuestionBankManager extends BaseService<QuestionBank, String>{
	/**
	 * 根据 最底层对象，得到此对象所在的目录结构
	 * @param surveyDirectory
	 * @return
	 */
	public List<QuestionBank> findPath(QuestionBank questionBank);

	public QuestionBank getBank(String parentId);

	public QuestionBank findByNameUn(String id, String parentId, String bankName);

	public Page<QuestionBank> findPage(Page<QuestionBank> page, QuestionBank entity);

	public void executeBank(String id);
	
	public void closeBank(String id);
	
	public List<QuestionBank> newQuestionBank() ;
}
