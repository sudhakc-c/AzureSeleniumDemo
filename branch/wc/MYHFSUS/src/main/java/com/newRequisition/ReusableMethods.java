package com.newRequisition;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePages.BasePage1;
import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;

public class ReusableMethods extends BasePage1{

	public WebDriver driver;
	PageFactoryClass pg;
	ConfigExcel1 exceldata = new ConfigExcel1();
	public WebDriverWait wait;

	// Specify the file path of the screenshots folder here.
	//path for job posting folder
	public String FilePath1 = "C:\\Users\\CSWARNES\\Desktop\\MYHFSUS\\Screenshots\\CareerSite/";
	//path for new application folder
	public String FilePath2 = "C:\\Users\\CSWARNES\\Desktop\\MYHFSUS\\Screenshots\\NewApplicationProcess/";
	//path for Onboarding folder
	public String FilePath3 = "C:\\Users\\CSWARNES\\Desktop\\MYHFSUS\\Screenshots\\OnboardingProcess/";

	//Constructor
		public ReusableMethods(WebDriver driver) {
			super(driver);
			this.driver = driver;
			wait = new WebDriverWait(driver,30);
		}

	// To capture a screenshot for SFLogin Class
	public void screenshot(String filename) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(FilePath1 + filename + ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	// To capture a screenshot for New Application Class
		public void screenshot1(String filename) throws IOException {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			// Call getScreenshotAs method to create image file
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			// Move image file to new destination
			File DestFile = new File(FilePath2 + filename + ".png");
			// Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
		}
		// To capture a screenshot for Onboarding classes
				public void screenshot2(String filename) throws IOException {
					TakesScreenshot scrShot = ((TakesScreenshot) driver);
					// Call getScreenshotAs method to create image file
					File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
					// Move image file to new destination
					File DestFile = new File(FilePath3 + filename + ".png");
					// Copy file at destination
					FileUtils.copyFile(SrcFile, DestFile);
				}

	// Scroll Down Method
	public void Scroll_Down() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");

	}

	// Scroll Up Method
	public void Scroll_Up() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(250,0)");
	}

	public String time() {

		Date date = new Date();
		String strDateFormat = "_hhmm";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(date);
		return formattedDate;
	}

	public Formatter Randmonth() {
		Formatter Mon = new Formatter();
		Calendar cal = Calendar.getInstance();
		Mon = new Formatter();
		Mon.format("%tb", cal);
		return Mon;
	}
	 //Method for Thread.sleep
		public void TimeLimit(int time) throws InterruptedException {

			Thread.sleep(time * 1000);
		}   

	// Login
	public void sfLogin() throws Exception {
		// create instance for the PageFactoryClass(all the elements are located here)
		pg = new PageFactoryClass(driver);
		// Enter Username
		pg.username.sendKeys(exceldata.getRowAndColumn(0, 2, 1));
		TimeLimit(3);
		// Enter Password
		pg.password.sendKeys(exceldata.getRowAndColumn(0, 3, 1));
		TimeLimit(3);
		// Click on Login Button
		pg.login.click();
		TimeLimit(10);
		screenshot("HomePage");
		TimeLimit(5);
	}

	// Set Proxy for Sourcer/SM who does new application to screening
	// 
	public void setProxySM() throws Exception {
		TimeLimit(10);
		pg = new PageFactoryClass(driver);
		// Navigate to Account Menu
		
		click(pg.Acc_Navigation);
		
		// Give Proxy
		click(pg.Proxy_Now);
	
		// screen_Shot("Proxy");
		// Enter Proxy as SM
		writeText(pg.Input, exceldata.getRowAndColumn(1, 1, 1));
		click(pg.Name);

	
		
		
		// Click on OK
		click(pg.OK);
		
		screenshot("ProxyManageSM");
		TimeLimit(5);
	}

	// Set Proxy for RM/Recruiter who does screening to offer 13 and again onboarding
	public void setProxyRM() throws Exception {
		// Navigate to Account Menu
		pg= new PageFactoryClass(driver);
		click(pg.account_change);
		
		// Give Proxy
		click(pg.Proxy);
		
		// Enter Proxy as Recruiter
		writeText(pg.Input,exceldata.getRowAndColumn(1, 0, 1));
		
		// Click on name
		click(pg.Name);
		
		// Click on OK
		click(pg.OK);
		
		screenshot("ProxyRecruitingManager");
		TimeLimit(5);
	}
	//Set Proxy for Offer Manager who does offer 15 to offer 16
	public void setProxyOfferManager() throws Exception {
		// Proxy as Offer Manager
		pg= new PageFactoryClass(driver);

		click(pg.account_change);
					
		click(pg.Proxy);

	
		writeText(pg.Input,exceldata.getRowAndColumn(1, 2, 1));
		

		click(pg.Offerselect);
		

		click(pg.OK);
		screenshot("ProxyOfferManager");
		TimeLimit(5);
		
	}

	public void hometoSelectJobReq() throws Exception {

		pg= new PageFactoryClass(driver);
		// Retreiving the requisition ID here
		String Reqid = exceldata.getRowAndColumn(2, 1, 3);		
		// Click on Home
		click(pg.Home);
		
		// Click on Recruiting
		click(pg.Recruiting);
		
		// Click on Select Job Req
		click(pg.SelectJobreq);
		
		// Select all Job req
		waitVisibility(pg.filterJobReq);
		Select jobReq = new Select(pg.filterJobReq);
		TimeLimit(4);
		jobReq.selectByVisibleText(exceldata.getRowAndColumn(1, 21, 1));
		TimeLimit(5);
		// Click on Filter Options
		click(pg.filterOptions);
		
		// Click on clear Filter
		click(pg.clearFilter);
	
		
		// Enter Job Req ID
		writeText(pg.job_req_input,Reqid);
		
		// Click on Update Screen
		click(pg.update_Screen);
		
		// Click on View Job
		click(pg.view_job);
		
		// Click on Job
		click(pg.view_job_click);
		

	}

	// for generating random numbers
		public String generateRandomNumber(int length) {
			return RandomStringUtils.randomNumeric(length);
		}

		public void Waitforelementclick(WebElement locator) {
			Waitforelementvisibility(locator);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
			ele.click();
		}

		public void Waitforelementvisibility(WebElement locator) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement ele = wait.until(ExpectedConditions.visibilityOf(locator));
			
		}

		public void Waitforelementvisible(WebElement locator) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement ele = wait.until(ExpectedConditions.visibilityOf(locator));
			ele.click();
		}
		public void Scroll_DownSc() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,500)");

		}
		// Scroll Up
		public void Scroll_UpSc() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(500,0)");
		}

		public void filterByEmail() throws Exception {
			
			pg= new PageFactoryClass(driver);
			
			click(pg.filterEmailID);
			TimeLimit(15);

			writeText(pg.candidateEmailID,exceldata.getRowAndColumn(2, 1, 5));
			TimeLimit(10);

			click(pg.applyEmail);

			TimeLimit(15);

		}
		// for numbers
		public String generateRandom(int length) {
			return RandomStringUtils.randomNumeric(length);
		}
		

		public void Waitforelementclickable(WebElement locator) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(locator));
			ele.click();
		}
		
		
		
		
		
		 
}
