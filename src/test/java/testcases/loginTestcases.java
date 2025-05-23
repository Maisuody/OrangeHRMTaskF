package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.loginPage;

public class loginTestcases extends TestBase {
	
	public static loginPage loginobj ;
	
	@BeforeTest
	public static void SetUp() {
		launchbrowser();
		loginobj = new loginPage(driver);
	 }
	
	@Test
	public static void login1() throws InterruptedException { 
		
		 loginobj.ValidLogin(); 
		 }

}
