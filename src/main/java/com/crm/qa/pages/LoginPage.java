package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//input[@id='username-inputEl']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password-inputEl']")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='innerBody']/div[@id='bodyContent']/form[@id='mainForm']/div[@id='wrapper']/div[@id='formContent']/div[@id='main']/div[@id='Logon']/div[@id='logonFields']/div[3]/div[1]/a[1]")
	WebElement loginBtn;
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}
