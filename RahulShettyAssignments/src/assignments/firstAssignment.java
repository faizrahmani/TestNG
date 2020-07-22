package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class firstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
	
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());

	}

}
