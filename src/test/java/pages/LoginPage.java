package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage username(String pradeepkumar3) {
		
		sendKeysMethod(username,pradeepkumar3);
		return this;	
	}
	
	public LoginPage password(String passcode) {
		
		sendKeysMethod(password,passcode);
		return this;	
	}
		
	public Homepage loginButton() {
		
		login.click();
		return new Homepage(driver); 
	}

	
	
	
}
