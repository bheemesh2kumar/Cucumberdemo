package Com.BaseLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	
	public Properties prop;
	public FileInputStream ip;
	
	public BaseClass() throws IOException
	{
		prop=new Properties();
		
		try{
		 ip=new FileInputStream("C:/Users/home/workspace/CucumberProject/src/main/java/Com/Configirations/Config.properties");
		}catch(FileNotFoundException excep)
		{
			excep.printStackTrace();
			excep.getMessage();
		}
		 prop.load(ip);
	}
	
	
	
	public static void intialize()
	{
		
	}

}
