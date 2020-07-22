package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondAssignmentFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   
		
		driver.get("http://www.cleartrip.com");
		
		
		driver.findElement(By.id("RoundTrip")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("OneWay")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Kab");
		Thread.sleep(11000);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys(Keys.ENTER);
		WebElement destination =driver.findElement(By.xpath("//input[@id='ToTag']"));
		Thread.sleep(2000);
		destination.sendKeys("Wash");
		Thread.sleep(11000L);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector("a[class*='highlight']")).click();

		
		Select s1 = new Select(driver.findElement(By.cssSelector("[id='Adults']")));
		s1.selectByVisibleText("2");
		
		Thread.sleep(1000);
		Select s2 = new Select(driver.findElement(By.id("Childrens")));
		s2.selectByValue("2");
		
		Thread.sleep(1000);
		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='Infants']")));
		s3.selectByIndex(2);

		driver.findElement(By.id("SearchBtn")).click();
	}

}
