package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com");
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		
		
		//ac.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		//driver.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();

	}

}
