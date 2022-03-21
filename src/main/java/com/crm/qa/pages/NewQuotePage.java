package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewQuotePage extends TestBase {

	@FindBy(xpath = "//input[@id='cb_3']")
	WebElement product;
	
		
	//@FindBy(xpath = "//button[@title='Start' and @actionref='StartQuote']")
	//WebElement startBtn;
	
	
	
	// Initializing the Page Objects:
	public NewQuotePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyProductLabel(){
		return product.isDisplayed();
	}
	
	
	
	
	
	public void createNewQuote(String productType){
		//Select select = new Select(product);
		//select.selectByVisibleText(productType);
		product.sendKeys(productType);
		WebElement productSelector=driver.findElement(By.xpath( "//a[contains(text(),' (11.0.0.0)')]"));
		productSelector.click();
		WebElement startBtn=driver.findElement(By.xpath( "//button[@title='Start' and @actionref='StartQuote']"));
		
		startBtn.click();
		
	}
	
	
	

}
