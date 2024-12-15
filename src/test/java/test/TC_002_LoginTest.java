package test;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.Homepage;

public class TC_002_LoginTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void setup() throws IOException { 
		// TODO Auto-generated method stub
		
		readFromPropFile("LoginTestData");
		sheetName ="LoginTestData"; 
		testName = "LoginTest";
		testDescription = "Testing the login functionality with positive and negative cases";
		testAuthor = "Pradeep Kumar";
		testCategory = "Smoke Testing";
	}
	
	@Test(dataProvider = "excelRead")
	public void loginTest(String username, String password, String type, String message) {
		
		Homepage obj = new Homepage(driver);
		obj.loginClick()
		.username(username)
		.password(password)
		.loginButton()
		.validateLogin(type,message); 
		
	}

}
