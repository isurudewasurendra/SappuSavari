package com.isd.sappu.savari.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.UserRole;

@Repository
@Transactional
public class UserRoleDaoImpl implements UserRoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public UserRole getUserRoleByRole(String role) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (UserRole) session.createQuery("from UserRole o where o.authority = :authority")
            		.setParameter("authority", role).uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
