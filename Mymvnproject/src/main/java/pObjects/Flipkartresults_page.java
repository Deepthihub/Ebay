package pObjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Flipkartresults_page 
{

	@FindBy(xpath="(//select[@class='_2YxCDZ'])[2]") public static WebElement maxprice;
	@FindBy(xpath="//div[@class='_5THWM1']/div[5]") public static WebElement newestfirst;
	
	@FindBy(xpath="//div[@class='_4rR01T']") public static List<WebElement> mobilenames;
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']") public static List<WebElement> prices;
	
}
