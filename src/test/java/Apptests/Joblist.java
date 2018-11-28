package Apptests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AppModules.JobListPage;
import AppUtility.Log;
import AppUtility.Setup;
import junit.framework.Assert;
/*
 * This test will verify that there are 5 jobs are listed on job list page with company name,location
 */

@Listeners(AppUtility.TestNGListner.class)

public class Joblist extends Setup
{
 
  String Result;	
	
  @Test
  public void Verify_job_list_page() 
  {

	  Result = JobListPage.verify_jobs_list_page();
	  Assert.assertEquals(Result, "OK");
	  	  
  }
}
