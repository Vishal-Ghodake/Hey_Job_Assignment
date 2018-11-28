package Apptests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AppUtility.Log;
import AppUtility.constant;
/*
 * This test will verify error message when we access invalid URL
 */

@Listeners(AppUtility.TestNGListner.class)

public class InvalidUrl 
{
  WebDriver driver;
  String url;	
  	
  @Test
  public void InvalidUrlCase() throws InterruptedException 
  {
	  Log.startTestCase("Invalid Url");
	  System.setProperty(constant.ChromeDriver_key, constant.ChromeDriver_Path);
		 driver = new ChromeDriver();
		 url = "http://localhost:3333/foo";
	     driver.get(url);
		 driver.manage().window().maximize();
		 Thread.sleep(100);
		 
		 try { 
				 try 
				 {
					 String PageTitle = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/a/div/button")).getText();
					 System.out.println(PageTitle);
					 
				 }catch(Exception e)
				 {
					 //System.out.println("Exception handled of Invalid URL");
					 Log.info("Exception handled of Invalid URL");
				 }
			 
				 try
				 {
					 String Error = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/p")).getText();
					 System.out.println("Error on Page is:" + Error);
				 } catch (Exception e)
				 {
					 e.printStackTrace();
				 }
				 
			 }catch(Exception e)
		 		{
				 System.out.println("exception handelled");
		 		}
			 
		
		 driver.quit();
		 Log.endTestCase("InvalidUrl Cases Ended");
}
}