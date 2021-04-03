package Page_with_PageFactory_Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kite_Login_PageTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		Kite_Login1_Page login1 = new Kite_Login1_Page(driver);
		login1.setKiteLogin1PageUsername();
		login1.setKiteLogin1PagePassword();
		login1.clickKiteLogin1PageLoginBtn();
		
		Kite_Login2_Page login2 = new Kite_Login2_Page(driver);
		login2.clickKiteLogin2PagePin();
		login2.clickKiteLogin2CntBtn();
		
		Kite_Home_Page home = new Kite_Home_Page(driver);
		home.clickKiteHomePage();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
