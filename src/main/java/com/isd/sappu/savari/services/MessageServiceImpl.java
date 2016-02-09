package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.dao.MessageDao;
import com.isd.sappu.savari.domains.Message;
import com.isd.sappu.savari.domains.SystemUser;

@Repository
@Transactional
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDao messageDao;
	
	@Override
	public Message saveUpdateMessage(Message message) {
		return messageDao.save(message);
	}

	@Override
	public Message getMessage(long messageId) {
		return messageDao.findOne(messageId);
	}

	@Override
	public List<Message> getMessagesBySender(long userId) {
		SystemUser sender = new SystemUser();
		sender.setUserId(userId);
		return messageDao.findBySender(sender);
	}

	@Override
	public List<Message> getMessagesByReceiver(long userId) {
		SystemUser reciever = new SystemUser();
		reciever.setUserId(userId);
		return messageDao.findByReceiver(reciever);
	}

	@Override
	public void deleteMessage(Message message) {
		messageDao.delete(message);
	}

}
