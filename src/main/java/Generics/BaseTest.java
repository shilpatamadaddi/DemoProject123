package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant{
	
	public WebDriver driver;
	public Actionutilities actionutil;
	//sets the path for driver executibles
	static
	{
		System.setProperty(ChromeKey, ChromeValue);
		System.setProperty(GeckoKey, GeckoValue);
	}
	
	@BeforeMethod
	public void precondition()
	{  
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		actionutil=new Actionutilities(driver);
		
	}
	
	@AfterMethod
	public void postcondition(ITestResult r)
	{
		String scriptname = r.getMethod().getMethodName();
		int status=r.getStatus();
		if(status==2)
		{
			actionutil.getscreenshot(scriptname);
		}
		driver.close();
	}

}
