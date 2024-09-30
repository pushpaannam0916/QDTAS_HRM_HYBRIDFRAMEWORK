package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Department {
	
	@FindBy(name="deptName")
	private  WebElement DEPTNAME;
	
	@FindBy(name="submit")
	private WebElement submitButton;

	
	public Department(WebDriver driver)
	{
	                                             
		PageFactory.initElements(driver, this);
	}
	
	
	public  void depName(String deptName)
    {
	        DEPTNAME.sendKeys(deptName);
    }
  
 
  public void clicksubmit()
  {
  
	   submitButton.click();
  
  }


}
