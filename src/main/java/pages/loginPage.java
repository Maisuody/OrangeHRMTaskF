package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import base.PageBase;

public class loginPage extends PageBase{
	static String userName = "//input[@name=\"username\"]";
			//"//*[@class=\"oxd-input oxd-input--active\" and @name=\"username\"]";
			//"//*[@name=\"username\"]";
	static String userNameValue = "Admin";
	static String Password = "//*[@name=\"password\"]";
	static String PasswordValue = "admin123";
	static String loginButton = "//*[@type=\"submit\"]";
	 WebDriver driver;
	
	public loginPage(WebDriver driver) {
		 this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void ValidLogin() throws InterruptedException {
		Thread.sleep(8000);
		sendkey(driver ,userName, userNameValue);
		sendkey(driver ,Password, PasswordValue);
		FindID_clickbyXpath(driver ,loginButton);		
	}
}
