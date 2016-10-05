package com.epam.pirate;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epam.pirate.dao.CharityRepository;
import com.epam.pirate.dao.OfferRepository;
import com.epam.pirate.dao.UserRepository;
import com.epam.pirate.dto.Charity;
import com.epam.pirate.dto.Offer;
import com.epam.pirate.dto.Profile;
import com.epam.pirate.model.User;
import com.epam.pirate.security.SecurityUtils;
import com.epam.pirate.security.UserCredentials;

/**
 * Handles requests for the application home page.
 */
@RestController
@CrossOrigin
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	SecurityUtils securityUtils;
	@Autowired
	UserRepository userRepository;
	@Autowired
	OfferRepository offerRepository;
	@Autowired
	CharityRepository charityRepository;

	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, HttpServletRequest request) throws Exception {
		User currentUser = securityUtils.getLoggedInUser(request);
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("The current user is {}.", currentUser.getId());

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		return "Welcome " + currentUser.getMail() + " now is " + formattedDate;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	public String login(@RequestBody UserCredentials credentials) throws Exception {
		return "{\"token\":\"" + securityUtils.loginUser(credentials.username, credentials.password) + "\"}";

	}

	// Get MyProfile
	@RequestMapping(value = "/myprofile", method = RequestMethod.GET)
	public Profile myprofile(HttpServletRequest request) throws Exception {
		User user = securityUtils.getLoggedInUser(request);
		return new Profile(user);
	}

	// Get MyProfile
	@RequestMapping(value = "/offer", method = RequestMethod.GET)
	public List<Offer> offer(HttpServletRequest request) throws Exception {
		User user = securityUtils.getLoggedInUser(request);
		List<Offer> toReturn = new ArrayList<>();

		offerRepository.findAll().forEach(offer -> {
			toReturn.add(new Offer(offer));
		});

		return toReturn;
	}

	// Charity/{id}
	@RequestMapping(value = "/charity/{id}", method = RequestMethod.GET)
	public Charity charity(HttpServletRequest request, @PathVariable Long id) throws Exception {
		User user = securityUtils.getLoggedInUser(request);

		return new Charity(charityRepository.findOne(id));
	}

}
