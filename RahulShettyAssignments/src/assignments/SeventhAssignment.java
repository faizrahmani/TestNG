package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeventhAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.cssSelector("table[id='product'] tr")).size());
		System.out.println(driver.findElements(By.cssSelector("table[id='product'] tr th")).size());
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr/following-sibling::tr[2]")).getText());

		
		
		//Instructor Example:
		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
	}

}
