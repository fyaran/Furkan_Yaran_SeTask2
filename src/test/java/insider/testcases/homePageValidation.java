package insider.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import insider.utils.CommonMethods;

public class homePageValidation extends CommonMethods{
	
	@Test
	public void homeValidation()
	{
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "#1 Leader in Individualized, Cross-Channel CX — Insider";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Page title is not matched!");
	}

}
