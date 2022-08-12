package comcast.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyUtlity {
	/**
	 * This method is used to takes data from property file
	 * @author Monika
	 */
	public  String getPropertyKeyVAlue(String Key) throws Throwable

	{
		
	FileInputStream fis = new FileInputStream("./Data/CommonProperty.properties");
	Properties pro = new Properties();
	pro.load(fis);
	String value=pro.getProperty(Key);
	return value;
	
	
	}

	
	
}
