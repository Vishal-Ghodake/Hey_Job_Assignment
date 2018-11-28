package AppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * This class is written to read configuration of AUT from  property file
*/

public class ConfigReader {
	
	static Properties pro;
	
	public ConfigReader() {
		try {

			File config_src = new File("./Configuration/config.property");
			FileInputStream appconfig_fis = new FileInputStream(config_src);
			pro = new Properties();
			pro.load(appconfig_fis);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String getbrowser()
	{
		String browser = pro.getProperty("Browser");
		return browser;
		
	}
	
	public String getServerurl()
	{
		String Serverurl = pro.getProperty("Server_url");
		return Serverurl;
		
	}
	
	
 
}
