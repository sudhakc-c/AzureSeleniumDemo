package com.newRequisition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BasePages.BasePage1;
import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;

public class ONBSPOCVerification extends BasePage1 {

	public WebDriver driver;

	PageFactoryClass pg;
	ConfigExcel1 exceldata = new ConfigExcel1();
	ReusableMethods re;

	public ONBSPOCVerification(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void TimeLimit(int time) throws InterruptedException {

		Thread.sleep(time * 1000);

	}

	public void ONBSPOCVerify() throws Exception {

		// Get the address of main window
		String firstWindow = driver.getWindowHandle();
		
		pg = new PageFactoryClass(driver);
		re = new ReusableMethods(driver);

		TimeLimit(15);
		
		// Proxy as Recruiter
		re.setProxyRM();
		
		TimeLimit(10);

		// clicking on home Button
		click(pg.Home);
		TimeLimit(2);

		// Clicking on Onboarding
		click(pg.Onboarding);
		TimeLimit(10);

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
		
		re.screenshot2("4");

		// Click ONB SPOC Verification Process
	    click(pg.clickONBSPOC);
		TimeLimit(10);

		// Switch to Outer Frame
		driver.switchTo().frame("iframeForKMS");
		TimeLimit(5);

		// Switch to Inner Frame
		driver.switchTo().frame("frmContent");
		TimeLimit(5);

		// Select Provision
		waitVisibility(pg.selectProvision);
		Select provision = new Select(pg.selectProvision);
		provision.selectByVisibleText(exceldata.getRowAndColumn(1, 27, 1));

		// Select PUsh to HRMS
		waitVisibility( pg.pushHRMS);
		Select HRMSPush = new Select(pg.pushHRMS);
		HRMSPush.selectByVisibleText(exceldata.getRowAndColumn(1, 28, 1));

		re.screenshot2("5");
		

		
		
		// Finish
		pg.Finish00.click();
		TimeLimit(8);
		
		re.screenshot2("7");

		
		// Switch to frame
		driver.switchTo().frame("iframeForKMS");
		TimeLimit(5);
		
		re.screenshot2("8");

		// Finish
		pg.Finish01.click();
		TimeLimit(10);

	}
}
