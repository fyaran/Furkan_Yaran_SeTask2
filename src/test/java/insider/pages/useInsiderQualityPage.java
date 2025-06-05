package insider.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insider.testbase.BaseClass;

public class useInsiderQualityPage {
	
	@FindBy(xpath="")
	public WebElement sadas;
	

	public useInsiderQualityPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}


}
