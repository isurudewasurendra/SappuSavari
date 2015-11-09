package com.isd.sappu.savari.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class SystemUserDaoImpl implements SystemUserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public long saveUpdateSystemUser(SystemUser user) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return user.getUserId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public SystemUser getSystemUser(long userId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (SystemUser) session.get(SystemUser.class, userId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteSystemUser(SystemUser user) {
		try{
			sessionFactory.getCurrentSession().delete(user);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

	@Override
	@Transactional
	public SystemUser getSystemUserByUsername(String username) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (SystemUser) session.createQuery("from SystemUser where username = :username")
            		.setParameter("username", username).uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
