package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class BookingPage extends ProjectSpecificationMethods {
	
	public BookingPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public CheckinPage details() {
		// TODO Auto-generated method stub
	
		return new CheckinPage(driver);
		
	}

	

	}


