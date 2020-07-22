package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TotalLinksFromDetour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://newtours.demoaut.com/");
		WebDriverWait wait = new WebDriverWait (driver,  10); 
		wait.until(ExpectedConditions.titleIs("Sign-on: Mercury Tours"));
		System.out.println("Expilicit Time is done");
		driver.findElement(By.id("userName")).sendKeys("Faiz******");
		driver.findElement(By.name("password")).sendKeys("***********");
		
		// to find of total number of links in a page.
		WebElement web = driver.findElement(By.tagName("a"));
		System.out.println(web.getAttribute("href"));
		
	}

}
