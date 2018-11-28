package Apptests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AppModules.JobDetailsPage;
import AppUtility.Setup;
import junit.framework.Assert;


/*
 * This test will verify the navigation from job details to job list page.
 */

@Listeners(AppUtility.TestNGListner.class)

public class NavigateBackToList extends Setup
{ 
  
  String Result;	
	
  @Test
  public void Nvaigate_back_to_list_page() throws InterruptedException 
  {
	  Result = JobDetailsPage.navigate_back_to_list_page();
	  Assert.assertEquals(Result, "OK");
	  
  }
}
