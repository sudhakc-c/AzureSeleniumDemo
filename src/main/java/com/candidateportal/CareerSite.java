package com.candidateportal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.BasePages.BasePage;
import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;
import com.newRequisition.ReusableMethods;


public class CareerSite extends BasePage {
	public WebDriver driver;
	
	ConfigExcel1 exceldata = new ConfigExcel1();
	CareerSiteElements cselements = new CareerSiteElements(driver);
	PageFactoryClass pg= new PageFactoryClass(driver);
	ReusableMethods re;
	

	public CareerSite(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public void TimeLimit(int time) throws InterruptedException {

		Thread.sleep(time * 1000);
	}

	// Search and apply for the job based on Requisition ID
	public void SelectJob() throws Exception {

		pg = new PageFactoryClass(driver);
		re = new ReusableMethods(driver);
		//Retreive the reqid from the sheet
		String ReqNumber = exceldata.getRowAndColumn(2, 1, 3);
		//calling the wrapper methods from CareerSiteElements Class
		//Clear
		click(cselements.clear);
	    //Enter req ID
		writeText(cselements.ReqID, ReqNumber);
		TimeLimit(5);
		//Search Job
		click(cselements.searchJobs);
		
		TimeLimit(8);
		//Select Action
		click(cselements.selectAction);
		TimeLimit(5);
		//Apply Job
		click(cselements.applyJob);
		//Take a screenshot
		re.screenshot("Career Site");
	}

	// Create a New account, provide details and apply for the job
	public void CreateNew_account() throws InterruptedException, Exception {

		//Specify file path of the resume
	    String resumePath = exceldata.getRowAndColumn(0, 9, 1);
		pg = new PageFactoryClass(driver);
		re = new ReusableMethods(driver);

		//Retreive the reqid from the sheet
		String ReqNumber = exceldata.getRowAndColumn(2, 1, 3);
		// Career Opportunities : Create an account
		click(cselements.createAccount);
		
		// Email Address (E=Enter)
		writeText(cselements.enterEmail, ReqNumber + "_" + exceldata.getRowAndColumn(1, 4, 1) + "_" + re.Randmonth()
				+ re.time() + "@gmail.com");
		String EmailID = readText(cselements.enterEmail);
		//Print the Email Address
		System.out.println("Please Note the New Candidate Email ID :" + EmailID);

		// Retype Email Address
		writeText(cselements.retypeEmail, EmailID);

		// Choose Password
		writeText(cselements.enterPassword, exceldata.getRowAndColumn(1, 5, 1));
		String Password = readText(cselements.enterPassword);
        //Print Password
		System.out.println("Please Note the New Candidate Password :" + Password);
		
		// Retype Password
		writeText(cselements.reenterPassword, exceldata.getRowAndColumn(1, 5, 1));

		// First Name
		writeText(cselements.firstName, exceldata.getRowAndColumn(1, 6, 1));
		String Fname = readText(cselements.firstName);
		
		// Last Name
		writeText(cselements.lastName, exceldata.getRowAndColumn(1, 7, 1));
		String Lname = readText(cselements.lastName);

		// Country/Region code
		Select Region_code = new Select(pg.Country_RegionCode);
		Region_code.selectByVisibleText(exceldata.getRowAndColumn(1, 8, 1));

		// Phone Number
		pg.phoneNumber.sendKeys(re.generateRandomNumber(10));

		// Array List to write data into the excel sheet
		List<String> list = new ArrayList<>();
		// Data Loaded into datasheet
		list.add(ReqNumber);
		list.add(Fname);
		list.add(Lname);
		list.add(EmailID);
		list.add(Password);
		exceldata.writeDataIntoSh(4, list);
		System.out.println(" Details of the candidate are loaded successfully into the excel sheet");
		// Write EmailID and Password into sheet
		exceldata.writeData(2, 1, 5, EmailID);
		exceldata.writeData(2, 1, 6, Password);

		// Select Country of Residence
		Select CountryOfResidence = new Select(pg.Country_Of_Residence);
		CountryOfResidence.selectByVisibleText(exceldata.getRowAndColumn(1, 9, 1));

		// Select Terms
		click(cselements.terms);

		// Click the Accept Button in privacy Policy
		click(cselements.acceptTerms);

		// Create Account
		click(cselements.createAccount1);

		//Expand all Sections
		click(cselements.expandAllSections);

		//Upload Resume
		click(cselements.uploadResume);	
		pg.uploadDevice.sendKeys(resumePath);
		TimeLimit(15);
		
		//Personal Title
		
		waitVisibility(cselements.personaltitle);
		Select resCountry = new Select(pg.perstitle);
		resCountry.selectByVisibleText(exceldata.getRowAndColumn(1, 11, 1));
		
		//Select Residing Country
		waitVisibility(cselements.residingCountry);
		Select resCountry1 = new Select(pg.residingCountry);
		resCountry1.selectByVisibleText(exceldata.getRowAndColumn(1, 12, 1));
		
		TimeLimit(3);

		//Select StateProvince
		waitVisibility(cselements.state);
		Select stateP = new Select(pg.stateProvince1);
		TimeLimit(5);
		stateP.selectByVisibleText(exceldata.getRowAndColumn(1, 13, 1));

		// Select City
     	writeText(cselements.city, exceldata.getRowAndColumn(1, 14, 1));

		// Postal Code
		writeText(cselements.postalCode, exceldata.getRowAndColumn(1, 15, 1));
		
		
		TimeLimit(5);
		
		//delete row
		driver.findElements(By.xpath("//div[@class='iconHolder']")).get(2).click();		    
		TimeLimit(10);	
		re.Scroll_Down();
			   
		//delete row
		driver.findElements(By.xpath("//div[@class='iconHolder']")).get(2).click();
	
	    

		// Select Age
		/*waitVisibility(cselements.age);
		Select Age = new Select(pg.age);
		Age.selectByVisibleText(exceldata.getRowAndColumn(1, 41, 1));

		// Select Ethnicity
		waitVisibility(cselements.ethnicicity);
		Select Ethnicity1 = new Select(pg.ethnicity);
		Ethnicity1.selectByVisibleText(exceldata.getRowAndColumn(1, 42, 1));
		
		
		*/
		
		
		//Click checkbox
		click(cselements.checkbox);
		
		

		// Find the checkbox or radio button element by its name.
		if (exceldata.getRowAndColumn(1, 17, 1) == "Male") {
			click(cselements.GenderM);

		} else {

			click(cselements.GenderF);

		}
				
		// Select legal entity
		waitVisibility(cselements.legalEntity);
		Select legalEnt = new Select(pg.legalEntity);
		legalEnt.selectByVisibleText(exceldata.getRowAndColumn(1, 18, 1));
		
		//Select Visa status
		waitVisibility(cselements.visastatus);
		Select visastat = new Select(pg.StatusVisa);
		visastat.selectByVisibleText(exceldata.getRowAndColumn(1, 19, 1));
		

		//Select disability
		waitVisibility(cselements.aggrement);
		Select disability = new Select(pg.AGGREMENT);
		disability.selectByVisibleText(exceldata.getRowAndColumn(1, 20, 1));
		
		
		


		// Select Sexual Orientation
		/*waitVisibility(cselements.sexualOrientation);
		Select Orient = new Select(pg.Orientation);
		Orient.selectByVisibleText(exceldata.getRowAndColumn(1, 44, 1));*/

		

		// Click Save
		click(cselements.clickSave);
		TimeLimit(10);
		
		// Click Apply
		click(cselements.applyClick);
		//Take a screenshot
		re.screenshot("Candidate Applied Job");
		
		
		
		TimeLimit(5);
		
		
		
		
		
		
	}
	

	//if candidate has an account already, Sign In

	public void signIn() throws Exception {

		        pg = new PageFactoryClass(driver);
		        TimeLimit(10);
		        //Click SignIn
				click(cselements.signIn);
				TimeLimit(5);
				//Enter email
				writeText(cselements.emailId,exceldata.getRowAndColumn(2, 1, 5));
				TimeLimit(3);
				//Enter Password
				writeText(cselements.passwordC,exceldata.getRowAndColumn(2, 1, 6));
				TimeLimit(3);
				//Sign In
				click(cselements.signInc);
				TimeLimit(15);
				
				
				
				

	}

}