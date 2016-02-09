package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.Message;

public interface MessageService {

	public Message saveUpdateMessage(Message message);
	
	public Message getMessage(long messageId);
	
	public List<Message> getMessagesBySender(long userId);
	
	public List<Message> getMessagesByReceiver(long userId);
	
	public void deleteMessage(Message message);
	
}
