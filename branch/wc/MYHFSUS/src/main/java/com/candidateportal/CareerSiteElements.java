package com.candidateportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePages.ConfigExcel1;

public class CareerSiteElements {
	public WebDriver driver;
	ConfigExcel1 exceldata = new ConfigExcel1();

	public CareerSiteElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		By clear= By.xpath("//button[text()='Clear']");
		By ReqID= By.xpath("//input[@name='reqnumber']");
		By searchJobs= By.xpath("//button[text()='Search Jobs']");
		By selectAction= By.xpath("//a[text()='Select Action']");
		By applyJob=By.xpath("//a[text()='Apply']");
		By createAccount = By.xpath("//a[contains(text(), 'account')]");
	    By enterEmail =By.xpath("//input[@name='fbclc_userName']");
		By retypeEmail= By.xpath("//input[@title='Retype Email Address:']");
		By enterPassword= By.xpath("//input[@name='fbclc_pwd']");
		By reenterPassword= By.xpath("//input[@name='fbclc_pwdConf']");
		By firstName= By.xpath("//input[@name='fbclc_fName']");
		By lastName= By.xpath("//input[@name='fbclc_lName']");
		By terms = By.xpath("//a[@id='dataPrivacyId']");
		By acceptTerms= By.xpath("//button[text()='Accept']");
		By createAccount1 = By.xpath("//button[@name='fbclc_createAccountButton']");
		By expandAllSections = By.xpath("//a[text()='Expand all sections']");
		By uploadResume = By.xpath("//span[contains(text(),'Upload a Resume')]/parent::div[@class='attachmentLabel attachmentText']");
		By residingCountry = By.xpath("//select[@name='custcountry']");
		By state = By.xpath("//select[@name='state']");
		By city= By.xpath("//input[@name='city']");
		By postalCode= By.xpath("//input[@name='zip']");
		By age = By.xpath("//select[@name='custage']");
		By ethnicicity = By.xpath("//select[@name='custethnicity']");
		By GenderM = By.xpath("//label[text()='Male']");
		By GenderF = By.xpath("//label[text()='Female']");
		By sexualOrientation = By.xpath("//select[@name='custorientation']");
		By legalEntity = By.xpath("//select[@name='custWorking']");
		By aggrement = By.xpath("//select[@name='custLegal']");
		By clickSave =By.xpath("//span[text()='Save']");
		By applyClick = By.xpath("//span[text()='Apply']");
		//new
		By personaltitle = By.xpath("//select[@name='custperstitle']");
        By checkbox = By.xpath("//input[@name='custeeostatementcheck']");
        By nationality = By.xpath("//select[@name='custnationality']");
        By remove1 = By.xpath("//*[@title='Delete Row']");
        By remove2 = By.xpath("//*[@title='Delete Row']");
        By viewProfile = By.xpath("//div[text()='View Profile']");
        By signIn= By.xpath("//a[text()='Sign In']");
    	By emailId= By.xpath("//input[@name='username']");
        By passwordC= By.xpath("//input[@name='password']");
        By signInc= By.xpath("//button[@onclick='return validateFields();']");
    	By backtoJob= By.xpath("//div[text()='Back to Job Listing']");
    	By signOut= By.xpath("//a[@title='Sign Out']");
    	By visastatus = By.xpath("//select[@name='custVisaUS']");
    	
    	
    	
	}
