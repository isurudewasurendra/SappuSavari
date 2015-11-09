package com.isd.sappu.savari.util;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.isd.sappu.savari.domains.SystemUser;

@Component
public class SessionUtil {

	HttpSession session;
	
	public void addStringToSession(String name, String value, HttpServletRequest request){
		session = request.getSession();
		session.setAttribute(name, value);
	}
	
	public String getStringFromSession(String name, HttpServletRequest request){
		session = request.getSession();
		return (String) session.getAttribute(name);
	}
	
	public void addLongToSession(String name, Long value, HttpServletRequest request){
		session = request.getSession();
		session.setAttribute(name, value);
	}
	
	public Long getLongFromSession(String name, HttpServletRequest request){
		session = request.getSession();
		return (Long) session.getAttribute(name);
	}
	
	public void addObjectToSession(String name, Object value, HttpServletRequest request){
		session = request.getSession();
		session.setAttribute(name, value);
	}
	
	public Object getObjectFromSession(String name, HttpServletRequest request){
		session = request.getSession();
		return (Object) session.getAttribute(name);
	}
	
	public void addArrayToSession(String name, ArrayList value, HttpServletRequest request){
		session = request.getSession();
		session.setAttribute(name, value);
	}
	
	public ArrayList getArrayFromSession(String name, HttpServletRequest request){
		session = request.getSession();
		return (ArrayList) session.getAttribute(name);
	}
	
	
	public void addLoggedUserToSession(String name, SystemUser value, HttpServletRequest request){
		session = request.getSession();
		session.setAttribute(name, value);
	}
	
	public SystemUser getLoggedUserFromSession(String name, HttpServletRequest request){
		session = request.getSession();
		return (SystemUser) session.getAttribute(name);
	}
	
}
