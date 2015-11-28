package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.CommentDao;
import com.isd.sappu.savari.domains.Comment;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public long saveUpdateComment(Comment comment) {
		return commentDao.saveUpdateComment(comment);
	}

	@Override
	public Comment getComment(long commentId) {
		return commentDao.getComment(commentId);
	}

	@Override
	public String deleteComment(Comment comment) {
		return commentDao.deleteComment(comment);
	}

	@Override
	public List<Comment> getCommentListByProductId(long productId) {
		return commentDao.getCommentsByProductId(productId);
	}

	@Override
	public List<Comment> getCommentListByUserId(long userId) {
		return commentDao.getCommentListByUserId(userId);
	}

}
