package insider.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import insider.utils.CommonMethods;

public class Task5 extends CommonMethods{
	
	@Test(groups ="smoke")
	public void applicationPage()
	{
		click(qualityPage.seeQA);
		waitForVisibility(qualityPage.viewHover);
		selectDropdown(qualityPage.filterLocation, "Istanbul, Turkiye");
		selectDropdown(qualityPage.filterDepartment, "Quality Assurance");
		wait(5);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(qualityPage.viewHover).perform();
		
		
		waitForClickability(qualityPage.viewRole);
		String originalWindow = driver.getWindowHandle();
		
		jsClick(qualityPage.viewRole);
		
	    for (String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalWindow)) {
	            driver.switchTo().window(handle);
	            break;
	        }
	    }

	    Assert.assertTrue(driver.getCurrentUrl().contains("lever.co"),
	            "Redirect to Lever application page failed.");
		
	}

}
