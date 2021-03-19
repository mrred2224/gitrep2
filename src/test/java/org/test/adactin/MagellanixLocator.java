package org.test.adactin;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagellanixLocator extends BaseClass {

	public MagellanixLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//textarea[@name='msg']")
	private WebElement scrolldown;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subject;
	
	@FindBy(xpath="//textarea[@name='msg']")
	private WebElement message;
	
	@FindBy(xpath="//button[@type='submit']")
    private WebElement btnsend;
	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getBtnsend() {
		return btnsend;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessage() {
		return message;
	}
	
	
	
	
	
	
}
