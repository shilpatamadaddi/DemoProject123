package Generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Actionutilities {
	
	WebDriver driver;
	
	public Actionutilities(WebDriver driver) {
		this.driver=driver;
	}
	
	public void validateTitle(String expectedTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		Reporter.log("Pass:Title is matching", true);
		}
		 catch (Exception e) {
			 
	    Reporter.log("Fail:Title is not matching", true);
	  
		Assert.fail();
		}
		
		
	}
	
	public void validatevisibility(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Pass:element is visible", true);
		}
		 catch (Exception e) {
			 
	    Reporter.log("Fail:element is not matching", true);
		Assert.fail();
		}
		
		
	}
	
	
	
	public void getscreenshot(String scriptName)
	{
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+scriptName+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
		
		
	}
	
	
	public void doubleclick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public void rightclick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}

}
