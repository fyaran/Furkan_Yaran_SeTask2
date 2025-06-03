package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.testbase.BaseClass;

public class useInsiderHomePage {
	
	@FindBy(xpath = "//div[@id='navbarNavDropdown']/ul/li/a[contains(., 'Company')]")
	public WebElement companySlction;
	
	
	

	public useInsiderHomePage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
