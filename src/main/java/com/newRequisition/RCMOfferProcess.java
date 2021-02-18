package com.newRequisition;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BasePages.BasePage1;
import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;
import com.candidateportal.CareerSite;

public class RCMOfferProcess extends BasePage1{

	public WebDriver driver;
	PageFactoryClass pg;
	String Cand_ID;
	String Reqid;
	ConfigExcel1 exceldata = new ConfigExcel1();
	ReusableMethods re;
	CareerSite cs;
	String Cand="Standard";

	public RCMOfferProcess(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void TimeLimit(int time) throws InterruptedException {

		Thread.sleep(time * 1000);

	}

	public void Offerprocess() throws Exception{
	
		
		pg = new PageFactoryClass(driver);
		re = new ReusableMethods(driver);
		cs= new CareerSite(driver);

		// Retreiving the requisition ID here
		String Reqid = exceldata.getRowAndColumn(2, 1, 3);
		ConfigExcel1 excel;
	// Offer Letter
	TimeLimit(15);
    re.setProxyOfferManager();
	re.screenshot1("Proxy Offer");
	// Call the method home to job req
	re.hometoSelectJobReq();
	// Click on Save Changes
	
	click(pg.savechanges);
	TimeLimit(10);
	
	re.screenshot1("13");

	// click on Candidates tab
	click(pg.candidateHeaderLink);
	TimeLimit(10);

	
	re.filterByEmail();

	// click on Candidate name
	click(pg.candNameText);
	TimeLimit(20);

	
	// click on move candidate
	click(pg.MoveCandidate);
	TimeLimit(10);

	// Select status to move candidate(s) to:
	//Offer
	Select statusDropDown3 = new Select(selectValue(pg.statusDropDown));
	TimeLimit(5);
	statusDropDown3.selectByVisibleText(exceldata.getRowAndColumn(3, 27, 1));

	// Select status to move candidate(s) to:
	//Send offer contract
	Select subItem2 = new Select(selectValue(pg.statusDropDown2));
	TimeLimit(5);
	subItem2.selectByVisibleText(exceldata.getRowAndColumn(3, 28, 1));
	TimeLimit(4);

	// Please comment on the status change (optional):
	writeText(pg.comment_statuschange,exceldata.getRowAndColumn(3, 29, 1));
	TimeLimit(5);
	
	re.screenshot1("14");

	// Click on apply updates
	click(pg.applyUpdates);
	TimeLimit(15);
	re.Scroll_UpSc();
	
	
	// click on offer tab
	click(pg.offerTab);
	TimeLimit(10);
	re.screenshot1("Offer");

			
	//re.filterByEmail();

	// click on candidate name
	click(pg.candNameText);
	TimeLimit(10);
	re.Scroll_Down();
	TimeLimit(10);
	

	// Select OfferDate
	DateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY");
	Calendar C11 = Calendar.getInstance();
	C11.setTime(new Date());
	String date11 = sdf1.format(new Date());
	System.out.println(date11);

	WebElement OfferDate = pg.offerLetterDate;
	OfferDate.sendKeys(date11);
	TimeLimit(8);
	
	// Click Save
	click(pg.saveButton);
	TimeLimit(15);
	
	re.screenshot1("15");
	// Click Take ACtion
	click(pg.takeAction);
	
	click(pg.selectOffer);
	
	click(pg.selectOfferl);
	TimeLimit(15);

	// Select Language
	Select language = new Select(selectValue(pg.offerLanguage));
	TimeLimit(5);
	language.selectByValue(exceldata.getRowAndColumn(3, 30, 1));
	TimeLimit(5);

	// Select template
	Select template = new Select(selectValue(pg.selectTemplate));
	TimeLimit(5);
	template.selectByVisibleText(exceldata.getRowAndColumn(3, 31, 1));
	TimeLimit(5);
	// Click next Step
	click(pg.nextStep);
	TimeLimit(20);
	// Click on online Offer
	click(pg.onlOffer);
	TimeLimit(10);
	// Click on Next
	click(pg.clickNext);
	TimeLimit(15);
	
	re.screenshot1("16");

	re.Scroll_DownSc();
	TimeLimit(5);
	// Click on send
	click(pg.clickSend);
	TimeLimit(20);
	
	re.screenshot1("17");
	// Clikc on I'M Done
	click(pg.clickDone);
	TimeLimit(10);
	
	

	re.filterByEmail();

	// click on Candidate name
	click(pg.candNameText);
	TimeLimit(15);

	// Select Status as offer sent
	Select InterviewStatus11 = new Select(selectValue(pg.custofferStatus));
	TimeLimit(5);
	InterviewStatus11.selectByVisibleText(exceldata.getRowAndColumn(3, 32, 1));

	// click on save button
	click(pg.saveButton);
	TimeLimit(15);
	

	re.screenshot1("18");
	
	// To Open tab 2 in the Same browser
	((JavascriptExecutor) driver)
			.executeScript("window.open('https://career5.successfactors.eu/career?company=capgemitecT1');");
	Set<String> tab_handles1 = driver.getWindowHandles();
	// Get number of tabs
	int number_of_tabs1 = tab_handles1.size();
	// Print no of tabs
	System.out.println("Number of Tabs is" + "" + number_of_tabs1);
	// Set index
	int new_tab_index1 = number_of_tabs1 - 1;
	// Switch to new tab
	driver.switchTo().window(tab_handles1.toArray()[new_tab_index1].toString());
	TimeLimit(5);
	re.screenshot1("19");
	// Click on SignIN
	click(pg.signIn);
	TimeLimit(5);
	// Enter Email
	writeText(pg.emailId,exceldata.getRowAndColumn(2, 1, 5));
	TimeLimit(3);
	// Enter Password
	writeText(pg.passwordC,exceldata.getRowAndColumn(2, 1, 6));
	TimeLimit(3);
	// SignIn
	click(pg.signInc);
	TimeLimit(10);
	// AcceptOffer
	click(pg.jobApplied);
	TimeLimit(2);
	re.screenshot1("20");
	click(pg.acceptOffer);
	TimeLimit(5);
	click(pg.acceptOffer1);
	TimeLimit(10);
	click(pg.acceptOffer2);
	TimeLimit(5);
	re.screenshot1("21");
	TimeLimit(5);

	// Switch to first tab
	driver.switchTo().window(tab_handles1.toArray()[new_tab_index1 - 1].toString());

	// Select Status as Offer accepted
	Select InterviewStatus111 = new Select(selectValue(pg.custofferStatus));
	TimeLimit(5);
	InterviewStatus111.selectByVisibleText(exceldata.getRowAndColumn(3, 34, 1));

	// click on save button
	click(pg.saveButton);
	TimeLimit(15);
	
	re.screenshot1("22");

	// Select Offer Check Sub status
	Select candsubstatus = new Select(selectValue(pg.candSubStatus));
	TimeLimit(5);
	candsubstatus.selectByVisibleText(exceldata.getRowAndColumn(3, 35, 1));
	TimeLimit(5);

	// click on save button
	click(pg.saveButton);
	TimeLimit(15);
	
	re.screenshot1("23");
	

	re.setProxyRM();
	TimeLimit(8);
	// Calling the Method
	re.hometoSelectJobReq();
	// click on Candidates tab
	click(pg.candidateHeaderLink);
	TimeLimit(10);
	re.filterByEmail();

	// click on Candidate name
	click(pg.candNameText);
	TimeLimit(10);

	// Select Offer Check Sub status
	Select validateOffer = new Select(selectValue(pg.offerLetterValidation));
	TimeLimit(2);
	validateOffer.selectByVisibleText(exceldata.getRowAndColumn(3, 36, 1));
	TimeLimit(5);

	// click on save button
	click(pg.saveButton);
	TimeLimit(15);
	re.screenshot1("24");

	// Select cand status as Onboarding
	Select candStatuss = new Select(selectValue(pg.candStatus));
	TimeLimit(2);
	candStatuss.selectByVisibleText(exceldata.getRowAndColumn(3, 37, 1));
	TimeLimit(5);

	// click on save button
	click(pg.saveButton);
	TimeLimit(15);
	re.screenshot1("25");
	

	// click on Onboard button
	re.click(pg.onBoard);
	
	TimeLimit(10);
	

	re.filterByEmail();

	// click on candidate name
	click(pg.candNameText);
	TimeLimit(10);
	re.Scroll_Down();
	TimeLimit(10);

	// click on Candidate name
	pg.candNameText.click();
	TimeLimit(10);

	// click on take action
	click(pg.takeAction);
	TimeLimit(1);

	// click on initiate onboarding
	click(pg.initOnBoard);
	TimeLimit(2);

	click(pg.confirm);
	re.screenshot1("26");

	TimeLimit(60);
	click(pg.clickOk);
	TimeLimit(8);
	

	String candID = pg.candidateID.getText();
	String candIDR = candID.substring(1, 8);
	// Load the CandidateID and replace
	exceldata.writeData(2, 1, 4, candIDR);

	// Load the CandidateID into datasheet.
	List<String> list = new ArrayList();
	list.add(candIDR);
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date31 = new Date();
	String dateAndTime = formatter.format(date31);
	list.add(dateAndTime);
	exceldata.writeDataIntoSh(5, list);
	System.out.println("Candidate ID is successfully written into the sheet" + " " + candIDR);
	
	TimeLimit(5);
	re.screenshot1("27");
	TimeLimit(5);

}
}