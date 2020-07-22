package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.walmart.com/");
		driver.findElement(By.xpath("//button[@id='header-account-toggle']//img")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("faiz.rahmani@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("*********");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys("SAMSUNG 65\' Class 4K Ultra HD (2160P) HDR Smart LED TV UN65RU7100 (2019 Model)");
		driver.findElement(By.xpath("//button[@id='global-search-submit']//img")).click();
		driver.findElement(By.xpath("//li[2]//div[1]//div[2]//div[11]//div[1]//div[1]//button[1]//span[1]")).click();
		driver.findElement(By.xpath("//div[4]//a[1]//span[1]//span[1]//span[1]//img[1]")).click();
		driver.findElement(By.xpath("//span[text()='Check Out']//parent::button[@location='bottom']")).click();
		

	}

}
