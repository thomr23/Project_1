package com.training.pom;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class Week2TC3 {
		private WebDriver driver;
		private ExtentTest test;
		
		public Week2TC3(WebDriver driver, ExtentTest test) {
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
		
		//@FindBy(linkText="Course catalog")
		//private WebElement Coursecatalog; 
		
		//@FindBy(xpath="//input[@name='search_term']")
		//private WebElement Coursesearchbox;
		
		//@FindBy(xpath="//button[@class='btn btn-default']")
		//private WebElement clickSearchBox;
		
		@FindBy(linkText="Selenium_Java9")
		private WebElement clickCourse;
		
		//@FindBy(linkText="Subscribe")
		//private WebElement clickSubscribe;
		
		@FindBy(xpath="//img[@alt='Groups']")
		private WebElement clickGroupsIcon;
		
		
		@FindBy(linkText="Group 0003")
		private WebElement clickGroup; 
		
		@FindBy(xpath="//img[@alt='Chat']")
		private WebElement clickChat;
		
		@FindBy(xpath="//button[@title='Leave a message']")
		private WebElement clickLeaveMessage; 
		
		@FindBy(xpath="//div[@class='emoji-wysiwyg-editor']")
		private WebElement sendMessage;
		
		@FindBy(xpath="//button[@id='chat-send-message']")
		private WebElement clickSendMessage;
		
		
		
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
		
		/*public void clickCoursecatalog() {
			this.Coursecatalog.click(); 
			test.log(LogStatus.INFO, "Click on Course Catalog");
		}
		
		public void sendCourse(String Coursesearchbox) {
			this.Coursesearchbox.clear(); 
			this.Coursesearchbox.sendKeys(Coursesearchbox); 
			test.log(LogStatus.INFO, "Enter course name in course SearchBox");
		}*/
		public void clickCourse() {
			this.clickCourse.click(); 
			test.log(LogStatus.INFO, "Click on the selected course");
		
		}

		/*public void clickSearchBox() {
			this.clickSearchBox.click();
			test.log(LogStatus.INFO, "Click on the searchbox");
		
		}
	
		public void clickSubscribe() {
			this.clickSubscribe.click();
			test.log(LogStatus.INFO, "Click on the subscribebutton");
		
		}*/
		public void clickGroupsIcon(){
			this.clickGroupsIcon.click();
			test.log(LogStatus.INFO, "Click on Groups");
		
		}
		public void clickGroup(){
			this.clickGroup.click();
			test.log(LogStatus.INFO, "Click on Group");
		
		}
		public void clickChat(){
			this.clickChat.click();
			test.log(LogStatus.INFO, "Click on Chat");
		
		}
		public void clickLeaveMessage(){
			this.clickLeaveMessage.click();
			test.log(LogStatus.INFO, "Click on Leave Message");
		
		}
		public void sendMessage(String sendMessage) {
			this.sendMessage.clear(); 
			this.sendMessage.sendKeys(sendMessage); 
			test.log(LogStatus.INFO, "Enter a Message");
		}
	
		
		public void clickSendMessage(){
			this.clickSendMessage.click();
			test.log(LogStatus.INFO, "Click on Send Message Button");
		
		}
		
	}
		
		
		