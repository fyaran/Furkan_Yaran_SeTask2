package insider.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import insider.utils.CommonMethods;

public class Task2 extends CommonMethods {
	
	@Test(groups ="smoke")
	public void companySelection()
	{
		//Select the “Company” menu in the navigation bar
		click(homePage.companySlction);
		
		//select “Careers”
		click(homePage.careersSlction);
		
		//check Career page opened
		String actualTitle = driver.getTitle();
		String expectedTitle = "Ready to disrupt? | Insider Careers";
		Assert.assertEquals(actualTitle, expectedTitle, "Page title is not matched!");
		
		//its Locations visible?
		waitForVisibility(careerPage.locations);
		Assert.assertTrue(careerPage.locations.isDisplayed());
		
		//Teams visible?
		Assert.assertTrue(careerPage.teams.isDisplayed());
		
		//Life at Insider blocks are open or not
		Assert.assertTrue(careerPage.lifeInsider.isDisplayed());
		
		
		
	}

}
