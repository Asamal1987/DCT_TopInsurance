/*
 * @author Naveen Khunteta
 * 
 */

package com.crm.qa.testcases;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.NewQuotePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class NewQuotePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	NewQuotePage newQuotePage;
	
	String sheetName = "contacts";
	
	   
	public NewQuotePageTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testUtil = new TestUtil();
		newQuotePage = new NewQuotePage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//TestUtil.runTimeInfo("error", "login successful");
		//testUtil.switchToFrame();
		newQuotePage = homePage.clickOnNewQuoteLink();
	}
	
	//@Test(priority=1)
	//public void verifyProductPageLabel(){
	//	Assert.assertTrue(newQuotePage.verifyProductLabel(), "contacts label is missing on the page");
	//}
	
	@Test(priority=2)
	public void selectSingleProductTest() throws InterruptedException{
		newQuotePage.createNewQuote("Carrier  BusinessOwners  Pages   US   (11.0.0.0)");
		Thread.sleep(4000);
	}
	
	
	

	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
