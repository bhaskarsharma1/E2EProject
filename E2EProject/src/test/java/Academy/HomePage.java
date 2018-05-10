package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class HomePage extends base{
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l =new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("naga@gmail.com");
		lp.getPwd().sendKeys("123456");
		lp.getLogIn().click();
	}
	
	@DataProvider
	public void getData()
	{
		
	}

}
