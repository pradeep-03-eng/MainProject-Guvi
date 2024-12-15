package utils;

import java.awt.im.InputContext;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class UtilityClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public String sheetName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testCategory, testAuthor;
		
		 
	public void browserLaunch(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}	
	
	public void closeBrowser() {
		
		driver.close();
		
	}
	
	public void visibilityOfElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public void sendKeysMethod(WebElement ele, String input) {
		
		ele.sendKeys(input);		
	}
	
	public static void readFromPropFile(String filename) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Guvi-project\\src\\test\\resources\\testData\\"+filename+".properties");
		prop = new Properties();
		prop.load(file);
	}
	
	public static String[][] readExcel(String sheetName) throws IOException {
		
			XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\DELL\\eclipse-workspace\\Guvi-project\\src\\test\\resources\\testData\\MainprojectData.xlsx");
					 
			XSSFSheet sheet = book.getSheet(sheetName);
					
			int rowcount = sheet.getLastRowNum();
			
			int columncount = sheet.getRow(0).getLastCellNum();
			
			String[][] data = new String[rowcount][columncount];
			
			for(int i =1; i <=rowcount; i++) {
					
		XSSFRow row = sheet.getRow(i);
		
		for(int j =0 ; j<columncount; j++) {
			 
		XSSFCell cell = row .getCell(j);
		
		data[i-1][j] = cell.getStringCellValue();
		
		}
	}

	book.close();
	return data;
	
	}
	
	public String screenshot(String name) throws IOException {
		
		String path = "C:\\Users\\DELL\\eclipse-workspace\\Guvi-project\\snapshot\\"+name+".png";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest); 
		return path;
		
	}
	
}
	