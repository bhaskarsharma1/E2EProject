package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("//Users//mukka//Desktop//Selenium Projects//E2EProject//src//main//java//resources//data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			// invoke the Chrome driver first.
			System.setProperty("webdriver.chrome.driver", "/Users/mukka/Desktop/Selenium Projects/chromedriver");
			//Create a driver object and import the WebDriver method.
			driver =new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			//invoke the firefox driver.
			System.setProperty("webdriver.gecko.driver", "/Users/mukka/Desktop/Selenium Projects/geckodriver");
			//Create a driver object and import the WebDriver method.
			 driver = new FirefoxDriver();
		}
		else if(browserName.equals("safari"))
		{
			System.setProperty("webdriver.safari.driver","/Users/mukka/Desktop/Selenium Projects/SafariDriver");
			driver = new SafariDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
