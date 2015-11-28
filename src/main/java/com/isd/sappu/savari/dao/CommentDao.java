package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.Comment;

public interface CommentDao {

	public long saveUpdateComment(Comment comment);
	
	public Comment getComment(long commentId);
	
	public String deleteComment(Comment comment);
	
	public List<Comment> getCommentsByProductId(long productId);

	public List<Comment> getCommentListByUserId(long userId);
	
}
