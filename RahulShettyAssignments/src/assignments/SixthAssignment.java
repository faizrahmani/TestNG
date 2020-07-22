package assignments;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SixthAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String copytext=driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(copytext);
		
		Select select=new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(copytext);
		
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys(copytext);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert =driver.switchTo().alert();
		String alerttext= alert.getText();
		
		if(alerttext.contains(copytext)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		alert.accept();
		driver.close();

	}

}
