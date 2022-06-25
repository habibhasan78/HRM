package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryHRM {

	WebDriver driver;

	public PagefactoryHRM(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='txtUsername']")
	private WebElement username;
	@FindBy(how = How.XPATH, using = "//*[@name='txtPassword']")
	private WebElement password;
	@FindBy(how = How.XPATH, using = "//*[@name='Submit']")
	private WebElement loginbtn;
	@FindBy(how = How.ID, using = "welcome")
	private WebElement welcomeScreen;
	
	
	
	

	public WebElement getWelcomeScreen() {
		return welcomeScreen;
	}

	public void setWelcomeScreen(WebElement welcomeScreen) {
		this.welcomeScreen = welcomeScreen;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}
	
	
}
