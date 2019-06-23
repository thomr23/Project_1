package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.training.generics.GenericExtendReports;
import com.training.generics.ScreenShot;
import com.training.pom.Week2TC3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_046 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.Week2TC4 Week2TC4;
	private static Properties properties;
	private ScreenShot screenShot;
	private ExtentReports extent;
	private ExtentTest test;
	private GenericExtendReports report;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		
	}

	@BeforeMethod
	public void setUp() throws Exception {
		
		extent = report.getInstance();
		test = extent.startTest("AssignmentUpload");

		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Week2TC4 = new com.training.pom.Week2TC4(driver,test); 
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
	public void validLoginTest() throws InterruptedException {
		

		Week2TC4.sendUserName("raji_teach");
		Week2TC4.sendPassword("tdbank@123");
		Week2TC4.clickLoginBtn();
		screenShot.captureScreenShot("ELTC46_1");
		
		Week2TC4.clickCourse();
		screenShot.captureScreenShot("ELTC46_2");
		Week2TC4.clickProjectIcon();
		screenShot.captureScreenShot("ELTC46_2");
		Week2TC4.clickRole();
		screenShot.captureScreenShot("ELTC46_3");
		Week2TC4.clickJava1();
		screenShot.captureScreenShot("ELTC46_4");
		Week2TC4.sendTitle("Title for Task");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frame1);
		Week2TC4.sendTextDescr("Decription for Task");
		screenShot.captureScreenShot("ELTC46_5");
		driver.switchTo().defaultContent();
		Week2TC4.clickSave();
		screenShot.captureScreenShot("ELTC46_6");
		test.log(LogStatus.PASS, "You comment has been added");
		screenShot.captureScreenShot("ELTC46_7");
		
		
	}
		
}	