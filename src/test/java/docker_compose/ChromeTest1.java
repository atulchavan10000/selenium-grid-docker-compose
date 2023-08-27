package docker_compose;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {
	
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println(System.currentTimeMillis() + "----"+ driver.getTitle());
		driver.quit();
		
	}
}
