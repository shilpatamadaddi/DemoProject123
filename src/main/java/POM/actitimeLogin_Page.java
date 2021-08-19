package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class actitimeLogin_Page {
		
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	
	public actitimeLogin_Page(WebDriver driver) {
		//initialises the webelements
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUsername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		this.password.sendKeys(pw);
	}
	public void clickLogin()
	{
		this.loginButton.click();
	}
	
	
	
    
}


