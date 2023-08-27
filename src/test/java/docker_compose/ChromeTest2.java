package docker_compose;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 {
	
	@Test
	public void test2() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
		driver.get("https://www.google.com/");
		
		System.out.println(System.currentTimeMillis() + "----"+ driver.getTitle());
		driver.quit();
		
	}
}
