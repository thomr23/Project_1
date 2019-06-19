package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Week1POM {
	private WebDriver driver; 
	
	public Week1POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Classes")
	private WebElement Classes; 
	
	@FindBy(xpath="//img[@title='Subscribe class to courses']")
	private WebElement clickClasstoCourses;
	
	@FindBy(id="elements_not_in")
	private WebElement selectBox;
	
	@FindBy(xpath="//em[@class='fa fa-arrow-right']")
	private WebElement arrow;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement Subscribe;
	
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
	
	public void clickClasses() {
		this.Classes.click(); 
	}
	
	public void clickClasstoCourses() {
		this.clickClasstoCourses.click(); 
	}
	public void clickarrow() {
		this.arrow.click(); 
	}

	public void Subscribe() {
		this.Subscribe.click(); 
	}
	
}

