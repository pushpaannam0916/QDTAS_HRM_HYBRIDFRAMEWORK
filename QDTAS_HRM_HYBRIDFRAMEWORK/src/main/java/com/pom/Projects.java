package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects {

	 
	   @FindBy(name="projectName")
	   private WebElement PROJECTNAME;
	   
	   @FindBy(name="client")
	   private WebElement CLIENT;
	   
	   @FindBy(name="descripition")
	    private WebElement DESCRIPTION;
	   
	   @FindBy(name="teams")
	   private WebElement TEAMS;
	   
	   @FindBy(name="selectmanagers")
	   private WebElement SELECTMANAGERS;
	   
	   @FindBy(name="status")
	   private  WebElement STATUS;
	   
	   @FindBy(name="type")
	   private WebElement TYPE;
	   
	   @FindBy(name="submit")
	   private WebElement submitButton;
	   
	   public Projects(WebDriver driver)
		{
		                                             
			PageFactory.initElements(driver, this);
		}
		
		

	
	   public void  projectName(String projectName)
    {
	        PROJECTNAME.sendKeys( projectName);
    }
  
	   public void client(String client)
	{
		        CLIENT.sendKeys(client);
    }
    
       public void descripition(String descripition)
     {
	       DESCRIPTION.sendKeys(descripition);
     }

    
	  public void teams(String teams)
    {
	        TEAMS.sendKeys(teams);
     }

   
    
	   
    public void selectmanagers(String selectmanagers)
    {
	        SELECTMANAGERS.sendKeys(selectmanagers);
     }

    
    
    public void statustatus(String status)
    {
	        STATUS.sendKeys(status);
     }

   
    
    public void type(String type)
    {
	        TYPE.sendKeys(type);
     }

     
    public void Submit()
    {
	   
 	   submitButton.click();
	   
     }

	//public void clickProjects() {
		// TODO Auto-generated method stub
		
	}

