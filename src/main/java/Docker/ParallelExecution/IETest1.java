package Docker.ParallelExecution;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ProperySetup.PropReader;

public class IETest1 {
  
	@Test()
	public void Test1() throws Exception {
 
		String Browser = PropReader.getInstance().getProperty("browser");
		String Env = PropReader.getInstance().getProperty("env");
		
     System.out.println("Browser is :"+Browser);
     System.out.println("Environemnt is :"+Env);
     
     System.out.println("Browser is :"+System.getProperty("env"));
     System.out.println("Environemnt is :"+System.getProperty("browser"));
     System.out.println("Random is :"+System.getProperty("random"));
     
     
		
     /*
     
     
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	
	
	URL url = new URL("http://localhost:4444/wd/hub");
	WebDriver driver = new RemoteWebDriver(url, cap);
	
	driver.get("https://www.microsoft.com/en-us/edge");
	System.out.println("Page Title is: "+ driver.getTitle());
	driver.quit();
*/
}
}
