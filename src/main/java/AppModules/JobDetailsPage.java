package AppModules;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import AppUtility.Log;
import AppUtility.Setup;


public class JobDetailsPage extends Setup
{
	static String OriginalHomepage = "Jobs Fabrik | Jobs offers list";
	
	
  	public static String verify_job_details_page() throws InterruptedException
	{
  		 Log.info("Searching for the jobname on job list page");
		 String jobname= driver.findElement(By.xpath("/html/body/div/div/div[2]/main/section[2]/div/a[1]/div/span/div/div/div")).getText();
		 //System.out.println(jobname);
		 Log.info("Clicking to view deatils of the job");
		 driver.findElement(By.xpath("/html/body/div/div/div[2]/main/section[2]/div/a[1]/div/span/div/div/div")).click();
		 Thread.sleep(100);
		 String NameOndetails = driver.findElement(By.xpath("//h1[@class='sc-EHOje eymTpQ']")).getText();
		 //System.out.println(NameOndetails);
           
		 Log.info("verifing job details");
         if(jobname.equals(NameOndetails))
	        {
	       	 System.out.println("job deatils displayed successfully.");
	        }
         else
	        {
	       	 System.out.println("job details not displayed");
	        }
         return "OK";
         
	}
     
  	
  	public static String navigate_back_to_list_page() throws InterruptedException
  	{
  	    
  		//driver.navigate().back();
        Log.info("clicking on job name on list page");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/main/section[2]/div/a[1]/div/span/div/div/div")).click();
        Thread.sleep(100);
        Log.info("Clicking on back button present on job list page");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/main/a/div/button")).click();
        String homepage = driver.getTitle();
        //System.out.println(homepage);
        Log.info("Compairing the title of page after cliking on back button");
        
        try
  	     {		   
  	       assertEquals(OriginalHomepage, homepage);         
           //System.out.println("navigated to list page");
  	     }catch (Exception e)
  	  		{
  	    	 	e.printStackTrace();
  	  		}
	
		return "OK";
		
	}

}
