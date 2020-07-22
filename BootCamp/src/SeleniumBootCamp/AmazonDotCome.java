package SeleniumBootCamp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDotCome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-customer-avatar-icon']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("faiz*****8@yahoo.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("*************");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/span[@id='nav-search-submit-text']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Nike shirts for men");
		
		List<WebElement> web = driver.findElements(By.xpath("//div[@id='suggestions']/div[@id='issDiv0']"));
		System.out.println(web.size());
			
		for (WebElement webElement : web) {
			webElement.getText().equals("ks best sellers");
			System.out.println(webElement);
		}
	}

}
