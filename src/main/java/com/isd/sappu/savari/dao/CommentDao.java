package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.Comment;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

public interface CommentDao extends CrudRepository<Comment, Long>{

	public Comment findByCommentId(long commentId);
	
	public List<Comment> findCommentByProduct(Product product);

	public List<Comment> findCommentByUser(SystemUser systemUser);
	
}
