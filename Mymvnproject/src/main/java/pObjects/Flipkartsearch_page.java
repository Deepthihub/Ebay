package pObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkartsearch_page 
{

	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") public static WebElement popup;
	@FindBy(name="q") public static WebElement searchitem;
	
	
}
