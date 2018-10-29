package com.apsd.dwsurvey.service;

import java.util.List;

import com.apsd.common.plugs.page.Page;
import com.apsd.dwsurvey.entity.MailInviteInbox;

public interface MailInviteInboxManager {
    public void save(MailInviteInbox entity);

    public Page<MailInviteInbox> findPage(Page<MailInviteInbox> page2,
	    String surveyInviteId);

    public List<MailInviteInbox> findList(String mailInviteId);

    public MailInviteInbox getBySendcloudEmailId(String emailId);

	public MailInviteInbox getByEmail(String mailInviteId, String email);

	public void post(String mailInviteId);
	
}
