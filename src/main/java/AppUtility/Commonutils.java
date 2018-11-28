package AppUtility;

import org.openqa.selenium.WebDriver;

/*
 * This class contains the  common utilities of the application like maximize browser,
 * taking screenshot, picking the data file etc
 */

public class Commonutils 

{
	
	public static void maximize_browser_window(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
}
