package com.newRequisition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.BasePages.BasePage1;
import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;

public class PHVStep  extends BasePage1{
	public WebDriver driver;
	PageFactoryClass pg;
	ReusableMethods re;
	ConfigExcel1 exceldata = new ConfigExcel1();

	public PHVStep(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void TimeLimit(int time) throws InterruptedException {

		Thread.sleep(time * 1000);

	}

	public void onboarding() throws Exception {
		// Specify Path for file
		String path = exceldata.getRowAndColumn(0, 11, 1);
		pg = new PageFactoryClass(driver);
		re = new ReusableMethods(driver);

		TimeLimit(15);
		// Set Proxy as Recruiter
		re.setProxyRM();
		TimeLimit(10);

		// clicking on home Button
		click(pg.Home);
		TimeLimit(2);

		// Clicking on Onboarding
		click(pg.Onboarding);
		TimeLimit(10);
		
		re.screenshot2("OnboardingStep");

		// To switch to a outer frame in a web page
		// By using ID/Name
		driver.switchTo().frame("iframeForKMS");
		TimeLimit(5);
		// To switch to a inner frame
		driver.switchTo().frame("ctl00_ContentPlaceHolder1_WQ");
		TimeLimit(6);
		// Now Perform operations on web elements
		// Click on International Onboarding
		click(pg.intOnb);
		TimeLimit(6);

		// Search By Candidate Id
		Select SearchBy = new Select(pg.Seacrh_By);
		SearchBy.selectByVisibleText("Candidate Id");
		TimeLimit(5);

		// Candidate ID used to Filter
		writeText(pg.Candidate_ID_ONB,exceldata.getRowAndColumn(2, 1, 4));
		TimeLimit(5);

		// Click All Activities
		click(pg.All_Activities_Button);
		TimeLimit(2);

		// Submit
		click(pg.Submit);
		TimeLimit(5);

		re.screenshot2("1");
		// Start PHP Step
		click(pg.PHP_Step);
		TimeLimit(8);
		
		// Switch to outer frame in another page
		driver.switchTo().frame("iframeForKMS");
		TimeLimit(5);
		// Switch to Inner Frame
		driver.switchTo().frame("frmContent");
		TimeLimit(5);
		//Select Gender

		Select gender = new Select(pg.genderOnb);
		TimeLimit(5);
		gender.selectByVisibleText(exceldata.getRowAndColumn(1, 23, 1));
		TimeLimit(4);
		
		//Give date of birth
		writeText(pg.DOBONB,exceldata.getRowAndColumn(1, 24, 1));
		
		//Select Marital status
		Select MaritalStatus = new Select(pg.Maritalstatus);
		TimeLimit(5);
		MaritalStatus.selectByVisibleText(exceldata.getRowAndColumn(1, 25, 1));
		TimeLimit(4);
	

		

		
		
		

		// Finish
		click(pg.clickNextt);
		TimeLimit(8);
		
		re.screenshot2("3");
		
		
		
		
		TimeLimit(6);
		
		re.screenshot2("2");
		TimeLimit(4);
		// Finish
		click(pg.Finish01);
		// add screenshot
		
		
		TimeLimit(5);
		driver.switchTo().frame("iframeForKMS");
		TimeLimit(5);
		

		click(pg.clickNextt);
		
		
		click(pg.Finish01);
		
		re.screenshot2("3");
		TimeLimit(4);
		
		
		
	}
}
