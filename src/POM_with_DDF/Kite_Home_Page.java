package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page 
{
	@FindBy(xpath = "//div[@class='avatar']/span") private WebElement PN;
	
	public Kite_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void verifyKiteHomePagePN()
	{
		String actPN = PN.getText();
		String expPN="KV";
		
		if(expPN.equals(actPN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	public void clickKiteHomePage()
	{
		PN.click();
	}

}
