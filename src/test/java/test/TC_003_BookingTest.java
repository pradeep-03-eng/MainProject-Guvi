package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepage;

public class TC_003_BookingTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
		testName = "BookingTest";
		testDescription = "Testing the booking functionality with positive and negative cases";
		testAuthor = "Pradeep Kumar";
		testCategory = "Smoke Testing"; 
	}
	
	@Test
	public void bookingTest() {
		
		Homepage obj = new Homepage(driver);
		obj.loginClick() 
		.username(prop.getProperty("validusername")) 
		.password(prop.getProperty("validpassword"))
		.loginButton()
		.validateBooking() 
		.details();
	
		
	}

}
