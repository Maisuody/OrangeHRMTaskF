package pages;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;

import base.PageBase;
import junit.framework.Assert;

public class dashboardanduserPage extends PageBase{

	static String Admin = "//a[@href=\"/web/index.php/admin/viewAdminModule\"]";
	static String Recordnum = "//*[@class=\"oxd-text oxd-text--span\"]";
	
	static String Addbutton = "//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]";
	static String userRoleDropdown = "(//div[@class=\"oxd-select-text-input\"])[1]";
	// using setTimeout(() => {debugger}, 3000) to freez the page and get the xpath
	static String userRoleDropdownName = "(//div[@class=\"oxd-select-option\"]/span)[1]";
	static String statusDropdown = "(//div[@class=\"oxd-select-text-input\"])[2]";	
	static String statusDropdownName = "(//div[@class=\"oxd-select-option\"]/span)[1]";
	
	static String EmployessnamexPath= "//*[@placeholder=\"Type for hints...\"]";
	static String Employessname= "a";
	static String a = "(//*[@role=\"option\"])[2]";
	static String usernamexPath= "(//*[@class=\"oxd-input oxd-input--active\"])[2]";
	static String username= "m12345";
	static String Passwordxpath= "(//*[@type=\"password\"])[1]";
			//"(//*[@class=\"oxd-input oxd-input--active\"])[3]";
	static String Password= "Ma123456789";
	static String confirmPasswoedxpath= "(//*[@type=\"password\"])[2]";
			//"(//*[@class=\"oxd-input oxd-input--active\"])[4]";
	static String savexPath = "//*[@type=\"submit\"]";
	static String usernameSearchSlidexPath = "(//*[@class=\"oxd-icon-button\"])[2]";
	static String EnterUserName = "(//*[@class=\"oxd-input oxd-input--active\"])[2]";
	static String searchButton ="//*[@type=\"submit\"]"; 
	static String deleteiconxPath = "//*[@class=\"oxd-icon bi-trash\"]";
	static String delteIframexPath = "//*[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]";
	static String resetButton ="//*[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]";
	static int number = 0;
    WebDriver driver;

	public dashboardanduserPage(WebDriver driver) {
		 this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public void addUser1() throws InterruptedException {
	   Thread.sleep(4000);
	   FindID_clickbyXpath(driver ,Admin);
	   Thread.sleep(4000);
	   String text = getText( driver, Recordnum);
	   Thread.sleep(4000);
   	   String numberOnly= text.replaceAll("[^0-9]", "");
       number = Integer.parseInt(numberOnly);
       System.out.println(number);
	}
	public void addUserNew2() throws InterruptedException {
       FindID_clickbyXpath(driver ,Addbutton);
       Thread.sleep(4000);
       FindID_clickbyXpath(driver ,userRoleDropdown);
       FindID_clickbyXpath(driver ,userRoleDropdownName);
       Thread.sleep(4000);
       FindID_clickbyXpath(driver ,statusDropdown);
       FindID_clickbyXpath(driver ,statusDropdownName);
       Thread.sleep(4000);
       sendkey(driver ,EmployessnamexPath, Employessname);
       Thread.sleep(10000);
       FindID_clickbyXpath(driver ,a);
       sendkey(driver ,usernamexPath, username);
       Thread.sleep(4000);
       sendkey(driver ,Passwordxpath, Password);
       Thread.sleep(4000);
      sendkey(driver ,confirmPasswoedxpath, Password);
      FindID_clickbyXpath(driver ,savexPath);
      Thread.sleep(15000);
      String text1 = getText( driver, Recordnum);
      System.out.println(text1);
      String numberOnly1= text1.replaceAll("[^0-9]", "");
      int number1 = Integer.parseInt(numberOnly1);
      System.out.println(number1);
      int number2 = number1-1; 
     Assert.assertEquals(number, number2);
	}
	
	public void addUserdelete3() throws InterruptedException {
      //search for user name of new user
     // FindID_clickbyXpath(driver ,usernameSearchSlidexPath);
      sendkey(driver ,EnterUserName, username);
      FindID_clickbyXpath(driver ,searchButton);
      Thread.sleep(4000);
      //delete user Name
      FindID_clickbyXpath(driver ,deleteiconxPath);
      Thread.sleep(2000);
      FindID_clickbyXpath(driver ,delteIframexPath);
      Thread.sleep(2000);
      FindID_clickbyXpath(driver ,resetButton);
      Thread.sleep(4000);
      //make sure the number is decreased by 1
      String text3 = getText( driver, Recordnum);
      String numberOnly3= text3.replaceAll("[^0-9]", "");
      int number3 = Integer.parseInt(numberOnly3);
      Assert.assertEquals(number, number3);
      
	        
		//sendkey(driver ,userName, userNameValue);				
	}
}
