package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeEnterTimeTrack_page {
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement users;
	

	@FindBy(id="logoutLink")
	private WebElement logout;
	 
	public actitimeEnterTimeTrack_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickLogout()
	{
		this.logout.click();
	}
}
