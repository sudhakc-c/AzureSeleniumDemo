package com.BasePages;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage1 {
	

		
		    public WebDriver driver;
		    public WebDriverWait wait;
		 
		    //Constructor
		    public BasePage1 (WebDriver driver){
		        this.driver = driver;
		        wait = new WebDriverWait(driver,30);
		    }
		 
		  //Wait Wrapper Method
		    public void waitVisibility(WebElement ele) {
		    	try {
		        wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		    
		    	}
		    	catch(Exception e){
		    		try {
		    	    Thread.sleep(5000);
		    		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		    	}
		    		
		    	catch(Exception e1) {
		    		System.out.println("exception is thrown"+e.getMessage());
		    	}
		    	}
		    }
		 
		   
		    //Click Method
		    public void click (WebElement ele) throws Exception {
		        waitVisibility(ele);
		        try 
		        {
		        wait.until(ExpectedConditions.elementToBeClickable(ele));
		        ele.click();
		  
		    }
		        catch( Exception e)
		        {
		        	try {
		        	Thread.sleep(5000);
		        	wait.until(ExpectedConditions.elementToBeClickable(ele));
		        	ele.click();
		        }
		        	catch(Exception e1)
		        	{
		        		System.out.println("exception is thrown"+e.getMessage());
		        	}
		    }
		       
		    }
		 
		    //Write Text
		    public void writeText (WebElement ele, String text) {
		        waitVisibility(ele);
		        try {
		        wait.until(ExpectedConditions.elementToBeClickable(ele));
		        ele.sendKeys(text);}
		        catch(Exception e)
		        {
	        		System.out.println("exception is thrown"+e.getMessage());
	        	}
		    }
		 
		    //Read Text
		    public String readText (WebElement ele) {
		        waitVisibility(ele);
		        return ele.getAttribute("value");
		    }

		  //Read Text
		    public WebElement selectValue (WebElement ele) {
		        waitVisibility(ele);
				return ele;
				
		        
		    }
		 
		    
}

