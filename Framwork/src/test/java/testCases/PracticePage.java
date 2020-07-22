package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;

public class PracticePage extends baseClass
{
	@Test
	public void MainPage()
	{

		HomePage hp = new HomePage(driver);
	
		hp.getUsernamePath().sendKeys(userName);
		logg.info("User name entered");
		hp.getPasswordPath().sendKeys(password);
		logg.info("Password entered");
		hp.clickLoginbtn().click();
		logg.info("successully clicked");
	}
	
}
