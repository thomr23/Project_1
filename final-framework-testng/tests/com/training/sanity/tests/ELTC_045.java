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

public class ELTC_045 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.Week2TC3 Week2TC3;
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
		Week2TC3 = new com.training.pom.Week2TC3(driver,test); 
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
		

		Week2TC3.sendUserName("raji_stu");
		Week2TC3.sendPassword("tdbank@1236");
		Week2TC3.clickLoginBtn();
		screenShot.captureScreenShot("ELTC45_1");
		//Week2TC3.clickCoursecatalog();
		
		Week2TC3.clickCourse();
		screenShot.captureScreenShot("ELTC45_2");
		
		//Week2TC3.clickSearchBox();
		
		//Week2TC3.clickCourse();
		
		//Week2TC3.clickSubscribe();
		
		Week2TC3.clickGroupsIcon();
		screenShot.captureScreenShot("ELTC45_3");
		Week2TC3.clickGroup();
		screenShot.captureScreenShot("ELTC45_4");
		Week2TC3.clickChat();
		screenShot.captureScreenShot("ELTC45_5");
		
		//String handle= driver.getWindowHandle();
		 
        //System.out.println(handle);

        // Click on the Button "New Message Window"

        //driver.findElement(By.name("New Message Window")).click();

        // Store and Print the name of all the windows open	              

        Set handles = driver.getWindowHandles();

        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

         System.out.println(handle1);

         driver.switchTo().window(handle1);
         driver.manage().window().maximize();

        }

		
		Week2TC3.clickLeaveMessage();
		screenShot.captureScreenShot("ELTC45_6");
		Week2TC3.sendMessage("Hi");
		screenShot.captureScreenShot("ELTC45_7");
		
		Week2TC3.clickSendMessage();
		screenShot.captureScreenShot("ELTC45_8");
		
		//test.log(LogStatus.PASS, "The reply has been added");
	
	}
		@AfterClass
		public void Afterclass() throws Exception{

		Thread.sleep(3000);
		extent.endTest(test);
		extent.flush();
		extent.close();

		}


	
	
	
	}


