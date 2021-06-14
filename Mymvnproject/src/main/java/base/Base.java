package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String searchword;
	
	@BeforeSuite
	public void setUp()	
	{
		prop=new Properties();
		try
		{
			prop.load(new FileInputStream("src/main/java/config/config.properties"));
		}
		catch(Exception e) {}
		
		if(prop.getProperty("browsername").matches("chrome"))
		{
		driver = new ChromeDriver();
		}
		if(prop.getProperty("browsername").matches("firefox"))
				{
					driver=new FirefoxDriver();
				}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);	
		
		searchword=prop.getProperty("searchtext");
	}
	
	@AfterSuite
	public void shutDown()
	{
		driver.quit();
	}

}





