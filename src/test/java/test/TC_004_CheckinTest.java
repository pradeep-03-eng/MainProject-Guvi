package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepage;

public class TC_004_CheckinTest extends ProjectSpecificationMethods{
	
	
	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
		testName = "CheckinTest";
		testDescription = "Testing the Checkin functionality with positive and negative cases";
		testAuthor = "Pradeep Kumar";
		testCategory = "smoke Testing"; 
	}
	
	@Test 
	public void checkinTest() {
		
		Homepage obj = new Homepage(driver);
		obj.loginClick()
		.username(prop.getProperty("validusername")) 
		.password(prop.getProperty("validpassword"))
		.loginButton()
		.details()
		.values() 
		.validateCheckinPage();
		
		}
}





