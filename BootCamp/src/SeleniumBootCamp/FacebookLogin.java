package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("faiz.******@*****.com");
		driver.findElement(By.id("pass")).sendKeys("**********");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		driver.findElement(By.xpath("//div[@id='u_o_2']//input[@class='_1frb']")).sendKeys("Mojib Rahman");
		Select s=new Select(driver.findElement(By.xpath("//div[@id='u_o_2']//input[@class='_1frb']")));
		s.deselectByVisibleText("mojib rahman rahmani");
		
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Ahmad");
		driver.findElement(By.id("u_0_o")).sendKeys("Rishad");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("***********8@gmail.com");
		driver.findElement(By.id("u_0_w")).sendKeys("***********");
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//select[@id='month']//option[@value='7']")).click();
		driver.findElement(By.xpath("//select[@id='day']")).click();
		driver.findElement(By.xpath("//select[@id='day']//option[@value='5']")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("//select[@id='year']//option[@value='1988']")).click();
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("*************@gmail.com");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
		
	}

}
