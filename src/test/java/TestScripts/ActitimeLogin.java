package TestScripts;

import org.testng.annotations.Test;
import Generics.BaseTest;
import Generics.ExcelUtilities;
import POM.actitimeLogin_Page;

public class ActitimeLogin extends BaseTest{
	
	@Test
	public void actitimeLoginScript()
	{
        actitimeLogin_Page ob = new actitimeLogin_Page(driver);
	    ob.setUsername(ExcelUtilities.getCellData(ExcelPath, "LoginCredentials", 1, 0));
	    ob.setPassword(ExcelUtilities.getCellData(ExcelPath, "LoginCredentials", 1, 1));
	    ob.clickLogin();
	    actionutil.validateTitle("actiTIME - Enter Time-Tra");
	}

}
