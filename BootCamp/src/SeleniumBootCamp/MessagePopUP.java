package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessagePopUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/tooltip/");
		WebElement msgbox =driver.findElement(By.id("age"));
		msgbox.getAttribute("title");
		
		if(msgbox.equals("We ask for your age only for statistical purposes."))
		{
			System.out.println("testcase pass ");
		}else
		{
			System.out.println("testcase failed");
		}

	}

}
