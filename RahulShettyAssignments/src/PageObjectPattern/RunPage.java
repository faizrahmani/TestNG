package PageObjectPattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RunPage {
	
	
	@Test
	public void rediffcom() throws InterruptedException{
		

	
		System.setProperty("webdriver.chrome.driver", "C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		HomePage hp=new HomePage(driver);
		//hp.Video.click();
	//	hp.searchBox.sendKeys("Afghanistan");
		//hp.srchbtn.click();
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().back();

		
		LoginPage lp=new LoginPage(driver);
		lp.signButton().click();
		lp.userName().sendKeys("abcdef@gmail.com");
		lp.passord().sendKeys("pasword");
		lp.submitbtn().click();
		
	}
	
	

	
	
	
	


}
