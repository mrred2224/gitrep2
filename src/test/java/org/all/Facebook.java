
package org.all;

import org.basec.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.sample.NewOne;

public class Facebook extends BaseClass {
public static void main(String[] args) {
	
	
	BaseClass baseClass = new BaseClass();
	
	baseClass.getDriver();
	baseClass.LaunchUrl("https://www.facebook.com/");
	
	NewOne one = new NewOne();
	
	
	WebElement username = one.getUsername();
	baseClass.enterText(username, "Shakthi");
	
	WebElement password = one.getPassword();
	baseClass.enterText(password, "123456");
	
	WebElement btn = one.getBtn();
	baseClass.btnClick(btn);
	
}
}
