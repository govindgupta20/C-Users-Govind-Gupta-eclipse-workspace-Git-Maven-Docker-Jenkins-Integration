package Docker.ParallelExecution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Setup_DockerGrid {

@BeforeSuite
public void Start_DockerGrid() throws Exception {
	Runtime.getRuntime().exec("cmd /c start Start_DockerGrid.bat");
	Thread.sleep(30000);
	
}


@AfterSuite
public void Stop_DockerGrid() throws Exception {
	Runtime.getRuntime().exec("cmd /c start Stop_DockerGrid.bat");
	Thread.sleep(10000);
	Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	
}
	
}
