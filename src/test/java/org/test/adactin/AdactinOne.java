package org.test.adactin;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinOne extends BaseClass {
	public AdactinOne() {
PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
@FindBy(xpath="//input[@name='password']")
private WebElement password;

 @FindBy(xpath="//input[@name='login']")
private WebElement login;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}
 

}
