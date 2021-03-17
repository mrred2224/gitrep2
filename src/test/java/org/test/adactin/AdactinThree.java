package org.test.adactin;

import org.basec.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinThree extends BaseClass {
	public AdactinThree() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement dotclick;
@FindBy(xpath="//input[@name='continue']")
private WebElement continueclick;
public WebElement getDotclick() {
	return dotclick;
}
public WebElement getContinueclick() {
	return continueclick;
}

}
