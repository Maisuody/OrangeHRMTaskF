package testcases;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pages.dashboardanduserPage;
import pages.loginPage;

public class dashboardandserTestcases extends TestBase{

public static loginPage loginobj ;
public static dashboardanduserPage dashboardanduserPageobj ;
	
	//@BeforeTest
    @Given("Navigate to wesite")
	public static void SetUp() {
		launchbrowser();
		loginobj = new loginPage(driver);
		dashboardanduserPageobj = new dashboardanduserPage(driver);
	 }
    
    @Given("user is on login page and home page")
    public void user_is_on_login_page_and_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
	
	//@Test
    @When("user enter email password the login")
	public static void dashboardandusertest() throws InterruptedException { 
		    
		 loginobj.ValidLogin(); 
		// dashboardanduserPageobj.addUser();
		 }
	
    @And("go to admin page and save the number of users")
	public static void dashboardandusertest1() throws InterruptedException { 
	    
	//	 loginobj.ValidLogin(); 
		 dashboardanduserPageobj.addUser1();
		 }
    @Then("add new user and verify num. of records")
    public static void dashboardandusertest2() throws InterruptedException { 
		/*
		 * JSONObject body = new JSONObject(); body.put("User Role", "Admin");
		 * body.put("Status", "Enabled"); body.put("Employee Name",
		 * "Timothy Lewis Amiano"); body.put("Password", "Ma123456789");
		 * body.put("Password", "Confirm Password");
		 * 
		 * 
		 * // Get response Response response =
		 * RestAssured.given().contentType(ContentType.JSON).body(body.toString())
		 * .post(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates"
		 * ); response.print();
		 * 
		 * Assert.assertEquals(response.getStatusCode(), 200,
		 * "Status code should be 200, but it's not");
		 * 
		 * 
		 * // for delete the user int userid = response.jsonPath().getInt("userid");
		 * 
		 * // Delete user Response responseDelete =
		 * RestAssured.given().auth().preemptive().basic("Admin", "admin123") .delete(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates"
		 * + userid); responseDelete.print();
		 * 
		 * // Verifications // Verify response 201
		 * Assert.assertEquals(responseDelete.getStatusCode(), 201,
		 * "Status code should be 201, but it's not.");
		 */
		
    	//	 loginobj.ValidLogin(); 
    		 dashboardanduserPageobj.addUserNew2();
    		 }
    
    @And("delete this user and verify num. of records")
    public static void dashboardandusertest3() throws InterruptedException { 
	    
    	//	 loginobj.ValidLogin(); 
    		 dashboardanduserPageobj.addUserdelete3();
    		 }
	
}
