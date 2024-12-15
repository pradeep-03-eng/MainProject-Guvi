package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterResult extends ProjectSpecificationMethods {
	
	public RegisterResult(WebDriver driver) {
	
	this.driver=driver;
	}
	
	public RegisterResult validateRegister() {
		
		String expectedId = "Click here to login";
		String actualId=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table/tbody/tr/td/a")).getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Registration Successful");
		}else {
			
			System.out.println("Registration failed");
		}
		
		return this;
	}
	
	


public RegisterResult validateLogin() {
		
		String expectedId = "Welcome to Adactin Group of Hotels";
		String actualId=driver.findElement(By.className("welcome_menu")).getText();
		
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Login Successful");
		}else {
			
			System.out.println("Login failed");
		}
		
		return this;
}

public RegisterResult validateBooking() {
	
	String expectedId = "Booked Itinerary";
	String actualId=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).getText();
	
	
	if(expectedId.equalsIgnoreCase(actualId)) {
		
		System.out.println("Booking Successful");
	}else {
		
		System.out.println("Booking failed");
	}
	return this;
	
}
}
