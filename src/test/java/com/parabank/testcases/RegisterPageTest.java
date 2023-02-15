package com.parabank.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parabank.base.BaseClass;
import com.parabank.pageobjects.HomePage;
import com.parabank.pageobjects.IndexPage;
import com.parabank.pageobjects.RegisterPage;

public class RegisterPageTest extends BaseClass{
	IndexPage indexPage;
	RegisterPage registerPage;
	HomePage homePage;
	
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void RegisterTest() throws InterruptedException {
		indexPage=new IndexPage();
		registerPage=indexPage.clickOnRegister();
		registerPage.setFirstName("dinesh");
		Thread.sleep(2000);
		registerPage.setLastName("kila");
		Thread.sleep(2000);
		registerPage.setAddress("Ragigunta");
		Thread.sleep(2000);
		registerPage.setCity("Tirupati");
		Thread.sleep(2000);
		registerPage.setState("Andhra Pradesh");
		Thread.sleep(2000);
		registerPage.setZipcode("517643");
		Thread.sleep(2000);
		registerPage.setPhoneNumber("8899664455");
		Thread.sleep(2000);
		registerPage.setSsn("3527");
		Thread.sleep(2000);
		registerPage.setUserName("dineshkila");
		Thread.sleep(2000);
		registerPage.setPassword("Dinesh@19");
		Thread.sleep(2000);
		registerPage.setConfirmPassword("Dinesh@19");
		Thread.sleep(2000);
		homePage=registerPage.clickOnRegister();
		
	}
	
	
	
	
	
	
	
	
	
	

}
