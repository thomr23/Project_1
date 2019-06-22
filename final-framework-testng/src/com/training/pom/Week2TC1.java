package com.training.pom;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class Week2TC1 {
		private WebDriver driver;
		private ExtentTest test;
		
		public Week2TC1(WebDriver driver, ExtentTest test) {
			this.driver = driver; 
			this.test = test;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="login")
		private WebElement userName; 
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="form-login_submitAuth")
		private WebElement loginBtn; 
		
		@FindBy(linkText="Course catalog")
		private WebElement Coursecatalog; 
		
		@FindBy(xpath="//input[@name='search_term']")
		private WebElement Coursesearchbox;
		
		@FindBy(xpath="//button[@class='btn btn-default']")
		private WebElement clickSearchBox;
		
		@FindBy(xpath="//img[@alt='Podium_Sel5']")
		private WebElement clickCourse;
		
		@FindBy(linkText="Subscribe")
		private WebElement clickSubscribe;
		
		@FindBy(xpath="//img[@title='Assignments']")
		private WebElement clickAssignments;
		
		
		@FindBy(linkText="Sample_Test1")
		private WebElement clickSampleTest; 
		
		@FindBy(xpath="//a[@class='btn-toolbar']")
		private WebElement clickuploadassign;
		
		@FindBy(linkText="Upload (Simple)")
		private WebElement clickupload; 
		
		@FindBy(id="form-work_file")
		private WebElement upload;
		
		@FindBy(id="form-work_file")
		private WebElement upload1;
		
		@FindBy(id="form-work_submitWork")
		private WebElement uploadbutton;
		
		
		
		public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
			test.log(LogStatus.INFO, "Enter Username");
		}
		
		public void sendPassword(String password) {
			this.password.clear(); 
			this.password.sendKeys(password); 
			test.log(LogStatus.INFO, "Enter Password");
		}
		
		public void clickLoginBtn() {
			this.loginBtn.click();
			test.log(LogStatus.INFO, "Click on Login Button");
		}
		
		public void clickCoursecatalog() {
			this.Coursecatalog.click(); 
			test.log(LogStatus.INFO, "Click on Course Catalog");
		}
		
		public void sendCourse(String Coursesearchbox) {
			this.Coursesearchbox.clear(); 
			this.Coursesearchbox.sendKeys(Coursesearchbox); 
			test.log(LogStatus.INFO, "Enter course name in course SearchBox");
		}
		public void clickCourse() {
			this.clickCourse.click(); 
			test.log(LogStatus.INFO, "Click on the selected course");
		
		}

		public void clickSearchBox() {
			this.clickSearchBox.click();
			test.log(LogStatus.INFO, "Click on the searchbox");
		
		}
	
		public void clickSubscribe() {
			this.clickSubscribe.click();
			test.log(LogStatus.INFO, "Click on the subscribebutton");
		
		}
		public void clickAssignments(){
			this.clickAssignments.click();
			test.log(LogStatus.INFO, "Click on the Assignments");
		
		}
		public void clickSampleTest(){
			this.clickSampleTest.click();
			//test.log(LogStatus.INFO, "Click on SampleTest");
		
		}
		
		public void clickuploadassign(){
			this.clickuploadassign.click(); 
			test.log(LogStatus.INFO, "Click on Upload1");
		
		}
		
		
		public void clickupload(){
			this.clickupload.click(); 
			test.log(LogStatus.INFO, "Click on Upload2");
		
		}
		
		public void upload(){
			this.upload.click(); 
			
			test.log(LogStatus.INFO, "Click on Upload2");
		}
		public void upload1(String upload) {
			this.upload1.sendKeys(upload); 
			test.log(LogStatus.INFO, "Select assignment from path given");
		}
		
		public void uploadbutton(){
			this.uploadbutton.click(); 
			test.log(LogStatus.INFO, "Click on final upload button");
		
		}
		
	}
