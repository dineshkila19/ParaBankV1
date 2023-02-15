package com.parabank.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parabank.base.BaseClass;
import com.parabank.pageobjects.AccountPage;
import com.parabank.pageobjects.IndexPage;
import com.parabank.pageobjects.LoginPage;
import com.parabank.pageobjects.RegisterPage;

public class LoginPageTest extends BaseClass {
	IndexPage indexPage;
	RegisterPage registerPage;
	LoginPage loginPage;
	AccountPage accountPage;
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void LoginTest() {
		indexPage=new IndexPage();
		loginPage.Login("dineshkila", "Dinesh@19");
		loginPage.clickLoginBtn();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
