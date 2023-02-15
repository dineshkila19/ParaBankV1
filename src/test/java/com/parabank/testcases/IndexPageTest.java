package com.parabank.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parabank.base.BaseClass;
import com.parabank.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyLogo() {
		IndexPage indexPage=new IndexPage();
		boolean result=indexPage.validateParaLogo();
		Assert.assertTrue(result);
	}
	
	
	
	
	
	
	

}
