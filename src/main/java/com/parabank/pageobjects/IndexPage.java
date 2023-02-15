package com.parabank.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.actiondrivers.Action;
import com.parabank.base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath="//*[@id=\"topPanel\"]/a[2]/img")
	WebElement paraLogo;
	
	@FindBy(xpath="//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")
	WebElement services;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/p[2]/a")
	WebElement btnRegister;
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/h2")
	WebElement customerLogin;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateParaLogo() {
		return Action.isDisplayed(getDriver(), paraLogo);
	}
	
	public boolean validateCustomerLogin() {
		return Action.isDisplayed(getDriver(), customerLogin);
	}
	
	public RegisterPage clickOnRegister() {
		Action.click(getDriver(), btnRegister);
		return new RegisterPage();
	}
	
	
	
	
	
	
}
