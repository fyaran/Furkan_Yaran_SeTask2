package insider.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import insider.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{
	/**
	 * This method clears a textbox and sends a text parameter to it.
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) 
	{
		element.clear();
		element.sendKeys(text);
	}
	

	/**
	 * This method will wait for the element to be clickable and then on click it.
	 * 
	 * @param element
	 */
	public static void click(WebElement element)
	{
		waitForClickability(element);
		element.click();
	}
	
	
	
	/**
	 * This method pauses the execution for a certain amount of seconds.
	 * 
	 * @param seconds
	 */
	public static void wait(int seconds)
	{
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * This method selects a drop down element based on visible text.
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, String visibleText) 
	{
		try 
		{
			Select sl = new Select(element);
			sl.selectByVisibleText(visibleText);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method selects a drop down element based on index.
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDropdown(WebElement element, int index) 
	{
		try 
		{
			Select sl = new Select(element);
			sl.selectByIndex(index);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	



	
	/**
	 * This method creates a wait object based on the driver and EXPLICIT_WAIT_TIME
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject()
	{
		return new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
	}
	
	/**
	 * This method will wait for the element to be visible.
	 * 
	 * @param locator
	 * @return
	 */
	public static WebElement waitForVisibility(By locator)
	{
		return getWaitObject().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * This method will wait for the element to be visible.
	 * 
	 * @param element
	 * @return
	 */
	public static WebElement waitForVisibility(WebElement element)
	{
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will wait for the element to be visible.
	 * 
	 * @param element 
	 * 
	 * @return
	 */
	public static WebElement waitForClickability(WebElement element)
	{
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	


	/**
	 * This method will create and return a JavascriptExecutor object.
	 * 
	 */
	public static JavascriptExecutor getJSObject()
	{
		return (JavascriptExecutor) driver;
		
		/*
		 The line above is the same as this: 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 return js;
		 
		 */
	}
	
	
	
	/**
	 * This method takes a screenshot and saves it with the given fileName and returns the screenshot
	 * destination
	 * 
	 * @param fileName
	 */
	public static String takeScreenshot(String fileName)
	{
		
		String destination = Constants.SCREENSHOT_FILEPATH + fileName + getTimestamp() + ".png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenShot, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return destination;
	}
	
	/**
	 * This method returns a timestamp as a String.
	 * 
	 * @return
	 */
	public static String getTimestamp()
	{
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		
		return sdf.format(date);
		
	}
	
}
