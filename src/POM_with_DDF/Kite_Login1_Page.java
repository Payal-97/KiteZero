package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1_Page 
{
		//step 1: declaration of variable
		@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
		
		
		@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
		
		
		@FindBy(xpath = "//button[text()='Login ']") private WebElement login;
		
		//step 2: Initialization
		public Kite_Login1_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//enter UN
		public void setKiteLogin1PageUsername(String username)
		{
			UN.sendKeys(username);
		}
		
		//enter pwd
		public void setKiteLogin1PagePassword(String password)
		{
			pwd.sendKeys(password);
		}
		
		//click on login Button
		public void clickKiteLogin1PageLoginBtn()
		{
			login.click();
		}
	
}
