package testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utitlities.ReadConfig;

public class baseClass {
	
	ReadConfig rc=new ReadConfig();
	
	public String url =rc.getURL();
	public String userName=rc.getUserName();
	public String password=rc.getPassword();

	public static WebDriver driver;
	public static Logger logg;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", rc.getChromeBrowser());
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		logg= Logger.getLogger("Framwork");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	

}
