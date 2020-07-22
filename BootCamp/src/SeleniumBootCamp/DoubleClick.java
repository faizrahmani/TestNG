package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   // to delete all cookies
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com/");
		driver.switchTo().frame(0);
		WebElement er= driver.findElement(By.xpath("//html//body//div"));
		Actions at = new Actions (driver);
		at.doubleClick(er);
	}

}
