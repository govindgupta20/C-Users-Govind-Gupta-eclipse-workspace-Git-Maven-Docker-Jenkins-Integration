package ProperySetup;

import java.util.Optional;

import org.testng.annotations.Test;

public class PropertyReadingWay {

	@Test()
	public void Test1() throws Exception {
 
	//Property reading from property file	
	String Browser = PropReader.getInstance().getProperty("browser");
	String Env = PropReader.getInstance().getProperty("env");
	
	// need to work on..currently its not taking value as expected
     System.out.println("Browser is :"+Browser);
     System.out.println("Environemnt is :"+Env);
     
     
     //property reading through system .get property
       
    String BrowserName = Optional.ofNullable(System.getProperty("browser")).orElse("defaultchrome");
    System.out.println("Selected browser is -> "+BrowserName);
    
    String EnvName = Optional.ofNullable(System.getProperty("env")).orElse("Defaultdev");
    System.out.println("Selected browser is -> "+EnvName);
 
     
	}
	
}
