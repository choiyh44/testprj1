package com.nhnent.testprj1.home.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
	public String getFormattedServerDate(Locale locale) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return formattedDate;
		
	}

}
