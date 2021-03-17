package org.basec;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Element;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.text.translate.JavaUnicodeEscaper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void getDriver() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void LaunchUrl(String s) {
		driver.get(s);

	}
	public void title() {
		driver.getTitle();

	}
    public void currentUrl() {
driver.getCurrentUrl();
}
	public void enterText(WebElement element,String s) {
element.sendKeys(s);

	}
	public void btnClick(WebElement element) {
	element.click();
	}
	private void text(WebElement element) {
     element.getText();		
	}
	public void attribute(WebElement element,String s) {
		element.getAttribute(s);
		
	}
	public void dragAndDrop(WebElement sourse, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourse, destination);
	
	}
	public void moveTo(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target);
	}
	public void rigetClick(WebElement right) {
		Actions actions = new Actions(driver);
		actions.contextClick();
	}
	public void doubleclick(WebElement dc) {
	Actions actions = new Actions(driver);
	actions.doubleClick(dc).perform();
	}
	public void screenShot(String data) throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File(System.getProperty("user.dir")+"\\target\\"+ data + ".png");
	FileUtils.copyFile(srcfile, destFile);
	}
	
     public void thread(long time) throws InterruptedException {
     Thread.sleep(time);
     }
     private void selectbyvalue(WebElement element,String text) {
    	 Select select = new Select(element);
    	 select.selectByValue(text);
    }
     public void selectbyindex(WebElement element,int index) {
    	 Select select = new Select(element);
    	 select.selectByIndex(index);
	}
     public void selectbyvisibletext(WebElement element,String text) {
 		Select select = new Select(element);
 		select.selectByVisibleText(text);
 	}
     public void deselectbyindex(WebElement element,int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
     
     public void deselectbyvaleu(WebElement element,String text) {
 		Select select = new Select(element);
 		select.deselectByValue(text);
 	}
     public void deselectbyvisibletext(WebElement element,String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
      public void getoptions(WebElement element) {
		Select select= new Select(element);
		select.getOptions();
	}
   public void ismultiple(WebElement element) {
	Select select = new Select(element);
	select.isMultiple();
}
  public void getfirstselectetoptiond(WebElement element) {
	Select select = new Select(element);
	select.getFirstSelectedOption();
}
   public void deselectall(WebElement element) {
Select select = new Select(element);
select.deselectAll();
}
   public void getselectedoptions(WebElement element) {
Select select = new Select(element);
select.getAllSelectedOptions();
}
   public void scrollDown(WebElement element) {
	JavascriptExecutor script=(JavascriptExecutor)driver;
	script.executeScript("arguments[0].scrollIntoView(true)",element);
}
   public void scrollup(WebElement element) {
	JavascriptExecutor script=(JavascriptExecutor)driver;
	script.executeScript("arguments[0].scrollIntoView(false)", element);
}
   public void getattribute(WebElement element) {
	JavascriptExecutor script=(JavascriptExecutor)driver;
	script.executeScript("return arguments[0].getattribute(value)",element );
	
}
   public void setattribute(WebElement element) {
	JavascriptExecutor script= (JavascriptExecutor)driver;
	script.executeScript("arguements[0].setattribute(value)", element);
	
}
   
   
	}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

