package com.BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	    public WebDriver driver;
	    public WebDriverWait wait;
	 
	    //Constructor
	    public BasePage (WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,30);
	    }
	 
	    //Wait Wrapper Method
	    public void waitVisibility(By clickClear) {
	        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(clickClear));
	    }
	 
	    //Click Method
	    public void click (By clickClear) {
	        waitVisibility(clickClear);
	        driver.findElement(clickClear).click();
	    }
	 
	    //Write Text
	    public void writeText (By elementBy, String text) {
	        waitVisibility(elementBy);
	        driver.findElement(elementBy).sendKeys(text);
	    }
	 
	    //Read Text
	    public String readText (By elementBy) {
	        waitVisibility(elementBy);
	        return driver.findElement(elementBy).getAttribute("value");
	    }
	 
	    //Read Text
	    public void selectValue (By elementBy) {
	        waitVisibility(elementBy);
	        driver.findElement(elementBy);
	    }
	 
	   
	}
