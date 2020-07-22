package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttachFileFromComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://html.com/input-type-file/");
		
		//Type=File should be available when uploading files
		// For attaching a file to web application from computer or outside of browser we need to give sendKeys and then fileLocation, file name and extension of that file
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\faizr\\OneDrive\\Desktop\\QA Engineering/kjdskljsdaflkj.docx");

	}

}
