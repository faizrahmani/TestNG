package PageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	@FindBy(xpath="//a[@class='vdicon']")
	WebElement Video;
	
	@FindBy(id="srchword")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@class='newsrchbtn']")
	WebElement srchbtn;
	
	public WebElement video() {
		return Video;
	}
	
	public WebElement searchBox() {
		return searchBox;
	}
	
	public WebElement searchbutton() {
		return srchbtn;
	}
}
