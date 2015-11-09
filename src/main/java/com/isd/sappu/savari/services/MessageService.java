package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.Message;

public interface MessageService {

	public long saveUpdateMessage(Message message);
	
	public Message getMessage(long messageId);
	
	public List<Message> getMessagesBySender(long userId);
	
	public List<Message> getMessagesByReceiver(long userId);
	
	public String deleteMessage(Message message);
	
}