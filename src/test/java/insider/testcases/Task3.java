package insider.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import insider.utils.CommonMethods;

public class Task3 extends CommonMethods{
	
	@Test(groups ="smoke")
	public void seeAllQA() {
		
		//click “See all QA jobs”
		click(qualityPage.seeQA);
		
		//filter jobs by Location: “Istanbul, Turkey”
		waitForVisibility(qualityPage.viewHover);
		selectDropdown(qualityPage.filterLocation, "Istanbul, Turkiye");
		
		//filter Department: “Quality Assurance"
		selectDropdown(qualityPage.filterDepartment, "Quality Assurance");
		
		//check the jobs
		wait(3);
		Assert.assertTrue(qualityPage.jobsList.isDisplayed());
		
	}
	

}
