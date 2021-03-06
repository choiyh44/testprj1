package com.nhnent.testprj1.home.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nhnent.testprj1.home.service.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	HomeService home;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("serverTime", home.getFormattedServerDate(locale) );
		
		return "home";
	}
	
	@RequestMapping(value = "/home.nhn")
	public String homeNhn(Locale locale, Model model) {
		return home(locale, model);
	}
	
}
