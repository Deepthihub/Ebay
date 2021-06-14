package testsuite;

import org.testng.annotations.Test;

import pages.Flipkart_search;


public class Flipkart_smoketest 
{
	@Test
	public void smokeTest()
	{
		Flipkart_search fs = new Flipkart_search();
		
		
		fs.openUrl();
		fs.popupclose();
		fs.validateTitle();
		
	}
}
