package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert alert=(Alert) driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("The Alert text is correct");
		}
		else
		{
			System.out.println("The Alert text is in-correct");
		}

		alert.dismiss();
		driver.close();

	}

}
