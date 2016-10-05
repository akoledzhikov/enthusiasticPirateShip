package com.epam.pirate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epam.pirate.model.User;
import com.epam.pirate.security.SecurityUtils;
import com.epam.pirate.security.UserCredentials;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	SecurityUtils securityUtils;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home(Locale locale, @RequestHeader("token") String token) throws Exception {
		User currentUser = securityUtils.getLoggedInUser(token);
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("The current user is {}.", currentUser.getId());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return "Welcome " + currentUser.getMail() + " now is " + formattedDate;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes="application/json")
	@ResponseBody
	@CrossOrigin
	public String login(@RequestBody UserCredentials credentials) throws Exception{
		return "{\"token\":\"" +  securityUtils.loginUser(credentials.username, credentials.password) + "\"}";
		
	}
	
}
