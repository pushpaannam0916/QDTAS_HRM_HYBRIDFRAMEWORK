package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Employee_Details {
	   
		@FindBy(name="UserName")
		private WebElement USERNAME;
		
		@FindBy(name="submit")
		private WebElement submitButton;

		public Employee_Details(WebDriver driver)
		{
		                                             
			PageFactory.initElements(driver, this);
		}

		
		
		public  void UserName(String UserName)
	    {
		        USERNAME.sendKeys(UserName);
	    }
	  
	 
	  public void clicksubmit()
	  {
	  
	   submitButton.click();
	  
	  }
}
