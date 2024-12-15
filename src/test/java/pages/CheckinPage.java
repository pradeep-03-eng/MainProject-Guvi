package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class CheckinPage extends ProjectSpecificationMethods{
	
	public CheckinPage(WebDriver driver) {
		this.driver = driver;  	
	}
	
	public Homepage values() {
		// TODO Auto-generated method stub
	
		return new Homepage(driver);
		
	}

	
	}


