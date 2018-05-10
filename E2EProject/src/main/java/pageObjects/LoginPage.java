package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.cssSelector("[id='user_email']");
	By pwd=By.cssSelector("[type='password']");
	By login=By.cssSelector("[value='Log In']");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getLogIn()
	{
		return driver.findElement(login);
	}

}
