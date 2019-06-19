package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
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
	
	@FindBy(linkText="Edit profile")
	private WebElement clickEditProfile;
	
	@FindBy(xpath="//input[@name='password0']")
	private WebElement passwordorig;
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement passwordnew1;
	
	@FindBy(xpath="//input[@id='profile_password2']")
	private WebElement passwordnew2;
	
	@FindBy(id="profile_apply_change")
	private WebElement clickSavesettings;
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCoursecatalog() {
		this.Coursecatalog.click(); 
	}
	public void sendCourse(String Coursesearchbox) {
		this.Coursesearchbox.clear(); 
		this.Coursesearchbox.sendKeys(Coursesearchbox); 
	}
	public void clickSearchBox() {
		this.clickSearchBox.click(); 
	}
	public void clickEditProfile() {
		this.clickEditProfile.click(); 
	}

	public void sendPasswordOrig(String passwordorig) {
		this.passwordorig.clear(); 
		this.passwordorig.sendKeys(passwordorig); 
	}
	public void sendPasswordNew1(String passwordnew1) {
		this.passwordnew1.clear(); 
		this.passwordnew1.sendKeys(passwordnew1); 
	}
	
	public void sendPasswordNew2(String passwordnew2) {
		this.passwordnew2.clear(); 
		this.passwordnew2.sendKeys(passwordnew2); 
	}
	
	public void clickSavesettings() {
		this.clickSavesettings.click(); 
	}

}
