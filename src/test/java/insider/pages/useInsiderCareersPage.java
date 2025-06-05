package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.testbase.BaseClass;

public class useInsiderCareersPage {
	
	@FindBy(css = "#career-our-location")
	public WebElement locations;
	
	@FindBy(xpath ="//section[@id='career-find-our-calling']//a[text()='See all teams']")
	public WebElement teams;
	
	@FindBy(xpath="//section//h2[text()='Life at Insider']")
	public WebElement lifeInsider;
	

	public useInsiderCareersPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
