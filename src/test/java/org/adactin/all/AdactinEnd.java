package org.adactin.all;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.test.adactin.AdactinFour;
import org.test.adactin.AdactinOne;
import org.test.adactin.AdactinThree;
import org.test.adactin.AdactinTwo;
import org.test.adactin.last.AdactinFinal;

public class AdactinEnd extends BaseClass {
	public static void main(String[] args) {
		BaseClass baseclass= new BaseClass();
		baseclass.getDriver();
		baseclass.LaunchUrl("http://adactinhotelapp.com/");
		
		AdactinOne one= new AdactinOne();
		WebElement username = one.getUsername();
		baseclass.enterText(username, "jerrykarthikeyan");
		
		WebElement password = one.getPassword();
		baseclass.enterText(password, "qwerty");
		
		WebElement login = one.getLogin();
		baseclass.btnClick(login);
		 
		
		AdactinTwo two= new AdactinTwo();
		WebElement locations = two.getSelectLocations();
		baseclass.selectbyvisibletext(locations, "Sydney");
		
		WebElement hotels = two.getSelectHotels();
		baseclass.selectbyvisibletext(hotels, "Hotel Sunshine");
		
		WebElement roomtype = two.getRoomtype();
		baseclass.selectbyvisibletext(roomtype, "Deluxe");
		
		WebElement roomnos = two.getRoomnos();
		baseclass.selectbyvisibletext(roomnos, "3 - Three");
		
		WebElement adultroom = two.getAdultroom();
		baseclass.selectbyvisibletext(adultroom, "3 - Three");
		
		 WebElement childroom = two.getChildroom();
		 baseclass.selectbyvisibletext(childroom, "3 - Three");
		
		WebElement search = two.getSearch();
		baseclass.btnClick(search);
		
		AdactinThree three= new AdactinThree();
		WebElement dotclick = three.getDotclick();
		baseclass.btnClick(dotclick);
		
		WebElement continueclick = three.getContinueclick();
		baseclass.btnClick(continueclick);
		
		AdactinFour four=new AdactinFour();
		WebElement firstname = four.getFirstname();
		baseclass.enterText(firstname, "shyam");
		
		WebElement lastname = four.getLastname();
		baseclass.enterText(lastname, "sakthi");
		
		WebElement address = four.getAddress();
		baseclass.enterText(address, "anna nagae ,nmagiripet");
		
		WebElement cardnumber = four.getCardnumber();
		baseclass.enterText(cardnumber, "9874563210236525");
		
		WebElement cardtype = four.getCardtype();
		baseclass.selectbyvisibletext(cardtype, "VISA");
		
		WebElement expirymonth = four.getExpirymonth();
		baseclass.selectbyvisibletext(expirymonth, "August");
		
		WebElement expiryyear = four.getExpiryyear();
		baseclass.selectbyvisibletext(expiryyear, "2022");
		
		WebElement cvvnumver = four.getCvvnumver();
		baseclass.enterText(cvvnumver, "258");
		
		WebElement booknow = four.getBooknow();
		baseclass.btnClick(booknow);
		
		
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
