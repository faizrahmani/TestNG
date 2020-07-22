package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntireTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("as http://seleniumeasy.com/test/table-pagination-demo.html");
		int row = driver.findElements(By.xpath("//tr[1]//td[")).size();
		int col = driver.findElements(By.xpath("]//td[2]")).size();
		for (int i = 0; i < row; i++)
		{
			WebElement table = driver.findElement(By.xpath("//tr[1]//td["+ i +"]"));
			System.out.println(table.getText());
			
			for (int j = 0; j < col; j++)
			{
				WebElement table1 =  driver.findElement(By.xpath("//tr["+j+"]//td[2]"));
				System.out.println(table1.getText());
			}
			
		}
	}

}
