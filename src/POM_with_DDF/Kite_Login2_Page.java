package POM_with_DDF;

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
	public void clickKiteLogin2PagePin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	//click on cnBtn
	public void clickKiteLogin2CntBtn()
	{
		cntBtn.click();
	}
}
