package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'New Quote')]")
	@CacheLookup
	WebElement newQuote;

	

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyHomePage(){
		return newQuote.isDisplayed();
	}
	
	
	
	public NewQuotePage clickOnNewQuoteLink(){
		
		newQuote.click();
		return new NewQuotePage();
		
	}
	
	
	
	
	
	
	

}
