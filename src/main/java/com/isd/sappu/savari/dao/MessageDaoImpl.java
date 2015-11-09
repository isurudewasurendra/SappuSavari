package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.Message;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class MessageDaoImpl implements MessageDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public long saveUpdateMessage(Message message) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(message);
			return message.getMessageId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public Message getMessage(long messageId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (Message) session.get(Message.class, messageId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Message> getMessagesBySender(long userId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Message>) session.createQuery("from Message where sender.userId = :userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Message> getMessagesByReceiver(long userId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Message>) session.createQuery("from Message where receiver.userId = :userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteMessage(Message message) {
		try{
			sessionFactory.getCurrentSession().delete(message);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

}
