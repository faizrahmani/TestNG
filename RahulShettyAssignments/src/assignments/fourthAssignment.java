package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		System.out.println("Before switching to child window:  ");
		 System.out.println(driver.getTitle());
		
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> it=wind.iterator();
		String ParentWind=it.next();
		String childWind=it.next();
		
		driver.switchTo().window(childWind);
		System.out.println("After switching to child Window:  ");
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ParentWind);
		System.out.println("After switching back to parent window:  ");
		System.out.println(driver.getTitle());

	}

}
