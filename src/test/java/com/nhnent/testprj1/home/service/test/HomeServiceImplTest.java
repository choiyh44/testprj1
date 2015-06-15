package com.nhnent.testprj1.home.service.test;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nhnent.testprj1.home.service.HomeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
							        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
							        "file:src/main/webapp/WEB-INF/spring/root-context.xml"
							      })
public class HomeServiceImplTest {
	@Autowired
	HomeService home;

	@Test	
	public void testGetFormattedServerDate() {
		Locale locale = new Locale("ko", "KR");
		String formattedDate = home.getFormattedServerDate(locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDateTest = dateFormat.format(date);
		
		assertNotNull(formattedDate);
		assertTrue(formattedDate.length() > 10);
		assertEquals(formattedDate.substring(0, 10), formattedDateTest.substring(0, 10));
	}

}
