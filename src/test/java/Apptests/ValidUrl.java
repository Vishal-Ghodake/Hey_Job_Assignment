package Apptests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AppModules.ApplicationUrl;
import AppUtility.Setup;
import junit.framework.Assert;

/*
 * This test will verify the accessed URL is correct URL. 
 */

@Listeners(AppUtility.TestNGListner.class)
public class ValidUrl extends Setup
{
	
	String Result;
	
  @Test
  public void ValidurlCase() 
  {	  
	      
		  Result = ApplicationUrl.ValidServerUrl();
		  Assert.assertEquals(Result, "OK");
	     
	  
  }
}
