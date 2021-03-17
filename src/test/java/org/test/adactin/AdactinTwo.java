package org.test.adactin;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinTwo extends BaseClass {
	public AdactinTwo() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//select[@name='location']")
private WebElement selectLocations;
@FindBy(xpath="//select[@name='hotels']")
private WebElement selectHotels;
@FindBy(xpath="//select[@name='room_type']")
private WebElement roomtype;
@FindBy(xpath="//select[@name='room_nos']")
private WebElement roomnos;
@FindBy(xpath="//select[@name='adult_room']")
private WebElement adultroom;
@FindBy(xpath="//select[@name='child_room']")
private WebElement childroom;
@FindBy(xpath="//input[@type='submit']")
private WebElement search;
public WebElement getSearch() {
	return search;
}
public WebElement getSelectLocations() {
	return selectLocations;
}
public WebElement getSelectHotels() {
	return selectHotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomnos() {
	return roomnos;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildroom() {
	return childroom;
}

	
	
	

}
