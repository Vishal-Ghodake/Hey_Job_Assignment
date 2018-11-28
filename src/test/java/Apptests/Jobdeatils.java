package Apptests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AppModules.JobDetailsPage;
import AppUtility.Setup;
import junit.framework.Assert;
/*
 * This test will verify the after clicking on job, Job details are get displayed.
 */

@Listeners(AppUtility.TestNGListner.class)
public class Jobdeatils extends Setup

{

  String Result;
	
  @Test
  public void Verify_Job_Details_Page() throws InterruptedException 
  {
	 
	  Result = JobDetailsPage.verify_job_details_page();
	  Assert.assertEquals(Result, "OK");
	  
  }
}
