package pages;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import base.Flipkartbase;
import pObjects.Flipkartresults_page;


public class Flipkartsearch_results extends Flipkartbase
{

	public void validateSearchedTitle()
	{
		if(driver.getTitle().contains(searchword))
		{
			Reporter.log("<font color='green'<b>Searched Mobiles</b></font>");
		}
		
	}
	
	public void maxPrice()
	{
		
		new Select(Flipkartresults_page.maxprice).selectByValue("30000");
		
	}
	
	public void newestFirst()
	{
		
		Flipkartresults_page.newestfirst.click();
	}
	
	public void firstMobileinfo()
	{
		
		String price;
		int total=0;
		
		for(int i=0;i<1;i++)
		{
			price=Flipkartresults_page.prices.get(i).getText();
			price=price.substring(1);
			price=price.replace(",", "");
			total=total+Integer.parseInt(price);
			
		}
		
		Reporter.log("<font color='orange'><b>First Mobile name : </b></font>"+Flipkartresults_page.mobilenames.get(0).getText());
		//System.out.println("It's price : "+Flipkartresults_page.prices.get(0).getText());
		Reporter.log("<font color='orange'><b>It's price : </b></font>"+total);
	}
}



