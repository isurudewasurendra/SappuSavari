package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.dao.MessageDao;
import com.isd.sappu.savari.domains.Message;

@Repository
@Transactional
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	
	@Override
	public long saveUpdateMessage(Message message) {
		return messageDao.saveUpdateMessage(message);
	}

	@Override
	public Message getMessage(long messageId) {
		return messageDao.getMessage(messageId);
	}

	@Override
	public List<Message> getMessagesBySender(long userId) {
		return messageDao.getMessagesBySender(userId);
	}

	@Override
	public List<Message> getMessagesByReceiver(long userId) {
		return messageDao.getMessagesByReceiver(userId);
	}

	@Override
	public String deleteMessage(Message message) {
		return messageDao.deleteMessage(message);
	}

}
