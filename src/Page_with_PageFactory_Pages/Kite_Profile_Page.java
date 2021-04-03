package Page_with_PageFactory_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Profile_Page 
{
@FindBy(xpath = "//a[text() = ' Logout']") private WebElement logout;
	
	public Kite_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickKiteProfilePageLogoutBtn()
	{
		logout.click();
	}

}
