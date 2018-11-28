package AppUtility;

import java.util.logging.Logger;

/*
 * This class contains methods for write logs in test of different levels All, fatal,debug,error,info,warning
 */

public class Log {
	

	private static Logger Log = Logger.getLogger(Log.class.getName());

	public static void startTestCase(String TestCaseName) {

		Log.info("------------------------------------------");
		Log.info("EXECUTING  TEST CASE-->\t" +TestCaseName);
		Log.info("------------------------------------------");
	}
	
	
	public static void endTestCase(String TestCaseName) {
		Log.info("------------------------------------------");
		Log.info("END  OF TEST CASE-->\t"+ TestCaseName);
		Log.info("------------------------------------------");
	}

	// Need to create these methods, so that they can be called

	public static void info(String message) {
		Log.info(message);
	}

	public static void warning(String message) {
		Log.warning(message);
	}
	


}