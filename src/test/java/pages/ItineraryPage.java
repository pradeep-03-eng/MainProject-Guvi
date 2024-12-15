package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class ItineraryPage extends ProjectSpecificationMethods {
	
	public ItineraryPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public ItineraryPage searchHotel() {
		
		 driver.findElement(By.id("order_id_text")).sendKeys("C71G1DM67H");
		 driver.findElement(By.id("search_hotel_id")).click();
		 return null;
		
		
	}


}
