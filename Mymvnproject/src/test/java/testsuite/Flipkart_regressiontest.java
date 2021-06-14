package testsuite;

import org.testng.annotations.Test;

import pages.Flipkart_search;
import pages.Flipkartsearch_results;

public class Flipkart_regressiontest 
{
	@Test
     public void regressionTest()
     {
    	Flipkart_search fs = new Flipkart_search();
 		Flipkartsearch_results fsr = new Flipkartsearch_results();
 		
 		fs.openUrl();
 		//fs.popupclose();
 		fs.search();
 		
 		fsr.validateSearchedTitle();
 		fsr.maxPrice();
 		fsr.newestFirst();
 		fsr.firstMobileinfo();
     }
}
