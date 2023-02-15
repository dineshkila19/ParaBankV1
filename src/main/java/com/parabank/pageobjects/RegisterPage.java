package com.parabank.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabank.actiondrivers.Action;
import com.parabank.base.BaseClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='loginPanel']/p[2]/a")
	WebElement btnRegister;
	
	@FindBy(id="customer.firstName")
	WebElement txtFirstName;
	
	@FindBy(name="customer.lastName")
	WebElement txtLastName;
	
	@FindBy(id="customer.address.street")
	WebElement txtAddress;
	
	@FindBy(name="customer.address.city")
	WebElement txtCity;
	
	@FindBy(id="customer.address.state")
	WebElement txtState;
	
	@FindBy(id="customer.address.zipCode")
	WebElement txtZipcode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement txtxPhoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement txtSsn;
	
	@FindBy(id="customer.username")
	WebElement txtUserName;
	
	@FindBy(name="customer.password")
	WebElement txtPassword;
	
	@FindBy(id="repeatedPassword")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	WebElement clickRegister;
	
	
	public RegisterPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void setFirstName(String ufirstname) {
		Action.type(txtFirstName, ufirstname);
	}
	public void setLastName(String ulastname) {
		Action.type(txtLastName, ulastname);
	}
	public void setAddress(String uAddress) {
		Action.type(txtAddress, uAddress);
	}
	public void setCity(String ucity) {
		Action.type(txtCity, ucity);
	}
	public void setState(String usate) {
		Action.type(txtState, usate); 
	}
	public void setZipcode(String uzipcode) {
		Action.type(txtZipcode, uzipcode);
	}
	public void setPhoneNumber(String uphno) {
		Action.type(txtxPhoneNumber, uphno);
	}
	public void setSsn(String ussn) {
		Action.type(txtSsn, ussn);
	}
	public void setUserName(String uusername) {
		Action.type(txtUserName, uusername);
	}
	public void setPassword(String upwd) {
		Action.type(txtPassword, upwd);
	}
	public void setConfirmPassword(String ucpwd) {
		Action.type(txtConfirmPassword, ucpwd);
	}
	public LoginPage clickOnRegister() {
		Action.click(getDriver(), btnRegister);
		return new LoginPage();
	}
	
}
