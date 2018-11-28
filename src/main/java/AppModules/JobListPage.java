package AppModules;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import AppUtility.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import AppUtility.Setup;


public class JobListPage extends Setup
{
	
	
	public static String verify_jobs_list_page()
	{
		
		Log.info("locating the All job name of list page");
		List<String> jobname = new ArrayList<String>();
		 for(int i=1; i<=5; i++)
		 {

		     List<WebElement> allJobsName = driver.findElements(By.xpath("/html/body/div/div/div[2]/main/section[2]/div/a[" + i+ "]/div/span/div/div/div"));
		     for(WebElement w : allJobsName) 
		     {
		         jobname.add(w.getText());
		         	         	        	
		     }
		 }
		//System.out.println(jobname);
		
		Log.info("Locating company name & location");
		List<String> location = new ArrayList<String>();
		 for(int j=1; j<=5; j++)
		    {

		      List<WebElement> alllocations = driver.findElements(By.xpath("/html/body/div/div/div[2]/main/section[2]/div/a[" + j + "]/div/span/div/div/span"));
		      for(WebElement x : alllocations)
			     {
			    	 location.add(x.getText());
			         	         	        	
			     }
			}
		//System.out.println(location);
		
		  Log.info("Mapping the Job name with location & company name");
		  LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();  
	      for (int i=0; i<jobname.size(); i++) 
		      {
		      map.put(jobname.get(i), location.get(i));   
		    
		      }

	     System.out.println(map);
		
	     Log.info("Checking all jobs on list page has Image present");
	     for(int k=1;k<=5;k++)
		 	{
		 	WebElement ImageFile = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/section[2]/div/a[" + k + "]/div/span/div/div/img"));
		         
		         Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
		         if (!ImagePresent)
		         {
		              System.out.println("Image not displayed.");
		         }
		         else
		         {
		             System.out.println("Image displayed.");
		         }
		 	}         
	     
		return "OK";
	 }
	
}

