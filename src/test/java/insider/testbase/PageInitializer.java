package insider.testbase;

import insider.pages.useInsiderCareersPage;
import insider.pages.useInsiderHomePage;
import insider.pages.useInsiderQualityPage;

public class PageInitializer extends BaseClass{
	
	public static useInsiderHomePage homePage; 
	public static useInsiderCareersPage careerPage;
	public static useInsiderQualityPage qualityPage;
	
	public static void initialize()
	{
		homePage = new useInsiderHomePage();
		careerPage = new useInsiderCareersPage();
		qualityPage = new useInsiderQualityPage();
	}

}
