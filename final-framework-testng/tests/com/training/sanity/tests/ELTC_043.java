package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
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
import com.training.pom.Week2TC1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_043 {

	private WebDriver driver;
	private String baseUrl;
	private Week2TC1 Week2TC1;
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
		Week2TC1 = new Week2TC1(driver,test); 
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
		

		Week2TC1.sendUserName("raji_stu");
		Week2TC1.sendPassword("tdbank@1236");
		Week2TC1.clickLoginBtn();
		screenShot.captureScreenShot("ELTC43_1");
		Week2TC1.clickCoursecatalog();
		screenShot.captureScreenShot("ELTC43_2");
		Week2TC1.sendCourse("Podium_Sel5");
		screenShot.captureScreenShot("ELTC43_3");
		Week2TC1.clickSearchBox();
		screenShot.captureScreenShot("ELTC43_4");
		Week2TC1.clickCourse();
		screenShot.captureScreenShot("ELTC43_5");
		Week2TC1.clickSubscribe();
		screenShot.captureScreenShot("ELTC43_6");
		Week2TC1.clickAssignments();
		screenShot.captureScreenShot("ELTC43_7");
		Week2TC1.clickSampleTest();
		Thread.sleep(3000);
		screenShot.captureScreenShot("ELTC43_8");
		Week2TC1.clickuploadassign();
		screenShot.captureScreenShot("ELTC43_9");
		Week2TC1.clickupload();
		screenShot.captureScreenShot("ELTC43_10");
		Week2TC1.upload1("C:\\RAJI TP\\#1MANIPAL COURSE\\Phase2-Project\\SampleAssign.txt");
		Week2TC1.uploadbutton();
		Thread.sleep(3000);
		screenShot.captureScreenShot("ELTC43_11");
		test.log(LogStatus.PASS, "The file has been added to the list of publications");
	}
		@AfterClass
		public void Afterclass() throws Exception{

		Thread.sleep(3000);
		extent.endTest(test);
		extent.flush();
		extent.close();

		}


	
	
	
	}

