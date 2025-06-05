package insider.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import insider.utils.CommonMethods;


public class Task4 extends CommonMethods{
	
	@Test(groups ="smoke")
	public void checkJobs() {
		

		click(qualityPage.seeQA);
		wait(2);
		selectDropdown(qualityPage.filterLocation, "Istanbul, Turkiye");
		wait(2);
		selectDropdown(qualityPage.filterDepartment, "Quality Assurance");
		wait(5);
		
		//Check that all jobs’ Position contains “Quality Assurance”
		for (WebElement p : qualityPage.jobPosition)
		{
			String text = p.getText();
			System.out.println(text);
			Assert.assertTrue(text.contains("Quality Assurance"),"Not all job listings contain 'Quality Assurance'. Problematic text: " + text);
			
		}
		
		//Check Department contains “Quality Assurance”
		for (WebElement p : qualityPage.departmentPosition)
		{
			String text = p.getText();
			System.out.println(text);
			Assert.assertTrue(text.contains("Quality Assurance"),"Not all departments contain 'Quality Assurance'. Problematic text: " + text);
			
		}
		
		//Check Location contains “Istanbul, Turkey”
		for (WebElement p : qualityPage.locationPosition)
		{
			String text = p.getText();
			System.out.println(text);
			Assert.assertTrue(text.contains("Istanbul, Turkiye"),"Not all locations contain 'Istanbul, Turkiye'. Problematic text: " + text);
			
		}
		
		
		
	}
}
