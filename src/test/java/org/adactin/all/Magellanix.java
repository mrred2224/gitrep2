package org.adactin.all;

import java.io.IOException;
import java.sql.Date;

import org.basec.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.test.adactin.MagellanixLocator;

public class Magellanix extends BaseClass{
	
	@BeforeClass
	public static void first() {
		BaseClass b = new BaseClass();
		b.getDriver();
		b.LaunchUrl("https://magellanix.com/contact.html");

	}@Before
	public void second() throws IOException {
		
		BaseClass b = new BaseClass();
		b.screenShot("first");

	}
	@Test
	public void three() {
		BaseClass b= new BaseClass();
		MagellanixLocator m=new MagellanixLocator();
		WebElement btnsend = m.getBtnsend();
		b.btnClick(btnsend);
		
		
		
				

	}@Test
	public void tc3() {
		BaseClass b=new BaseClass();
		MagellanixLocator m=new MagellanixLocator();
		WebElement mail = m.getMail();
		b.enterText(mail, "sakthi@gmail");
	    WebElement phone = m.getPhone();
	    b.enterText(phone, "9874563210");
	    
	    	
	
	}
	@Test
	public void tc5() {
		BaseClass b=new BaseClass();
		MagellanixLocator m=new MagellanixLocator();
		WebElement subject = m.getSubject();
		b.enterText(subject, "leopravven");
		WebElement message = m.getMessage();
		b.enterText(message, "done");
		

	}
	@Test
	public void tc0() {
		BaseClass b = new BaseClass();
		MagellanixLocator ml = new MagellanixLocator();
		WebElement scrolldown = ml.getScrolldown();
		b.scrollDown(scrolldown);
		
		WebElement name = ml.getName();
		b.enterText(name, "Jerry");

	}
	@Test
	@After
	public void four() throws IOException {
		
		BaseClass b = new BaseClass();
		b.screenShot("First step");

	}
//	@AfterClass
//	public static void five() {
//		
//
//	}
}
