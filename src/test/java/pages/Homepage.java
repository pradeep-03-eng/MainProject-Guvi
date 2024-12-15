package pages;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class Homepage extends ProjectSpecificationMethods {
	
	@FindBy(className = "login_register") 
	WebElement register;
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
	
	public RegisterPage registerClick() {
		
		driver.findElement(By.className("login_register")).click(); 
		return new RegisterPage(driver);
		}
	
	public LoginPage loginClick() {
		
		driver.findElement(By.id("login")).click();
		return new LoginPage(driver);
	}

	public Homepage loginButton() { 

		driver.findElement(By.id("login")).click();
		return new Homepage(driver);
		
	}
	

	public  Homepage validateLogin(String testcase, String expected) {
		
		if(testcase.equals("validusernameAndvalidpassword")) {
		
		String actualId=driver.findElement(By.className("welcome_menu")).getText();
		
		
		if(expected.equalsIgnoreCase(actualId)) {
			
			System.out.println("Login Successful");
		}else {
			
			System.out.println("Login failed");
		}
		}else if(testcase.equals("invalidusernameAndvalidpassword")) {
			
			 String actual = driver.findElement(By.xpath("//div[@class='auth_error']")).getText();
		
		if(expected.equalsIgnoreCase(actual)) {
			
			System.out.println("Test Case Passed");
			
		}else {
			
		
			System.out.println("Test Case Failed");
		}
		}
	
		return this;
	}


	public Homepage details() { 
		// TODO Auto-generated method stub
		driver.findElement(By.id("location")).sendKeys("Melbourne");
		driver.findElement(By.id("hotels")).sendKeys("Hotel Sunshine");
		driver.findElement(By.id("room_type")).sendKeys("Standard");
		driver.findElement(By.id("room_nos")).sendKeys("2");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("03/01/2025");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("05/01/2025");
		driver.findElement(By.id("adult_room")).sendKeys("2");
		driver.findElement(By.id("child_room")).sendKeys("0");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
		driver.findElement(By.id("continue")).click();
		return new Homepage(driver) ;
		
	}

	public Homepage values() {
		 
		 driver.findElement(By.id("first_name")).sendKeys("Pradeep");
		 driver.findElement(By.id("last_name")).sendKeys("Kumar");
		 driver.findElement(By.id("address")).sendKeys("No-4,Church Street");
		 driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		 driver.findElement(By.id("cc_type")).sendKeys("VISA");
		 driver.findElement(By.id("cc_exp_month")).sendKeys("October");
		 driver.findElement(By.id("cc_exp_year")).sendKeys("2030");
		 driver.findElement(By.id("cc_cvv")).sendKeys("321");
		 driver.findElement(By.id("book_now")).click();
		 driver.findElement(By.id("my_itinerary")).click();
		 
		 driver.findElement(By.id("order_id_text")).sendKeys("C71G1DM67H");
		 driver.findElement(By.id("search_hotel_id")).click();
		 
		 return new Homepage(driver); 
		 
		 
	}
	
	
	public Homepage validateBooking() {
		
		String expectedId = "Booked Itinerary";
		String actualId=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).getText();
		
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Booking Successful");
			System.out.println("TestCase Passed");
		}else {
			
			System.out.println("Booking failed");
			System.out.println("TestCase failed");
		}
		return this;
		
}
	
	
	
public Homepage validateCheckinPage() {
		
		String expectedId = "Booked Itinerary";
		String actualId=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).getText();
		
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Check-In Successful");
		}else {
			
			System.out.println("Check-In failed");
		}
		return this;
}
	
}


	
	
	


