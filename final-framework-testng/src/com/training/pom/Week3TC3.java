package com.training.pom;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class Week3TC3 {
		private WebDriver driver;
		private ExtentTest test;
		
		public Week3TC3(WebDriver driver, ExtentTest test) {
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
		

		
		@FindBy(linkText="Administration")
		private WebElement clickAdministration;
		
		@FindBy(linkText="Add a user")
		private WebElement clickAdduser;
	
		
		@FindBy(id="firstname")
		private WebElement sendFirstname;
		
		
		@FindBy(id="lastname")
		private WebElement sendLastname;
		@FindBy(id="email")
		private WebElement sendEmail; 
		
		@FindBy(id="username")
		private WebElement sendLogin; 
		
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement sendPassword; 
		
		//@FindBy(xpath="//button[@class='btn dropdown-toggle btn-default']")
		//private WebElement clickLearner; 
		
		@FindBy(xpath="//button[@name='submit']")
		private WebElement clickAdd; 
		

		
			
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
		
		
		public void clickAdministration() {
			this.clickAdministration.click();
			test.log(LogStatus.INFO, "Click on Administartion");
		}
		
		public void clickAdduser() {
			this.clickAdduser.click();
			test.log(LogStatus.INFO, "Click on Add a user");
		}
		
		
		public void sendFirstname(String sendFirstname) {
			this.sendFirstname.clear(); 
			this.sendFirstname.sendKeys(sendFirstname); 
			test.log(LogStatus.INFO, "Enter Firstname");
		}

		
		public void sendLastname(String sendLastname) {
			this.sendLastname.clear(); 
			this.sendLastname.sendKeys(sendLastname); 
			test.log(LogStatus.INFO, "Enter Lastname");
		}

		public void sendEmail(String sendEmail) {
			this.sendEmail.clear(); 
			this.sendEmail.sendKeys(sendEmail); 
			test.log(LogStatus.INFO, "Enter Email");
		}

		public void sendLogin(String sendLogin) {
			this.sendLogin.clear(); 
			this.sendLogin.sendKeys(sendLogin); 
			test.log(LogStatus.INFO, "Enter Login");
		}

		
		public void sendPassword1(String sendPassword) {
			this.sendPassword.clear(); 
			this.sendPassword.sendKeys(sendPassword); 
			test.log(LogStatus.INFO, "Enter password for new user");
		}

	
		
		
		//public void clickLearner(){
			//this.clickLearner.click();
			//test.log(LogStatus.INFO, "Click on Save");
		
		//}
		public void clickAdd(){
			this.clickAdd.click();
			test.log(LogStatus.INFO, "Click on Add");
		
		}
		
		
	}
		
		
		
