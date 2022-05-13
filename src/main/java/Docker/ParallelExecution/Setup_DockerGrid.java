package Docker.ParallelExecution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup_DockerGrid {

@BeforeSuite
public void Start_DockerGrid() throws Exception {
	System.out.println("Starting Docker");
	Runtime.getRuntime().exec("cmd /c start Start_DockerGrid.bat");
	Thread.sleep(30000);
	System.out.println("Docker Started...procedding after 30 sec wait");
	
}


@AfterSuite
public void Stop_DockerGrid() throws Exception {
	Runtime.getRuntime().exec("cmd /c start Stop_DockerGrid.bat");
	System.out.println("Stoppind Docker");
	Thread.sleep(10000);
	Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	System.out.println("Docker container stopped");
	
}
	
}
