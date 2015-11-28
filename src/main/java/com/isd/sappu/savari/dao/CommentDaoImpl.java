package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.Comment;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class CommentDaoImpl implements CommentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public long saveUpdateComment(Comment comment) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(comment);
			return comment.getCommentId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public Comment getComment(long commentId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (Comment) session.get(Comment.class, commentId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteComment(Comment comment) {
		try{
			sessionFactory.getCurrentSession().delete(comment);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Comment> getCommentsByProductId(long productId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Comment>) session.createQuery("from Comment where product.productId=:productId")
            		.setParameter("productId", productId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Comment> getCommentListByUserId(long userId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Comment>) session.createQuery("from Comment where user.userId=:userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
