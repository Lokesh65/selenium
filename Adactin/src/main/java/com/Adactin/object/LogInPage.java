package com.Adactin.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.BaseClass.BaseClass;

public class LogInPage extends BaseClass {
	
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login")
	private WebElement LogInbtn;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogInbtn() {
		return LogInbtn;
	}
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	
}
}