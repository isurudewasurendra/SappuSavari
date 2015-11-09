package com.isd.sappu.savari.controllers;


import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.Comment;
import com.isd.sappu.savari.domains.Favorite;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductMultimedia;
import com.isd.sappu.savari.domains.Rating;
import com.isd.sappu.savari.services.CommentService;
import com.isd.sappu.savari.services.FavoriteService;
import com.isd.sappu.savari.services.ProductMultimediaService;
import com.isd.sappu.savari.services.ProductService;
import com.isd.sappu.savari.services.RatingService;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.EnumConstant;
import com.isd.sappu.savari.util.SessionUtil;


@Controller(value="productController")
@RequestMapping(value="/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private SessionUtil sessionUtil;
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private RatingService ratingService;
	
	@Autowired
	private FavoriteService favoriteService;
	
	@Autowired
	private ProductMultimediaService productMultimediaService;
	
	@RequestMapping(value="showProduct", method=RequestMethod.GET)
	public ModelAndView getShowProduct(@RequestParam("productId") long productId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		Product product = productService.getProductById(productId);
		map.put("product", product);
		
		List<Comment> commentList = commentService.getCommentListByProductId(productId);
		map.put("commentList", commentList);
		
		List<ProductMultimedia> productMultimediaList = productMultimediaService.getMultimediaList(productId);
		map.put("productMultimediaList", productMultimediaList);
		
		Rating rating = ratingService.getRating(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId(), productId);
		map.put("rating", rating);
		
		Favorite favorite = favoriteService.getFavorite(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId(), productId);
		map.put("favorite", favorite);
		
		int overallRating = ratingService.calculateOverallRating(productId);
		map.put("overallRating", overallRating);
		
		return new ModelAndView("showProduct", map);
	}	
	
	@RequestMapping(value="saveComment", method=RequestMethod.POST)
	public @ResponseBody String saveComment(@RequestParam("productId") long productId, @RequestParam("comment") String comment, HttpServletRequest request){
		Comment newComment = new Comment();
		newComment.setComment(comment);
		newComment.setProduct(productService.getProductById(productId));
		newComment.setShowStatus(EnumConstant.YesNoStatus.YES.toString());
		newComment.setUpdatedDateTime(new Date());
		newComment.setUser(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request));
		
		commentService.saveUpdateComment(newComment);
		
		return EnumConstant.ReturnStatus.SUCCESS.toString();
	}
	
	@RequestMapping(value="updateComment", method=RequestMethod.POST)
	public @ResponseBody String updateComment(@RequestParam("commentId") long commentId, @RequestParam("comment") String comment, HttpServletRequest request){
		Comment newComment = commentService.getComment(commentId);
		newComment.setComment(comment);
		newComment.setUpdatedDateTime(new Date());
		
		commentService.saveUpdateComment(newComment);
		
		return EnumConstant.ReturnStatus.SUCCESS.toString();
	}
	
	@RequestMapping(value="saveRating", method=RequestMethod.POST)
	public @ResponseBody String saveRating(@RequestParam("productId") long productId, @RequestParam("rating") int rating, HttpServletRequest request){
		Rating newRating = new Rating();
		newRating.setRating(rating);
		newRating.setUpdatedDateTime(new Date());
		newRating.setProduct(productService.getProductById(productId));
		newRating.setUser(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request));
		
		ratingService.saveUpdateRating(newRating);
		
		return EnumConstant.ReturnStatus.SUCCESS.toString();
	}
	
	@RequestMapping(value="updateRating", method=RequestMethod.POST)
	public @ResponseBody String updateRating(@RequestParam("ratingId") long ratingId, @RequestParam("rating") int rating, HttpServletRequest request){
		Rating newRating = ratingService.getRating(ratingId);
		newRating.setRating(rating);
		newRating.setUpdatedDateTime(new Date());
		
		ratingService.saveUpdateRating(newRating);
		
		return EnumConstant.ReturnStatus.SUCCESS.toString();
	}
}
