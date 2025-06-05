package insider.pages;

import java.util.List;

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
	
	@FindBy(xpath="//*[@id=\"jobs-list\"]/div/div/p")
	public List<WebElement> jobPosition;
	
	@FindBy(xpath="//*[@id=\"jobs-list\"]/div/div/span")
	public List<WebElement> departmentPosition;
	
	@FindBy(xpath="//*[@id=\"jobs-list\"]/div/div/div")
	public List<WebElement> locationPosition;
	
	@FindBy(xpath="//*[@id=\"jobs-list\"]/div[1]/div")
	public WebElement viewHover; 

	@FindBy(xpath="//a[contains(text(), 'View Role')]")
	public WebElement viewRole; 

	public useInsiderQualityPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}


}
