package com.baobaotao.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.baobaotao.dao.ForumDao;
import com.baobaotao.domain.Forum;

public class ForumService1 {
	private ForumDao forumDao;
	private TransactionTemplate template;
	public void addForum(final Forum forum) {
		
		template.execute(new TransactionCallbackWithoutResult() {
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				forumDao.addForum(forum);
			}
		});

	}
	public void setForumDao(ForumDao forumDao) {
		this.forumDao = forumDao;
	}
	public void setTemplate(TransactionTemplate template) {
		this.template = template;
	}

	
	
}
