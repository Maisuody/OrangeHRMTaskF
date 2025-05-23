package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	 public	static WebDriver driver;
	public static void launchbrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\msuody\\OneDrive - DXC Production\\Documents\\automation\\automation2\\OrangeHRM\\src\\chromedriver.exe");
 driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
}
