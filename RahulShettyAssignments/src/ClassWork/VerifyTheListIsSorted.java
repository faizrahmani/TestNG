package ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class VerifyTheListIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList=new ArrayList<String>();
		for(int i=0;i<firstColList.size();i++)
		{
		originalList.add(firstColList.get(i).getText());
		}
		ArrayList<String> copiedList =new ArrayList<String>();
		for(int i=0;i<originalList.size();i++)
		{
		copiedList.add(originalList.get(i));
		}
		//string
		Collections.sort(copiedList);
		// Collections.reverse(copiedList);
		for(String s1:originalList )
		{
		System.out.println(s1);
		}

		System.out.println("*******************");

		for(String s2:copiedList )
		{
		System.out.println(s2);
		}
		if(originalList.equals(copiedList)){
			System.out.println("The list is in sorted order");
		}
		else {
			System.out.println("The list is not in sorted order");
		}

	}

}
