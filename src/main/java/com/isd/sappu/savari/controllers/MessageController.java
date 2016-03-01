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
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.Message;
import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.services.MessageService;
import com.isd.sappu.savari.services.SystemUserService;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.EnumConstant;
import com.isd.sappu.savari.util.SessionUtil;

@Controller(value="messageController")
@RequestMapping(value="/message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private SessionUtil sessionUtil;
	
	@Autowired
	private SystemUserService systemUserService;
	
	@RequestMapping(value="/messageDashBoard", method=RequestMethod.GET)
	public ModelAndView getMessageDashboard(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		long userId = sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
		
		List<Message> receivedMessages = messageService.getMessagesByReceiver(userId);
		map.put("inboxMessages", receivedMessages);
		
		List<Message> sentMessages = messageService.getMessagesBySender(userId);
		map.put("sentMessages", sentMessages);
		
		return new ModelAndView("messagedashboard", map);
	}
	
	@RequestMapping(value="/messageInbox", method=RequestMethod.GET)
	public ModelAndView getMessageInbox(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		long userId = sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
		
		List<Message> receivedMessages = messageService.getMessagesByReceiver(userId);
		map.put("inboxMessages", receivedMessages);
		
		return new ModelAndView("messageInbox", map);
	}
	
	@RequestMapping(value="/messageSent", method=RequestMethod.GET)
	public ModelAndView getMessageSent(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		long userId = sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
		
		List<Message> sentMessages = messageService.getMessagesBySender(userId);
		map.put("sentMessages", sentMessages);
		
		return new ModelAndView("messageSent", map);
	}
	
	@RequestMapping(value="/createMessage", method=RequestMethod.GET)
	public ModelAndView getCreateMessage(@RequestParam("owner") long receiverId, @RequestParam("productId") long productId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		SystemUser sender = sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request);
		SystemUser receiver = systemUserService.getSystemUser(receiverId);
		
		map.put("receiver", receiver);
		map.put("sender", sender);
		map.put("productId", productId);
		
		return new ModelAndView("createmessage", map);
	}
	
	@RequestMapping(value="/createMessage", method=RequestMethod.POST)
	public String postCreateMessage(HttpServletRequest request){
		String productId = request.getParameter("productId");
		String receiverUsername = request.getParameter("inputReceiver");
		String senderUsername = request.getParameter("inputSender");
		String messageSubject = request.getParameter("inputSubject");
		String message = request.getParameter("inputMessage");
		
		SystemUser sender = systemUserService.getSystemUserByUsername(senderUsername);
		SystemUser receiver = systemUserService.getSystemUserByUsername(receiverUsername);
		
		Message newMessage = new Message();
		newMessage.setSender(sender);
		newMessage.setReceiver(receiver);
		newMessage.setReadStatus(EnumConstant.YesNoStatus.NO.toString());
		newMessage.setSubject(messageSubject);
		newMessage.setMessage(message);
		newMessage.setCreatedDateTime(new Date());
		newMessage.setUpdatedDateTime(new Date());
		newMessage.setProductId(Long.parseLong(productId));
		
		messageService.saveUpdateMessage(newMessage);
		
		return "redirect:../product/showProduct.htm?productId="+productId;
	}
	
	
	
}
