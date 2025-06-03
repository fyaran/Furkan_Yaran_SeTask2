package insider.testbase;

import insider.pages.useInsiderHomePage;

public class PageInitializer extends BaseClass{
	
	public static useInsiderHomePage homePage; 
	
	public static void initialize()
	{
		homePage = new useInsiderHomePage();
	}

}
