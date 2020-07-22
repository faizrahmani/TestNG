package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fitthAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());
		driver.close();
		
		
		/*Teachers sample: 
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		 	*/
		


	}

}
