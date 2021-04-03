package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Login_PageTest 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{

		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\KiteZero\\src\\Data\\InvestmentBank.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		Kite_Login1_Page login1 = new Kite_Login1_Page(driver);
		
		login1.setKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		
		login1.setKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		
		login1.clickKiteLogin1PageLoginBtn();
		
		Kite_Login2_Page login2 = new Kite_Login2_Page(driver);
		
		login2.clickKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		
		login2.clickKiteLogin2CntBtn();
		
		Kite_Home_Page home = new Kite_Home_Page(driver);
		home.clickKiteHomePage();
		
		Thread.sleep(4000);
		driver.quit();
	}
}
