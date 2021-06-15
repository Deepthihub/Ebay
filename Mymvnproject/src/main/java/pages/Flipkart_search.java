package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import base.Flipkartbase;
import pObjects.Flipkartresults_page;
import pObjects.Flipkartsearch_page;

public class Flipkart_search extends Flipkartbase
{
	
	public void openUrl()
	{
		PageFactory.initElements(driver, Flipkartsearch_page.class);
		PageFactory.initElements(driver, Flipkartresults_page.class);
		driver.get(prop.getProperty("url"));
	}
	
	public void popupclose()
	{
		Flipkartsearch_page.popup.click();
	}
		
	public void validateTitle()
	{
		if(driver.getTitle().contains(searchword))
		{

			//Reporter.log("<font color='blue'<b>Still nothing is searched in the site</b></font>");
			exttest=report.createTest("Validate Title");
			exttest.log(Status.PASS, "Title before searching item");
			takescreenshot("Validate_Title.png");

			Reporter.log("<font color='blue'<b>Still nothing is searched in the site</b></font>");
			System.out.println("Hello");
			System.out.println("Hi");

		}
		
	}
	
	public void search()
	{
		
		Flipkartsearch_page.searchitem.sendKeys(searchword);
		Flipkartsearch_page.searchitem.sendKeys(Keys.ENTER);
	}
	
	
}










