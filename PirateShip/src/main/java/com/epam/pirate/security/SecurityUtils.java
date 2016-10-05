package com.epam.pirate.security;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.pirate.dao.UserRepository;
import com.epam.pirate.model.User;

public class SecurityUtils {
	
	@Autowired
	UserRepository userRepository;
	
	Random rnd = new Random();
	
	public User getLoggedInUser(final HttpServletRequest request) throws Exception{
		return userRepository.findOne(Long.valueOf(1));
//		final String token = request.getHeader("token");
//		String[] parts = parseToken(token);
//		if(parts == null){
//			throw new Exception("invalid token");
//		}
//		User user = null;
//		try{
//			user = userRepository.findByMailAndPassword(parts[0], parts[1]);
//			if(user == null){
//				throw new Exception("invalid credentials");
//			}
//			return user;
//		}
//		catch(Exception ex){
//			throw new Exception("invalid credentials");
//		}
	}
	
	public String loginUser(final String username, final String password) throws Exception{
		User user = null;
		try{
			user = userRepository.findByMailAndPassword(username, password);
			if(user == null){
				throw new Exception("invalid credentials");
			}
			return username + "_" + password + "_" + rnd.nextInt();
		}
		catch(Exception ex){
			throw new Exception("invalid credentials");
		}		
	}
	
	String[] parseToken(String token){
		if(token == null || token.length() == 0){
			return null;
		}
		String[] parts = token.split("_");
		if (parts.length != 3){
			return null;
		}
		try{
			Integer.getInteger(parts[2]);
			return parts;
		}
		catch(Exception ex){
			return null;
		}
	}
}
