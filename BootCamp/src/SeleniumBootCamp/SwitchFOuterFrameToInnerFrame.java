package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFOuterFrameToInnerFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		WebElement outer = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/iframe[1]"));
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("anything");

	}

}
