package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.Message;
import com.isd.sappu.savari.domains.SystemUser;

public interface MessageDao extends CrudRepository<Message, Long>{

	public Message findByMessageId(long messageId);
	
	public List<Message> findBySender(SystemUser sender);
	
	public List<Message> findByReceiver(SystemUser receiver);
	
}
