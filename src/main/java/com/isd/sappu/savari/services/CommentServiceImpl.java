package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.CommentDao;
import com.isd.sappu.savari.domains.Comment;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public Comment saveUpdateComment(Comment comment) {
		return commentDao.save(comment);
	}

	@Override
	public Comment getComment(long commentId) {
		return commentDao.findByCommentId(commentId);
	}

	@Override
	public void deleteComment(Comment comment) {
		commentDao.delete(comment);
	}

	@Override
	public List<Comment> getCommentListByProductId(long productId) {
		Product product = new Product();
		product.setProductId(productId);
		return commentDao.findCommentByProduct(product);
	}

	@Override
	public List<Comment> getCommentListByUserId(long userId) {
		SystemUser systemUser = new SystemUser();
		systemUser.setUserId(userId);
		return commentDao.findCommentByUser(systemUser);
	}

}
