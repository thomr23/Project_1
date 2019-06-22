package com.training.sanity.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
import com.training.pom.Week2TC1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_044 {

	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.Week2TC2 Week2TC2;
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
		Week2TC2 = new com.training.pom.Week2TC2(driver,test); 
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
		

		Week2TC2.sendUserName("raji_stu");
		Week2TC2.sendPassword("tdbank@1236");
		Week2TC2.clickLoginBtn();
		screenShot.captureScreenShot("ELTC44_1");
		Week2TC2.clickCoursecatalog();
		screenShot.captureScreenShot("ELTC44_2");
		Week2TC2.sendCourse("Selenium_Java5");
		screenShot.captureScreenShot("ELTC44_3");
		Week2TC2.clickSearchBox();
		screenShot.captureScreenShot("ELTC44_4");
		Week2TC2.clickCourse();
		screenShot.captureScreenShot("ELTC44_5");
		Week2TC2.clickSubscribe();
		screenShot.captureScreenShot("ELTC44_6");
		Week2TC2.clickForums();
		Week2TC2.clickGroup();
		Week2TC2.clickCreateThread();
		Week2TC2.sendTitle("SampleTest2");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frame1);
		Week2TC2.sendText("Description for SampleTest2");
		driver.switchTo().defaultContent();
		Week2TC2.clickCreateThreadbutton();
		Week2TC2.clickReply();
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(frame2);
		Week2TC2.sendText("Description Reply for SampleTest2");
		driver.switchTo().defaultContent();
		Week2TC2.clickReplybutton();
		test.log(LogStatus.PASS, "The reply has been added");
	
	}
		@AfterClass
		public void Afterclass() throws Exception{

		Thread.sleep(3000);
		extent.endTest(test);
		extent.flush();
		extent.close();

		}


	
	
	
	}


