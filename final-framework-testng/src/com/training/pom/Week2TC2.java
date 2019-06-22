package com.training.pom;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class Week2TC2 {
		private WebDriver driver;
		private ExtentTest test;
		
		public Week2TC2(WebDriver driver, ExtentTest test) {
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
		
		@FindBy(xpath="//img[@alt='Selenium_Java5']")
		private WebElement clickCourse;
		
		@FindBy(linkText="Subscribe")
		private WebElement clickSubscribe;
		
		@FindBy(xpath="//img[@title='Forums']")
		private WebElement clickForums;
		
		
		@FindBy(linkText="Group 0003")
		private WebElement clickGroup; 
		
		@FindBy(xpath="//img[@alt='Create thread']")
		private WebElement clickCreateThread;
		
		@FindBy(xpath="//input[@id='thread_post_title']")
		private WebElement sendTitle; 
		
		@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
		private WebElement sendText;
		
		@FindBy(id="thread_SubmitPost")
		private WebElement clickCreateThreadbutton;
		
		@FindBy(xpath="//a[@title='Reply to this message']")
		private WebElement clickReply;
		
		@FindBy(id="thread_SubmitPost")
		private WebElement clickReplybutton;
		
		
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
		public void clickForums(){
			this.clickForums.click();
			test.log(LogStatus.INFO, "Click on Forums");
		
		}
		public void clickGroup(){
			this.clickGroup.click();
			test.log(LogStatus.INFO, "Click on Group");
		
		}
		public void clickCreateThread(){
			this.clickCreateThread.click();
			test.log(LogStatus.INFO, "Click on Create Thread");
		
		}
		public void sendTitle(String sendTitle) {
			this.sendTitle.clear(); 
			this.sendTitle.sendKeys(sendTitle); 
			test.log(LogStatus.INFO, "Enter a Title");
		}
		public void sendText(String sendText) {
			this.sendText.clear(); 
			this.sendText.sendKeys(sendText); 
			test.log(LogStatus.INFO, "Enter Text description");
		}
		
		public void clickCreateThreadbutton(){
			this.clickCreateThreadbutton.click();
			test.log(LogStatus.INFO, "Click on Create Thread button");
		
		}
		
		public void clickReply(){
			this.clickReply.click();
			test.log(LogStatus.INFO, "Click on Create Thread button");
		
		}
		
		
		
		
		
		public void clickReplybutton(){
			this.clickReplybutton.click();
			test.log(LogStatus.INFO, "Click on Reply Button");
		
		}
		
	}
