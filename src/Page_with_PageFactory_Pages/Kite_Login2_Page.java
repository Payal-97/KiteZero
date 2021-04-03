package Page_with_PageFactory_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2_Page 
{
	@FindBy(xpath = "//input[@id='pin']")  private WebElement pin;
	@FindBy(xpath = "//button[text()='Continue ']")  private WebElement cntBtn;
	
	public Kite_Login2_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//enter pin
	public void clickKiteLogin2PagePin()
	{
		pin.sendKeys("959594");
	}
	
	//click on cnBtn
	public void clickKiteLogin2CntBtn()
	{
		cntBtn.click();
	}
}
