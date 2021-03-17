package org.test.sample;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOne extends BaseClass {

	public NewOne() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@value='1']")
	private WebElement btn;

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
}
