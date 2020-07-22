package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PackageClassTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("//frame[@name='packageListFrame']");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().frame("//frame[@name='packageFrame']");
		driver.findElement(By.xpath("//body//li[589]")).click();


	}

}
