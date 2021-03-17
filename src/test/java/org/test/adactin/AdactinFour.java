package org.test.adactin;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinFour extends BaseClass{
public AdactinFour() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='first_name']")
private WebElement firstname;
@FindBy(xpath="//input[@name='last_name']")
private WebElement lastname;
@FindBy(xpath="//textarea[@name='address']")
private WebElement address;
@FindBy(xpath="//input[@name='cc_num']")
private WebElement cardnumber;
@FindBy(xpath="//select[@name='cc_type']")
private WebElement cardtype;
@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement expirymonth;
@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement expiryyear;
@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement cvvnumver;
@FindBy(xpath="//input[@name='book_now']")
private WebElement booknow;
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardnumber() {
	return cardnumber;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExpirymonth() {
	return expirymonth;
}
public WebElement getExpiryyear() {
	return expiryyear;
}
public WebElement getCvvnumver() {
	return cvvnumver;
}
public WebElement getBooknow() {
	return booknow;
}



}
