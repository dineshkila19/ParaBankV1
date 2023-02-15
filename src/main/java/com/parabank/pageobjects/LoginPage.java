package com.parabank.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.actiondrivers.Action;
import com.parabank.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//*[@id='loginPanel']/form/div[1]/input")
	WebElement txtUserName;
	
	@FindBy(xpath="//*[@id='loginPanel']/form/div[2]/input")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id='loginPanel']/form/div[3]/input")
	WebElement clickLoginBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void Login(String uname, String pwd) {
		Action.type(txtUserName, uname);
		Action.type(txtPassword, pwd);
		
	}
	
	public AccountPage clickLoginBtn() {
		Action.click(getDriver(), clickLoginBtn);
		Action.fluentWait(getDriver(), clickLoginBtn, 10);
		return new AccountPage();
	}
	
	
	
	
	
	
	
	

}
