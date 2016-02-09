package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.Comment;

public interface CommentService {

	public Comment saveUpdateComment(Comment comment);
	
	public Comment getComment(long commentId);
	
	public void deleteComment(Comment comment);
	
	public List<Comment> getCommentListByProductId(long productId);

	public List<Comment> getCommentListByUserId(long userId);
	
}
