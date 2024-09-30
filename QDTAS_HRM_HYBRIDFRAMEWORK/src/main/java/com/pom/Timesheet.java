package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Timesheet {

	   @FindBy(name="startTime")
	   private WebElement STARTTIME;
	   
	   @FindBy(name="endTime")
	    private WebElement ENDTIME;
	   
	   @FindBy(name="date")
	   private  WebElement DATE;
	   
	   
	   @FindBy(name="project")
	   private WebElement PROJECT;
	   
	   
	   @FindBy(name="note")
	    private  WebElement NOTE;
	   
	   @FindBy(name="reset")
	   private WebElement RESET;
	   
	   @FindBy(name="submit")
	   private WebElement submitButton;
	   
	   public Timesheet (WebDriver driver)
		{
		                                             
			PageFactory.initElements(driver, this);
		}



public void startTime(String startTime)
{
	STARTTIME.sendKeys(startTime);
}

public void endTime(String endTime)
{
	ENDTIME.sendKeys(endTime);
}

public void date(String date)
{
	DATE.sendKeys(date);
}

  public void project(String project)
  {
  	PROJECT.sendKeys(project);
  }

   public void note(String note)
   {
   	NOTE.sendKeys(note);
   }
 
    public void reset()
    {
	   
 	  RESET.click();
	   
}
    
    public void Submit()
    {
	   
 	   submitButton.click();
	   
     }

	   
}

