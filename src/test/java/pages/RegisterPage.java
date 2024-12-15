package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterPage extends ProjectSpecificationMethods {
	
	public RegisterPage (WebDriver driver) {
		
		RegisterPage.driver=driver;
	}
	
	public RegisterPage username() {
		
		driver.findElement(By.id("username")).sendKeys("kgpradeep91");
		return this;	
	}
	
	public RegisterPage password() {
		
		driver.findElement(By.id("password")).sendKeys("12345678");
		return this;
	}
	
	public RegisterPage conpassword() {
		
		driver.findElement(By.id("re_password")).sendKeys("12345678");
		return this;	
	}
	
	public RegisterPage fullname() {
		
		driver.findElement(By.id("full_name")).sendKeys("kgpradeepkumarr");
		return this;	
	}
	
	public RegisterPage email() {
		
		driver.findElement(By.id("email_add")).sendKeys("kgpradeep311@gmail.com");
		return this;
		
	}
	

	public RegisterPage checkbox() {
		
		driver.findElement(By.id("tnc_box")).click();
		return this;	
	}
	
	public RegisterResult submitbutton() {
		
		driver.findElement(By.id("Submit")).click();
		return new RegisterResult(driver);	
	}
}

