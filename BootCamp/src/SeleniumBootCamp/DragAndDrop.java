package SeleniumBootCamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement main1 = driver.findElement(By.id("box101"));
		Actions act = new Actions (driver);
		act.dragAndDrop(box1, main1);
	}
	}

