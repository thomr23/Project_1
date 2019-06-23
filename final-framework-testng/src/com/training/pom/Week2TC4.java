package com.training.pom;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class Week2TC4 {
		private WebDriver driver;
		private ExtentTest test;
		
		public Week2TC4(WebDriver driver, ExtentTest test) {
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
		

		
		@FindBy(linkText="Selenium_Java9")
		private WebElement clickCourse;
		
	
		
		@FindBy(xpath="//img[@alt='Project1sample']")
		private WebElement clickProjectIcon;
		
		
		@FindBy(linkText="Role1")
		private WebElement clickRole; 
		
		@FindBy(linkText="Java1")
		private WebElement clickJava1; 
		
		@FindBy(xpath="//input[@id='add_post_title']")
		private WebElement sendTitle; 
		
		@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
		private WebElement sendTextDescr;
		
		@FindBy(xpath="//button[@id='add_post_save']")
		private WebElement clickSave;
		

		
			
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
		
		
		public void clickCourse() {
			this.clickCourse.click(); 
			test.log(LogStatus.INFO, "Click on the selected course");
		
		}

		
		public void clickProjectIcon(){
			this.clickProjectIcon.click();
			test.log(LogStatus.INFO, "Click on Project");
		
		}
		public void clickRole(){
			this.clickRole.click();
			test.log(LogStatus.INFO, "Click on My Task");
		
		}
		public void clickJava1(){
			this.clickJava1.click();
			test.log(LogStatus.INFO, "Click on Link of the Task");
		
		}
		
		public void sendTitle(String sendTitle) {
			this.sendTitle.clear(); 
			this.sendTitle.sendKeys(sendTitle); 
			test.log(LogStatus.INFO, "Enter a Title");
		}
	
		
		public void sendTextDescr(String sendTextDescr ) {
			this.sendTextDescr.clear(); 
			this.sendTextDescr.sendKeys(sendTextDescr); 
			test.log(LogStatus.INFO, "Enter a Description");
		}
		public void clickSave(){
			this.clickSave.click();
			test.log(LogStatus.INFO, "Click on Save");
		
		}
		
		
	}
		
		
		
