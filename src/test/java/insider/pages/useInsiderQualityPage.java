package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.testbase.BaseClass;

public class useInsiderQualityPage {
	
	@FindBy(xpath="//div/a[text()='See all QA jobs']")
	public WebElement seeQA;
	
	@FindBy(xpath="//select[@id='filter-by-location']")
	public WebElement filterLocation;
	
	@FindBy(xpath="//select[@id='filter-by-department']")
	public WebElement filterDepartment;
	
	@FindBy(css="#jobs-list")
	public WebElement jobsList;
	
	

	public useInsiderQualityPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}


}
