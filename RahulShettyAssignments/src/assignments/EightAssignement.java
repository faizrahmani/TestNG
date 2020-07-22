package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EightAssignement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement autoSug=driver.findElement(By.id("autocomplete"));
		
		autoSug.sendKeys("Uni");
		Thread.sleep(2000);
		for(int j=0;j<6;j++) {
		autoSug.sendKeys(Keys.DOWN);
		}
		autoSug.sendKeys(Keys.ENTER);
		String text = autoSug.getAttribute("value");
		System.out.println(text);
		




		

	}

}
