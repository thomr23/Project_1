package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Week1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTest_ELTC35 {

	private WebDriver driver;
	private String baseUrl;
	private Week1POM Week1POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Week1POM = new Week1POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get("http://elearning.upskills.in/");
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		Week1POM.sendUserName("admin");
		Week1POM.sendPassword("admin@123");
		Week1POM.clickLoginBtn();
		Week1POM.clickClasses();
		
		Week1POM.clickClasstoCourses();
		screenShot.captureScreenShot("ELTC35_1");
		
		WebElement selectBox=driver.findElement(By.id("elements_not_in"));
		Select Course= new Select(selectBox);
		Course.selectByVisibleText("QTP (QTP)");
		
		screenShot.captureScreenShot("ELTC35_2");
		
		
		Week1POM.clickarrow(); 
		
		screenShot.captureScreenShot("ELTC35_3");
		Week1POM.Subscribe();
		
		screenShot.captureScreenShot("ELTC35_4");
		
		//String actualmessage=driver.findElement(By.xpath("//div[@class='container']")).getText();
		//String expectedmessage="Update successful";
		
		
		
		//Assert.assertEquals(actualmessage, expectedmessage);
		
		

}
}
