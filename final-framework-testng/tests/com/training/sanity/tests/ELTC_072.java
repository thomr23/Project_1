package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
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
import com.training.pom.Week3TC3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_072{

	private WebDriver driver;
	private String baseUrl;
	private Week3TC3 Week3TC3;
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

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void setUp() throws Exception {
		
		extent = report.getInstance();
		test = extent.startTest("AssignmentUpload");

		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Week3TC3 = new Week3TC3(driver,test); 
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
		

		Week3TC3.sendUserName("admin");
		Week3TC3.sendPassword("admin@123");
		Week3TC3.clickLoginBtn();
		screenShot.captureScreenShot("ELTC72_1");
		Week3TC3.clickAdministration();
		screenShot.captureScreenShot("ELTC72_2");
		Week3TC3.clickAdduser();
		screenShot.captureScreenShot("ELTC72_3");
		Week3TC3.sendFirstname("Test");
		screenShot.captureScreenShot("ELTC72_4");
		Week3TC3.sendLastname("Name");
		screenShot.captureScreenShot("ELTC72_5");
		Week3TC3.sendEmail("rajithomas16@gmail.com");
		screenShot.captureScreenShot("ELTC72_6");
		Week3TC3.sendLogin("Test12");
		screenShot.captureScreenShot("ELTC72_7");
		Week3TC3.sendPassword1("Pass");
		Thread.sleep(3000);
		screenShot.captureScreenShot("ELTC72_8");
		Select profile=new Select(driver.findElement(By.xpath("//select[@class='btn dropdown-toggle btn-default']")));
		profile.selectByVisibleText("Learner");
		screenShot.captureScreenShot("ELTC72_9");
		Week3TC3.clickAdd();
		screenShot.captureScreenShot("ELTC72_10");
		//test.log(LogStatus.PASS, "The user has been added: Test12");
	
	}
		@AfterClass
		public void Afterclass() throws Exception{

		Thread.sleep(3000);
		extent.endTest(test);
		extent.flush();
		extent.close();

		}


	
	
	
	}

