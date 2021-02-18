package com.newRequisition;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePages.BasePage1;
import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;
import com.candidateportal.CareerSite;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class screeningCandidate extends BasePage1 {

	public WebDriver driver;
	PageFactoryClass pg;
	String Cand_ID;
	String Reqid;
	ConfigExcel1 exceldata = new ConfigExcel1();
	ReusableMethods re;
	CareerSite cs;
	String Cand="Standard";

	public screeningCandidate(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void TimeLimit(int time) throws InterruptedException {

		Thread.sleep(time * 1000);

	}

	// New Application Process
	public void screening() throws Exception {

		pg = new PageFactoryClass(driver);
		re = new ReusableMethods(driver);
		cs= new CareerSite(driver);

		// Retreiving the requisition ID here
		String Reqid = exceldata.getRowAndColumn(2, 1, 3);
		ConfigExcel1 excel;
		// Calling Login Method from SFLogin Class 
		//Since SSO Login we disabled this
		//re.sfLogin();
		TimeLimit(15);
		//Proxy as RM to check role details
		re.setProxyRM();
		TimeLimit(8);
		// Calling Home to Select Job Req Method from SFLogin Class
		re.hometoSelectJobReq();
		TimeLimit(10);
		// Calling Proxy Method from SFLogin Class
		re.setProxySM();
		TimeLimit(8);
		// Calling Home to Select Job Req Method from SFLogin Class
		re.hometoSelectJobReq();
		TimeLimit(10);
		// click on Candidates tab
		click(pg.candidateHeaderLink);
		TimeLimit(20);
		re.screenshot("1");
		// Click on new Application tab
		click(pg.newApplication);
		
		// Calling filterByemail method from reusableMethods class
		re.filterByEmail();
		// click on Candidate name
		click(pg.candNameText);
		TimeLimit(10);
		// Scroll down
		re.Scroll_DownSc();
		TimeLimit(2);
		re.Scroll_DownSc();
		TimeLimit(2);

		// click on move candidate
		click(pg.MoveCandidate);
		TimeLimit(15);

		// Select status to move candidate(s) to:
		//Screening
		Select status = new Select(selectValue(pg.statusDropdown));
		TimeLimit(5);
		status.selectByVisibleText(exceldata.getRowAndColumn(3, 0, 1));
		TimeLimit(5);

		// Please comment on the status change (optional):
		writeText(pg.comment_statuschange,exceldata.getRowAndColumn(3, 1, 1));
		TimeLimit(5);
		
		re.screenshot1("2");

		// click on applyUpdates
		pg.applyUpdates.click();
		TimeLimit(15);

		//Proxy as RM
		re.setProxyRM();
		TimeLimit(8);
		// Calling Home to Select Job Req Method from SFLogin Class
		re.hometoSelectJobReq();
		TimeLimit(10);
		
		
		
		
		
		
		
		
		
		// click on Candidates tab
		click(pg.candidateHeaderLink);
		TimeLimit(20);
		re.screenshot("1");
		// Press enter to filter By 2. Screen, 1 Candidates
		click(pg.status_Screen);
		TimeLimit(5);
		re.screenshot1("3");
		re.filterByEmail();

		// click on candidate name
		click(pg.candNameText);
		TimeLimit(10);
		re.Scroll_DownSc();
		TimeLimit(2);
		re.Scroll_DownSc();
		TimeLimit(2);

		// click on move candidate
		click(pg.MoveCandidate);
		TimeLimit(10);

		// Select status to move candidate(s) to:
	   //Interview
		Select statusDropDown1 = new Select(selectValue(pg.statusDropdown));
		TimeLimit(5);
		statusDropDown1.selectByVisibleText(exceldata.getRowAndColumn(3, 2, 1));
		TimeLimit(5);

		// Select sta)tus to move candidate(s) to:
		//Online Assessment
		Select subItem = new Select(pg.statusDropdown2);
		TimeLimit(5);
		subItem.selectByVisibleText(exceldata.getRowAndColumn(3, 3, 1));
		TimeLimit(4);

		// Please comment on the status change (optional):
		writeText(pg.comment_statuschange,exceldata.getRowAndColumn(3, 4, 1));
		TimeLimit(5);

		
		re.screenshot1("4");
		// click on applyUpdates
		click(pg.applyUpdates);
		TimeLimit(10);

		// click on interview tab
		click(pg.interviewTab);
		TimeLimit(10);
		re.screenshot1("5");
		re.filterByEmail();

		// Click on the candidate
		click(pg.candNameText);
		TimeLimit(15);

		// select Interview Status

		Select InterviewStatus = new Select(selectValue(pg.selectInterviewStatus));
		TimeLimit(5);
		InterviewStatus.selectByVisibleText(exceldata.getRowAndColumn(3, 5, 1));
		TimeLimit(8);

		// click on save button
		pg.saveButton.click();
		TimeLimit(20);

		// select Interview Status
		Select CanSubStatus = new Select(selectValue(pg.selectInterviewSubStatus));
		TimeLimit(10);
		CanSubStatus.selectByVisibleText(exceldata.getRowAndColumn(3, 6, 1));
		TimeLimit(5);

		// The new status will cause the applicant to skip a step. Please enter
		// justification below:
		pg.justification.sendKeys("Moving to HR Round");
		TimeLimit(4);
		re.screenshot1("HR Round");
		
		

		// click on save button
		click(pg.saveButton);
		TimeLimit(15);

		re.screenshot1("6");
	
		

		// enter House Number
		writeText(pg.houseNumber,exceldata.getRowAndColumn(3, 8, 1));
		TimeLimit(4);

		

		// click on save button
		click(pg.saveButton);
		TimeLimit(15);
		
		re.screenshot1("7");
		TimeLimit(1);
		re.Scroll_DownSc();
		TimeLimit(2);
		re.Scroll_DownSc();
		TimeLimit(2);

		// click on move candidate
		click(pg.MoveCandidate);
		TimeLimit(10);

		// Select status to move candidate(s) to:
		//Offer
		Select statusDropDown2 = new Select(selectValue(pg.statusDropDown));
		TimeLimit(5);
		statusDropDown2.selectByVisibleText(exceldata.getRowAndColumn(3, 12, 1));

		// Select status to move candidate(s) to:
		//Offer Approval external
		Select subItem1 = new Select(selectValue(pg.statusDropDown2));
		TimeLimit(5);
		subItem1.selectByVisibleText(exceldata.getRowAndColumn(3, 13, 1));
		TimeLimit(4);

		// Please comment on the status change (optional):
		writeText(pg.comment_statuschange,exceldata.getRowAndColumn(3, 14, 1));
		TimeLimit(5);
		re.screenshot1("8");
		click(pg.applyUpdates);
		TimeLimit(10);


		// click on offer tab
		click(pg.offerTab);
		TimeLimit(10);
		re.screenshot1("Offer");

		re.filterByEmail();

		// click on candidate name
		click(pg.candNameText);
		TimeLimit(10);
		re.Scroll_Down();
		TimeLimit(10);

		// Get Today's Date
		DateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		Calendar C1 = Calendar.getInstance();
		C1.setTime(new Date());
		String date1 = sdf.format(new Date());
		System.out.println(date1);

		// Enter Job Start Date
		WebElement Job_Start_Date = pg.jobStartDateCand;
		Job_Start_Date.sendKeys(date1);
		TimeLimit(5);

		// Select Status
		Select Offerst = new Select(selectValue(pg.offerStatus));
		Offerst.selectByVisibleText(exceldata.getRowAndColumn(3, 33, 1));
		TimeLimit(5);
		
		re.screenshot1("9");

		// Fill Values
		writeText(pg.annualSalary,exceldata.getRowAndColumn(3, 15, 1));
		TimeLimit(5);
		
		Select semiMonthCalc = new Select(selectValue(pg.semiMonth));
		TimeLimit(5);
		semiMonthCalc.selectByVisibleText(exceldata.getRowAndColumn(3, 38, 1));
		TimeLimit(5);

		Select country = new Select(selectValue(pg.workCountry));
		TimeLimit(5);
		country.selectByVisibleText(exceldata.getRowAndColumn(3, 16, 1));
		TimeLimit(5);

		Select state = new Select(selectValue(pg.stateProvince));
		TimeLimit(5);
		state.selectByVisibleText(exceldata.getRowAndColumn(3, 17, 1));
		TimeLimit(5);

		Select City = new Select(selectValue(pg.custCity));
		TimeLimit(5);
		City.selectByVisibleText(exceldata.getRowAndColumn(3, 18, 1));
		TimeLimit(4);

		Select offert = new Select(selectValue(pg.custOfferType));
		TimeLimit(5);
		offert.selectByVisibleText(exceldata.getRowAndColumn(3, 19, 1));
		TimeLimit(4);
		
		//BGV Rrq
		Select BGVRequ = new Select(selectValue(pg.BGVReq));
		TimeLimit(5);
		BGVRequ.selectByVisibleText(exceldata.getRowAndColumn(3, 39, 1));
		TimeLimit(4);

		

		Select payScale = new Select(selectValue(pg.custPayScale));
		TimeLimit(5);
		payScale.selectByVisibleText(exceldata.getRowAndColumn(3, 21, 1));
		TimeLimit(4);

		Select offGrade = new Select(selectValue(pg.custOffGrade));
		TimeLimit(5);
		offGrade.selectByVisibleText(exceldata.getRowAndColumn(3, 22, 1));
		TimeLimit(4);
		
		re.screenshot1("10");
		
		Select TTCDesGrade = new Select(selectValue(pg.TTCgrade));
		TimeLimit(5);
		TTCDesGrade.selectByVisibleText(exceldata.getRowAndColumn(3, 40, 1));
		TimeLimit(4);

		Select Design = new Select(selectValue(pg.Designation1));
		TimeLimit(5);
		Design.selectByVisibleText(exceldata.getRowAndColumn(3, 41, 1));
		TimeLimit(4);
		if(Cand=="Standard") {
		Select emp = new Select(selectValue(pg.custEmp));
		TimeLimit(5);
		emp.selectByVisibleText(exceldata.getRowAndColumn(3, 23, 1));
		TimeLimit(4);
		}
		else
		{
		Select emp = new Select(selectValue(pg.custEmp));
		TimeLimit(5);
		emp.selectByVisibleText(exceldata.getRowAndColumn(3, 23, 2));
		TimeLimit(4);	
		}

		Select subEmp = new Select(selectValue(pg.custSubEmp));
		TimeLimit(5);
		subEmp.selectByVisibleText(exceldata.getRowAndColumn(3, 24, 1));
		TimeLimit(4);

		
		// click on save button
		click(pg.saveButton);
		TimeLimit(30);
		
		re.screenshot1("12");

		
		
	}

}
