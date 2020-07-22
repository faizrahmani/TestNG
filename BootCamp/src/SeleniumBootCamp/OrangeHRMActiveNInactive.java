package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMActiveNInactive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   // to delete all cookies
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://opensource-demo.orangehrmlive.com/");
		//driver.navigate().to("https://www.amazon.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin12");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("menu_admin_viewAdminModule")).click();
		driver.findElement(By.xpath("menu_admin_viewSystemUsers")).click();
		int col = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[")).size();
		WebElement row = driver.findElement(By.xpath("]td[4]"));
		for (int i =0; i <col; i++)
		{
			WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]td[4]"));
			if (table.getText().equals("Enabled"))
			{
				System.out.println(table);
			}
		}

	}

}
