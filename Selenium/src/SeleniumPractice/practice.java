package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//selenium-java-3.141.59 and ChromeWebDrvier//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");

	}

}
