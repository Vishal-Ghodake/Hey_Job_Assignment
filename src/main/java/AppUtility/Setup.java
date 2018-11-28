package AppUtility;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


/*
  
  This method is used to Setup browser and initialize driver  

 */

public class Setup
{
	
	public static ConfigReader cr = new ConfigReader();
	public static WebDriver driver; 
	public static String browser = cr.getbrowser();
	public static String Server_url = cr.getServerurl();

	public static void BrowserSetup (String browser)
	{
		if(browser.equals("Firfox"))
		{
			Log.info("browser loading");
			System.setProperty(constant.Firfoxdriver_key,constant.ChromeDriver_Path);
			Log.info("Firfox browser loaded. Initiallizing the browser");
			driver = new FirefoxDriver();
			Commonutils.maximize_browser_window(driver);
            Log.info("Firfox browser launched successfully");
			
		}
		else if (browser.equals("Chrome"))
		{
			Log.info("browser loading");
			System.setProperty(constant.ChromeDriver_key, constant.ChromeDriver_Path);
			Log.info("Chrome browser loaded. Initiallizing the browser");
			driver = new ChromeDriver();
			Commonutils.maximize_browser_window(driver);
			Log.info("Chrome browser launched sucessfully");
			
		}
	}
//=========================================================================================

	@BeforeMethod
	public static void LaunchApp() throws InterruptedException
        {

			Log.info("Initializing Application Setup");
			BrowserSetup(browser);
			//System.out.println(Server_url);
			driver.get(Server_url);
			Log.info("Application URL Found \t" + constant.Server_url);
			Thread.sleep(2000);
        }

	@AfterMethod
	public void CloseApp()
		{
			Log.info("Closing Application");
			driver.quit();
		}
	

}
