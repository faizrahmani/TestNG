package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://spicejet.com/");
		
		//Radio button (1. One Way 2 RoundTrip...)
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		//Discount checkBox selection
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		// From -- To city selection dynamic dropDown 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='JLR']")).click();
		
	// When there is two matching xpath, if want to select second one we will write it as below. 
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		//Or We can make parent child relationship xpath as belew:
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();
		
		//Current Date Selection 
		driver.findElement(By.cssSelector("[class*='highlight']")).click();
		Thread.sleep(2000);
		
		//Selection DropDown Passenger Selection
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		Select select = new Select	(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		select.selectByIndex(1);
		
		Thread.sleep(3000);
		Select s2 = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByValue("2");
		
		Thread.sleep(3000);
		Select s3 = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByVisibleText("2");
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Selection DropDown Currency Selection. 
		Select s=new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("AED");
		Thread.sleep(2000);
		s.selectByVisibleText("USD");
		
		//Search Click
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

	}

}
