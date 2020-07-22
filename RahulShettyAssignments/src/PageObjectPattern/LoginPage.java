package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	By signbtn = By.xpath("//p[@id='signin_info']//a[@class='signin']");
	By userName = By.id("login1");
	By password = By.xpath("//input[@id='password']");
	By submit = By.name("proceed");
	
	
	public WebElement signButton() {
		return driver.findElement(signbtn);
	}
	public WebElement userName() {
			return driver.findElement(userName);
	}
	public WebElement passord() {
		return driver.findElement(password);
	}
	public WebElement submitbtn() {
		return driver.findElement(submit);
	}
	
	

}
