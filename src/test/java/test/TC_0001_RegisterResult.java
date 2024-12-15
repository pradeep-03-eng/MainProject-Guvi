package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepage;


public class TC_0001_RegisterResult extends ProjectSpecificationMethods{
	
	@BeforeTest
	public void setup()throws IOException {
		
		readFromPropFile("LoginTestData");
		sheetName ="LoginTestData";
		testName = "LoginTest";
		testDescription = "Testing the register functionality with data hard code";
		testAuthor = "Pradeep Kumar";
		testCategory = "Smoke Testing";
	} 
		
	
	@Test
	public void RegisterTest() {
		
		Homepage obj = new Homepage(driver);
		obj.registerClick()
		.username()
		.password()
		.conpassword()
		.fullname()
		.email()
		.checkbox()
		.submitbutton()
		.validateRegister();
		
	}

}
