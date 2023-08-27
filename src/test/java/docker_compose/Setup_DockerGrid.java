package docker_compose;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		// this opens a command prompt and runs the batch file
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(25000);
	}
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(5000);
		
		// this will close all command prompts
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
