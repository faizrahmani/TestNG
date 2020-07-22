package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By usernamePath =By.cssSelector("[id='txtUsername']");
	By passwordPath =By.id("txtPassword");
	By loginbtn = By.xpath("//input[@id='btnLogin']");
	
	
	
	
	
	
	public WebElement getUsernamePath() 
	{
		return driver.findElement(usernamePath);
	}
	
	public WebElement getPasswordPath() {
		return driver.findElement(passwordPath);
	}
	
	public WebElement clickLoginbtn() {
		return driver.findElement(loginbtn);
	}

}
