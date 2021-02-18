/**
 *
 */
package com.BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sudhakc
 *
 */
public class PageFactoryClass {

	public WebDriver driver;
	ConfigExcel1 exceldata = new ConfigExcel1();

	public PageFactoryClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * @param args
	 */

	// @FindBy(xpath = "//input[@name='username']")
	// new instance UK
	
	
	@FindBy(xpath = "//input[@name='j_username']")

	public WebElement username;

	// CHANGE
	@FindBy(xpath = "//input[@name='j_password']")
	public WebElement password;

	// CHANGE
	@FindBy(xpath = "//button[@id='logOnFormSubmit']")
	public WebElement login;

	@FindBy(xpath = "//*[@id='utilityLinksMenuId-inner']")
	public WebElement Acc_Navigation;

	@FindBy(xpath = "//a[text()='Proxy Now']")
	public WebElement Proxy_Now;

	@FindBy(xpath = "//a[text()='Proxy Now']")
	public WebElement Proxy;

	@FindBy(xpath = "//input[@id='__input0-inner']")
	public WebElement Input;

	@FindBy(xpath = "//div[@class='surjcontent']")
	public WebElement Name;
	// em[text()='Andrea McGuinnes']

	@FindBy(xpath = "//bdi[text()='OK']")
	public WebElement OK;

	// @FindBy(xpath = "//span[@id='customHeaderModulePickerBtn-img']")
	public WebElement Drop_Down;
	// *[@id="customHeaderModulePickerBtn-BDI-content"]
	// Button[@id="customHeaderModulePickerBtn"]

	@FindBy(xpath = "//bdi[text()='Home']/parent::span[@class='sapMBtnContent']")
	public WebElement Home;
	// bdi[text()='Home']

	@FindBy(xpath = "//a[text()='Recruiting']")
	public WebElement Recruiting;

	@FindBy(xpath = "//a[@aria-label='Create New Position 1']")
	public WebElement Create_New;

	@FindBy(xpath = "//*[@id='pagegroup']/div/div/table/tbody/tr[2]/td/div/ul/div[3]/li/a")
	public WebElement Browse;

	@FindBy(xpath = "//a[text()='Browse Families & Roles']")
	public WebElement Family_List;

	@FindBy(xpath = "//select[@name='JDM Family List']")
	public WebElement JobFamily;

	@FindBy(xpath = "//div[@id='7:_roles']")

	// div[@id='27:_roleItem']
	public WebElement Job;

	public void Job() throws Exception {
		
		WebElement jobvalues = driver.findElement(By.linkText(exceldata.getRowAndColumn(1, 7, 1)));
		jobvalues.click();

	}
public void Jobbb() throws Exception {
		Thread.sleep(3000);
		WebElement jobvalues = driver.findElement(By.linkText(exceldata.getRowAndColumn(1, 7, 1)));
		jobvalues.click();

	}

	/*
	 * we can select different job families by changing id in the above Xpath id=27
	 * for Account Executive id=28 for Account Executive - DSS id=29 for Account
	 * Executive - Delivery . . .id=30 for Senior Account Manager - Delivery but
	 * every time id was changing so i've chaged xpath to text()
	 */

	@FindBy(xpath = "//Button[text()='Select']")
	public WebElement Select;

	@FindBy(xpath = "//input[@id='createNewJobReq_hiring_mgr_text']")
	public WebElement Hiring_Manager;

	@FindBy(xpath = "//li[@class='yui-ac-highlight']")
	public WebElement H_Manager;

	@FindBy(xpath = "//input[@id='createNewJobReq_coordinator_text']")
	public WebElement Rec_Manager;

	@FindBy(xpath = "//b[text()='Godly']")
	public WebElement R_manager;

	@FindBy(xpath = "//input[@class='globalPrimaryButton']")
	public WebElement Next;

	@FindBy(xpath = "//input[@id='93:_write']")
	public WebElement Job_Startdate;

	@FindBy(xpath = "//input[@id='187:_input']")
	public WebElement Category;

	@FindBy(xpath = "//li[@id='188:item0']")
	public WebElement Category1;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fcustsupervisor']/.//.")
	public WebElement Admin_GGID;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fcustpartnerid']/.")
	public WebElement staffing_partner;

	// textarea[@id='tor_wf_sect_0_fhiringManagerNote']
	@FindBy(xpath = "//textarea[@id='tor_wf_sect_0_fhiringManagerNote']")
	public WebElement H_M_Note;

	@FindBy(xpath = "//input[@value='MM/DD/YYYY']//ancestor::span[@id='datePicker_tor_wf_sect_0_fjobStartDate']")
	public WebElement Start_date;

	@FindBy(xpath = "//button[contains(.,'Send to Next Step')]")
	public WebElement send_to_nextStep;

	@FindBy(xpath = "//textarea[@id='fb2wk_form_p_comment']")
	public WebElement comments;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fid']/parent::span[@tabindex='0']")
	public WebElement req_id;

	@FindBy(xpath = "//*[@id='utilityLinksMenuId-inner']/div[1]/img")
	public WebElement account_change;

	@FindBy(xpath = "//a[text()='Proxy Now']")
	public WebElement proxy_now;

	@FindBy(xpath = "//button[text()='Filter Options']")
	public WebElement filterOptions;

	@FindBy(xpath = "//a[text()='Clear Filters']")
	public WebElement clearFilter;

	@FindBy(xpath = "//label[text()='Job Requisition ID:']/../..//input")
	public WebElement job_req_input;

	@FindBy(xpath = "//button[text()='Update Screen']")
	public WebElement update_Screen;

	@FindBy(xpath = "//a[@class='sapIcon globalFloatLeft link']")
	public WebElement view_job;

	@FindBy(how = How.LINK_TEXT, using = "View or Edit Requisition")
	public WebElement view_job_click;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_frecruiterName_op_text']")
	public WebElement recruiter;

	@FindBy(xpath = "//li[@class='yui-ac-highlight']")
	public WebElement r_manager;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fsourcerName_op_text']")
	public WebElement sourcing_manager;

	@FindBy(xpath = "//li[@class='yui-ac-highlight']")
	public WebElement r_manager1;
	@FindBy(xpath = "//textarea[@id='tor_wf_sect_0_fcustrecteamcomment']")
	public WebElement textarea;

	@FindBy(xpath = "//button[text()='Continue']")
	public WebElement continuee;

	@FindBy(xpath = "//button[contains(.,'  Approve')]")
	public WebElement approve;

	@FindBy(xpath = "//input[@name='tor__fsecondRecruiterName_op_text']")
	public WebElement sourcer;

	@FindBy(xpath = "//input[@name='saveChanages']")
	public WebElement savechanges;

	@FindBy(xpath = "//a[text()='Job Postings (0)']")
	public WebElement job_Posting;

	@FindBy(xpath = "//input[@id='20:_write']")
	public WebElement internal_jobPosting_StartDate;

	@FindBy(xpath = "//div[@id='externalpostingstartdate']//span//input")
	public WebElement external_JobPosting_startDate;

	@FindBy(xpath = "//div[@id='privateinternalpostingstartdate']//span//input")
	public WebElement int_PrivateJobPos_StartDate;

	@FindBy(xpath = "//div[@id='privateexternalpostingstartdate']//span//input")
	public WebElement ext_PrivateJobPos_StartDate;

	@FindBy(xpath = "//input[@id='23:_write']")
	public WebElement internal_jobPosting_EndDate;

	@FindBy(xpath = "//div[@id='externalpostingenddate']//span//input")
	public WebElement external_JobPosting_EndDate;

	@FindBy(xpath = "//div[@id='privateinternalpostingenddate']//span//input")
	public WebElement int_PrivateJobPos_EndDate;

	@FindBy(xpath = "//div[@id='privateexternalpostingenddate']//span//input")
	public WebElement ext_PrivateJobPos_EndDate;

	@FindBy(xpath = "//input[@onclick=\"saveJobPosting('fbjps_select_int_save_change')\" and @value='Post Job']")
	public WebElement internal_JobPosting;

	@FindBy(xpath = "//input[@onclick=\"saveJobPosting('fbjps_select_ext_save_change')\" and @value='Post Job']")
	public WebElement external_JobPosting;

	@FindBy(xpath = "//input[@onclick=\"saveJobPosting('fbjps_select_prv_int_save_change')\" and @value='Post Job']")
	public WebElement internal_PrivateJobPosting;

	@FindBy(xpath = "//input[@onclick=\"saveJobPosting('fbjps_select_prv_ext_save_change')\"and @value='Post Job']")
	public WebElement external_PrivateJobPosting;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fnumberOpenings']")
	public WebElement no_of_Openings;

	public WebElement getUsername() {
		return username;
	}

	// new changes
	@FindBy(xpath = "//button[@title='Company Code']/..//input")
	public WebElement CoCode;

	@FindBy(xpath = "//li[@id='108:item0']")
	public WebElement CoCode_Sh;

	@FindBy(xpath = "//button[@title='SBU']/..//input")
	public WebElement SBU;

	@FindBy(xpath = "//li[@ID='112:item0']")
	public WebElement SBU_Sh;

	@FindBy(xpath = "//input[@id='115:_input']")
	public WebElement BUPractice;

	@FindBy(xpath = "//ul[@id='116:_listSelect']")
	public WebElement BUPractice_Sh;

	@FindBy(xpath = "//input[@id='119:_input']")
	public WebElement PUSub_Practice_Sub_BU;

	@FindBy(xpath = "//li[@id='120:item0']")
	public WebElement PUSub_Practice_Sub_BU_Sh;

	@FindBy(xpath = "//button[@title='Location']/..//input")
	public WebElement JobLocation;

	@FindBy(xpath = "//li[@id='128:item0']")
	public WebElement JobLocation_Sh;

	@FindBy(xpath = "//button[@title='Hiring Reason']/..//input")
	public WebElement HiringReason;

	@FindBy(xpath = "//li[@id='132:item0']")
	public WebElement HiringReason_Sh;

	@FindBy(xpath = "//button[@title='Employee Group']/..//input")
	public WebElement EmployeeGroup;

	@FindBy(xpath = "//li[@id='136:item0']")
	public WebElement EmployeeGroup_Sh;

	@FindBy(xpath = "//button[@title='Pay Scale Type']/..//input")
	public WebElement PayScaleType;

	@FindBy(xpath = "//li[@id='140:item0']")
	public WebElement PayScaleType_Sh;

	@FindBy(xpath = "//button[@title='SBU Grade']/..//input")
	public WebElement SBU_Grade;

	@FindBy(xpath = "//li[@id='144:item0']")
	public WebElement SBU_Grade_Sh;

	@FindBy(xpath = "//button[@title='Designation']/..//input")
	public WebElement Designation;

	@FindBy(xpath = "//a[@title='Analyst']")
	public WebElement Designation_Sh;

	@FindBy(xpath = "//button[@title='Global Grade']/..//input")
	public WebElement GlobalGrade;

	@FindBy(xpath = "//a[@title='A']")
	public WebElement GlobalGrade_Sh;

	@FindBy(xpath = "//button[@title='Posting Country']/..//input")
	public WebElement PostingCountry;

	@FindBy(xpath = "//li[@id='156:item0']")
	public WebElement PostingCountry_Sh;

	@FindBy(xpath = "//button[@title='Posting Location']/..//input")
	public WebElement PostingLocation;

	@FindBy(xpath = "//select[@name='tor_wf_sect_0_fcountry']")
	public WebElement Country1;

	@FindBy(xpath = "//input[@id='93:_write']")
	public WebElement DatePicker;

	@FindBy(xpath = "//select[@name='tor_wf_sect_0_fcurrency']")
	public WebElement Currency1;

	@FindBy(xpath = "//li[@id=\"160:item0\"]")
	public WebElement PostingLocation_Sh;

	@FindBy(xpath = "//button[@title='Education Type']/..//input")
	public WebElement EducationType;

	@FindBy(xpath = "//a[@title=\"Bachelor's degree or equivalent\"]")
	public WebElement EducationType_Sh;

	@FindBy(xpath = "//button[@title='Contract Type']/..//input")
	public WebElement ContractType;

	@FindBy(xpath = "//li[@id='168:item0']")
	public WebElement ContractType_Sh;

	@FindBy(xpath = "//button[@title='Experience (RMK)']/..//input")
	public WebElement Experince;

	@FindBy(xpath = "//select[@id='tor_wf_sect_0_fcountry']")
	public WebElement SelectCountry;

	@FindBy(xpath = "//li[@id='172:item0']")
	public WebElement Experince_Sh;

	@FindBy(xpath = "//button[@title='Department']/..//input")
	public WebElement Department;

	@FindBy(xpath = "//a[@title='Capgemini Consulting']")
	public WebElement Department_Sh;

	@FindBy(xpath = "//button[@title='Brand']/..//input")
	public WebElement Brand;

	@FindBy(xpath = "//a[@title='gb-en']")
	public WebElement Brand_Sh;

	// careerSite xpath

	@FindBy(xpath = "//input[@name='reqnumber']")
	public WebElement reqNumber;

	@FindBy(xpath = "//button[text()='Search Jobs']")
	public WebElement search_Jobs;

	@FindBy(xpath = "//a[text()='Select Action']")
	public WebElement selectAction;

	@FindBy(xpath = "//input[@name='fbclc_userName']")
	public WebElement Email;

	@FindBy(xpath = "//input[@name='fbclc_emailConf']")
	public WebElement retypeEmail;

	@FindBy(xpath = "//input[@name='fbclc_pwd']")
	public WebElement choosePassword;

	@FindBy(xpath = "//input[@name='fbclc_pwdConf']")
	public WebElement pwdConf;

	@FindBy(xpath = "//input[@name='fbclc_fName']")
	public WebElement fName;

	@FindBy(xpath = "//input[@name='fbclc_lName']")
	public WebElement lName;

	@FindBy(xpath = "//button[text()='Create Account']")
	public WebElement createAccount;

	@FindBy(xpath = "//a[contains(text(), 'Read and accept the data privacy statement')]")
	public WebElement termsOfUse;

	@FindBy(xpath = "//button[text()='Accept']")
	public WebElement accept;

	@FindBy(xpath = "//input[@name='username']")
	public WebElement usernamee_C;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password_C;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	public WebElement signIn_C;

	@FindBy(xpath = "//a[text()='Expand all sections']")
	public WebElement expand_All_Sections;

	@FindBy(xpath = "//span[contains(text(),'Upload a Resume')]/parent::div[@class='attachmentLabel attachmentText']")
	public WebElement uploadResume;

	@FindBy(xpath = "//span[text()='Upload from Device']/following-sibling::input")
	public WebElement uploadFromDevice;

	@FindBy(xpath = "//span[text()='Attach a Cover Letter']/parent::div[@role='link']")
	public WebElement uploadCoverLetter;

	@FindBy(xpath = "//span[text()='Add a Document']/parent::div[@role='link']")
	public WebElement add_A_Document;

	@FindBy(xpath = "//input[@name='cellPhone']")
	public WebElement cellPhone;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement city;

	@FindBy(xpath = "//input[@name='zip']")
	public WebElement zipPostalCode;

	@FindBy(xpath = "//input[@name='VFLD1']")
	public WebElement employeName;

	@FindBy(xpath = "//label[text()='Start Date']//following-sibling::div//input")
	public WebElement startDate_c;

	@FindBy(xpath = "//label[text()='End Date']//following-sibling::div//input")
	public WebElement endDate_C;
	@FindBy(xpath = "//div[@id='140:_addRowBtn']")
	public WebElement addEducation;

	@FindBy(xpath = "//span[text()='Save']")
	public WebElement save_C;

	@FindBy(xpath = "//label[text()='College']//following-sibling::div//input")
	public WebElement CollegeRequired;

	@FindBy(xpath = "//label[@id='428:_radiolabel']")
	public WebElement maleRadioButon;

	@FindBy(xpath = "//label[@id='427:_radiolabel']")
	public WebElement femaleRadioButton;

	@FindBy(xpath = "//span[text()='Apply']")
	public WebElement apply_C;

	// Xpath of screening candidate page

	@FindBy(xpath = "//*[@id='candidateHeaderLink']/a")
	public WebElement candidateHeaderLink;

	@FindBy(xpath = "//a[@class='link nowrap']/parent::span[@class='wbCandName gap nameText']")
	public WebElement candNameText;

	@FindBy(xpath = "//button[text()='Move Candidate']")
	public WebElement MoveCandidate;

	@FindBy(xpath = "//textarea[@class='textAreaContent']")
	public WebElement comment_statuschange;

	@FindBy(xpath = "//button[text()='Apply Updates']/parent::span")
	public WebElement applyUpdates;

	@FindBy(xpath = "//div[text()='2. Screen']/parent::span[@id='pipeStatusLabel_3']")
	public WebElement status_Screen;

	@FindBy(xpath = "//div[text()='Interview']")
	public WebElement interviewTab;

	@FindBy(xpath = "//span[text()='Save']")
	public WebElement saveButton;

	@FindBy(xpath = "//textarea[@aria-label='The new status will cause the applicant to skip a step. Please enter justification below:']")
	public WebElement justification;
	
	
	
	@FindBy(xpath = "//textarea[@aria-label='Please comment on the status change (optional):']")
	public WebElement justification1;

	@FindBy(xpath = "//input[@name='custcuraddr1']")
	public WebElement houseNumber;

	@FindBy(xpath = "//input[@name='custzip']")
	public WebElement ZipPostCode;

	@FindBy(xpath = "//input[@name='custappcity']")
	public WebElement City;

	@FindBy(xpath = "//div[text()='Offer']")
	public WebElement offerTab;

	@FindBy(xpath = "//select[@class='rcmDropDown sfDropDownContainer']")
	public WebElement statusDropdown;

	@FindBy(xpath = "//label[text()='Sub item:']/following-sibling::select[@class='rcmDropDown sfDropDownContainer']")
	public WebElement statusDropdown2;
	// NEW

	@FindBy(xpath = "//select[@name='custintwsts']")
	public WebElement selectInterviewStatus;

	@FindBy(xpath = "//span[@class='sfDropDownContainer']/child::select[@aria-label='Candidate Sub-Status']")
	public WebElement selectInterviewSubStatus;

	@FindBy(xpath = "//select[@name='custnationality']")
	public WebElement custNationality;

	@FindBy(xpath = "//select[@name='Custedulevel']")
	public WebElement custEduLevel;

	@FindBy(xpath = " //select[@class='rcmDropDown sfDropDownContainer']")
	public WebElement statusDropDown;

	@FindBy(xpath = "//label[text()='Sub item:']/following-sibling::select[@class='rcmDropDown sfDropDownContainer'] ")
	public WebElement statusDropDown2;

	@FindBy(xpath = "//input[@aria-label='Planned Start Date. MM/DD/YYYY']")
	public WebElement jobStartDateCand;

	@FindBy(xpath = "//input[@name='Custtotalsal']")
	public WebElement annualSalary;

	@FindBy(xpath = "//select[@name='Custjoincountry']")
	public WebElement workCountry;

	@FindBy(xpath = "//select[@name='Custstate']")
	public WebElement stateProvince;

	@FindBy(xpath = "//select[@NAME='Custcity']")
	public WebElement custCity;

	@FindBy(xpath = "//select[@NAME='CustOfferTempTyp']")
	public WebElement custOfferType;

	@FindBy(xpath = "//select[@NAME='Custcollegehire']")
	public WebElement custCollege;

	@FindBy(xpath = "//select[@NAME=\"Custpayscaletype\"]")
	public WebElement custPayScale;

	@FindBy(xpath = "//select[@NAME=\"CustOffGrade\"]")
	public WebElement custOffGrade;

	@FindBy(xpath = "//select[@NAME=\"CustOffGlbGrade\"]")
	public WebElement custGloGrade;

	@FindBy(xpath = "//select[@NAME=\"custmycempgroup\"]")
	public WebElement custEmp;

	@FindBy(xpath = "//select[@NAME=\"Custmycempsubgroup\"]")
	public WebElement custSubEmp;

	@FindBy(xpath = "//select[@NAME=\"custmyccontype\"]")
	public WebElement custContType;

	@FindBy(xpath = "//span[text()='Take Action'] ")
	public WebElement takeAction;

	@FindBy(xpath = "//a[text()='Offer']")
	public WebElement selectOffer;

	@FindBy(xpath = "//li[@role='none']/a[text()='Offer Letter']")
	public WebElement selectOfferl;

	@FindBy(xpath = "//select[@id='85_']")
	public WebElement selectTemplate;

	@FindBy(xpath = "//button[text()='Next Step']")
	public WebElement nextStep;

	@FindBy(xpath = "//button[text()='Online Offer']")
	public WebElement onlOffer;

	@FindBy(xpath = "//button[text()='Next']")
	public WebElement clickNext;

	@FindBy(xpath = "//button[text()='Send']")
	public WebElement clickSend;

	// button[text()="I'm Done"]
	@FindBy(xpath = "//button[text()=\"I'm Done\"]")
	public WebElement clickDone;
	
	
	@FindBy(xpath = "//select[@aria-label='Gender']")
	public WebElement genderOnb;
	
	

	@FindBy(xpath = "//input[@aria-label='Date of Birth\\n']")
	public WebElement DOBONB;
	
	@FindBy(xpath = "//select[@aria-label='Marital Status']")
	public WebElement Maritalstatus;
	
	@FindBy(xpath = "//input[@value='Next >>']")
	public WebElement clickNextt;

	@FindBy(xpath = "//input[@aria-label='Offer Letter date. MM/DD/YYYY']")
	public WebElement offerLetterDate;

	// Career Site Offer Accepting

	@FindBy(xpath = " //a[text()='Sign In']")
	public WebElement signIn;

	@FindBy(xpath = "//input[@name='username']")
	public WebElement emailId;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement passwordC;

	@FindBy(xpath = "//button[@onclick='return validateFields();']")
	public WebElement signInc;

	@FindBy(xpath = "//h2[text()='Jobs Applied (1)']")
	public WebElement jobApplied;

	@FindBy(xpath = "//span[text()='Pending offer acceptance']")
	public WebElement acceptOffer;

	@FindBy(xpath = "//a[text()='View/Accept Offer ...']")
	public WebElement acceptOffer1;

	@FindBy(xpath = "//div[text()='Accept Offer']")
	public WebElement acceptOffer2;
	// New

	@FindBy(xpath = "//select[@name='custcountry']")
	public WebElement residingCountry;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateProvince1;

	@FindBy(xpath = "//input[@name='city']")
	public WebElement cityC;

	@FindBy(xpath = "//input[@name='zip']")
	public WebElement postalCode;

	@FindBy(xpath = "//input[@id='163:_input']")
	public WebElement BUBrand;

	@FindBy(xpath = "//li[@id='164:item0']")
	public WebElement BUBrandSh;

	@FindBy(xpath = "//input[@id='175:_input']")
	public WebElement BUArea;

	@FindBy(xpath = "//*[@id='176:container']")
	public WebElement BUAreaSh;

	@FindBy(xpath = "//*[@id=\"__tile0-__container5-dashboardGroups-id-1593941611353-55-id-1593941611359-57\"]")
	public WebElement RecruitApprClick;

	@FindBy(xpath = " //a[contains(text(),'Hiring Manager's Manger')]")
	public WebElement SelectRecruitAppro;

	@FindBy(xpath = "//button[contains(.,'Send to Next Step')]")
	public WebElement SendtoNext;

	@FindBy(xpath = "//textarea[@id='fb2wk_form_p_comment']")
	public WebElement AddComment;

	@FindBy(xpath = "//button[contains(.,'Send to Next Step')]")
	public WebElement SendtoNextC;

	@FindBy(xpath = "//button[@title='Job Sub Category']/..//input")
	public WebElement jobsubcategory;

	@FindBy(xpath = "//li[@id='192:item0']")
	public WebElement jobsubcategorysh;

	@FindBy(xpath = "//select[@name='custoffersts']")
	public WebElement custofferStatus;

	/*
	 * @FindBy(xpath = "//a[@class='jobTitle']") public WebElement jobTitle;
	 */

	// a[@title='Job Requisitions']
	@FindBy(xpath = "//a[@title='Job Requisitions']")
	public WebElement SelectJobreq;

	// input[@id='tor__fvpOfStaffingName_op_text']

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fvpOfStaffingName_op_text']")
	public WebElement OfferManager;

	@FindBy(xpath = "//li[@class='yui-ac-highlight']")
	public WebElement OfferManagerSh;

	@FindBy(xpath = "//input[@id='tor_wf_sect_0_fid']/parent:: span[@tabindex='0']")
	public WebElement getReqId;

	// Career Site Locators
	@FindBy(xpath = "//a[contains(text(), 'account')]")
	public WebElement Create_an_account;

	@FindBy(xpath = "//input[@name='fbclc_userName']")
	public WebElement Enter_Email_Address_NA;

	@FindBy(xpath = "//input[@title='Retype Email Address:']")
	public WebElement ReEnter_Email_Address_NA;

	@FindBy(xpath = "//input[@name='fbclc_pwd']")
	public WebElement Enter_Password1;

	@FindBy(xpath = "//input[@name='fbclc_pwdConf']")
	public WebElement ReEnter_Password2;

	@FindBy(xpath = "//input[@name='fbclc_fName']")
	public WebElement First_Name;

	@FindBy(xpath = "//input[@name='fbclc_lName']")
	public WebElement Last_Name;

	@FindBy(xpath = "//select[@name='fbclc_country']")
	public WebElement Country_Of_Residence;

	@FindBy(xpath = "//a[@aria-label='Terms of Use Read and accept the data privacy statement.']")
	public WebElement Terms_Of_Use;

	@FindBy(xpath = "//button[text()='Accept']")
	public WebElement Accept_Terms;

	@FindBy(xpath = "//button[@name='fbclc_createAccountButton']")
	public WebElement Click_Create_Account;

	@FindBy(xpath = "//Select[@id='fbclc_ituCode']")
	public WebElement Country_RegionCode;

	@FindBy(xpath = "//input[@name='reqnumber']")
	public WebElement ReqIDInput;

	@FindBy(xpath = "//button[text()='Search Jobs']")
	public WebElement SearchJobs;
	
	@FindBy(xpath = "//a[text()='Select Action']")
	public WebElement SelectAction;

	@FindBy(xpath = "//a[text()='Apply']")
	public WebElement apply;

	@FindBy(xpath = "//a[contains(text(), 'Create an account')]")
	public WebElement create_Account;

	@FindBy(xpath = "//input[@title='Please enter phone number']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//span[@role='button']/..//span[@id='34:_attachIcon']")
	public WebElement uploadRes;

	@FindBy(xpath = "//input[@name='fileData1']")
	public WebElement uploadDevice;

	@FindBy(xpath = "//select[@name='custage']")
	public WebElement age;

	@FindBy(xpath = "//select[@name='custethnicity']")
	public WebElement ethnicity;

	@FindBy(xpath = "//label[text()='Male']")
	public WebElement GenderM;

	@FindBy(xpath = "//label[text()='Female']")
	public WebElement GenderF;

	@FindBy(xpath = "//select[@name='custorientation']")
	public WebElement Orientation;

//New

	@FindBy(xpath = "//select[@aria-label='Filter Job Requisitions']")
	public WebElement filterJobReq;

	@FindBy(xpath = "//select[@name='custWorking']")
	public WebElement legalEntity;

	@FindBy(xpath = "//select[@name='custLegal']")
	public WebElement AGGREMENT;

	@FindBy(xpath = "//span[text()='Save']")
	public WebElement saveClick;

	@FindBy(xpath = "//span[text()='Apply']")
	public WebElement applyClick;

	@FindBy(xpath = "//select[@name='custoffersts']")
	public WebElement offerStatus;

	@FindBy(xpath = "//em[text()='Louise Walker']")
	public WebElement nameOff;

	@FindBy(xpath = "//select[@aria-label='Candidate Sub-Status']")
	public WebElement candSubStatus;

	@FindBy(xpath = "//select[@aria-label='Offer Letter Validated Required']")
	public WebElement offerLetterValidation;

	@FindBy(xpath = "//select[@name='statusId']")
	public WebElement candStatus;

	@FindBy(xpath = "//div[text()='17.Onboard']")
	public WebElement onBoard;

	@FindBy(xpath = "//a[text()='Initiate Onboarding']/..//a[@role='menuitem']")
	public WebElement initOnBoard;

	@FindBy(xpath = "//button[text()='Confirm']")
	public WebElement confirm;

	@FindBy(xpath = "//button[text()='OK']")
	public WebElement clickOk;

	@FindBy(xpath = "//span[@class='resume']/..//span[@tabindex='0']/..//span[@style='margin-left:3px']")
	public WebElement candidateID;
	// Onboarding Screen Elements
	@FindBy(xpath = "//a[text()='Onboarding']")
	public WebElement Onboarding;

	@FindBy(xpath = "//a[@href=\"javascript:__doPostBack('WorkQueueCounters$WorkQueueSummary$ctl19','')\"]")
	public WebElement Internation_Onboarding;

	@FindBy(xpath = "//select[@name='SearchApplicants$ddlSearchBy']")
	public WebElement Seacrh_By;

	@FindBy(xpath = "//input[@name='SearchApplicants$txtCandidateId']")
	public WebElement Candidate_ID_ONB;

	@FindBy(xpath = "//label[text()='All Activities']/preceding-sibling::input[@value='rdbShowAll']")
	public WebElement All_Activities_Button;

	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement Submit;

	// PHP Screen Elements
	@FindBy(xpath = "//td[@class='cell']/span[text()='Pre Hiring Step']")
	public WebElement PHP_Step;

	@FindBy(xpath = "//select[@aria-label='Geographical Identifier']")
	public WebElement Geographical_Identifier;

	@FindBy(xpath = "//input[@value='Next']")
	public WebElement Next_PHP00;

	@FindBy(xpath = "//div[@class='uploadedFilesListControl']/input[@name='ctl00$ContentPlaceHolder$UserDefinedPanel$FileUpload_82']")
	public WebElement Upload00_PHP;

	@FindBy(xpath = "//div[@class='uploadedFilesListControl']/input[@name='ctl00$ContentPlaceHolder$UserDefinedPanel$FileUpload_82$btnUpload']")
	public WebElement Upload01_PHP;

	@FindBy(xpath = "//div[@class='uploadedFilesListControl']/input[@name='ctl00$ContentPlaceHolder$UserDefinedPanel$FileUpload_76']")
	public WebElement Upload10_PHP;

	@FindBy(xpath = " //div[@class='uploadedFilesListControl']/input[@name='ctl00$ContentPlaceHolder$UserDefinedPanel$FileUpload_76$btnUpload']")
	public WebElement Upload11_PHP;

	@FindBy(xpath = "//input[@value='Finish']")
	public WebElement Finish00;

	@FindBy(xpath = "//div[@class='wizardButtonWrapper']/input[@value='Next >>']")
	public WebElement Next_PHP01;

	@FindBy(xpath = "//input[@value='Finish']")
	public WebElement Finish01;

	//Iframe Locators
	//frame1
	@FindBy(linkText = "International Onboarding")
	public WebElement intOnb;

	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_149']")
	public WebElement localId;
	//NES Link
	
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ucApplicantStartWizard_txtPassword']")
	public WebElement passwordNes;

	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ucApplicantStartWizard_txtPassword2']")
	public WebElement passwordNes1;
	
	@FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolder1_ucApplicantStartWizard_sqaList_DropDownListQuestion1']")
	public WebElement secQuestion;
	
	
	
	
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ucApplicantStartWizard_sqaList_TextBoxAnswer1']")
	public WebElement secAnswer;
	
	@FindBy(xpath = "//*[@text()='Start Employee Wizard']")
	public WebElement  clickStartEm;
	
	@FindBy(xpath = "//input[@value='Next >>']")
	public WebElement next;
	
	//new
	
	@FindBy(xpath = "//div[text()='1. New Application']")
	public WebElement newApplication;
	
	
	@FindBy(xpath = "//button[text()='Filter Options']")
	public WebElement filterEmailID;
	
	

	@FindBy(xpath = "//input[@name='none#contactEmail']")
	public WebElement candidateEmailID;
	
	
	@FindBy(xpath = "//button[text()='Apply']")
	public WebElement applyEmail;
	
	
	@FindBy(xpath = "//select[@id='84_']")
	public WebElement offerLanguage;
	
	
	@FindBy(xpath = "//button[text()='Clear']")
	public WebElement clickClear;
	
	
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_FileUpload_161']")
	public WebElement uploadFile;
	
	
	@FindBy(xpath = "//input[@value='Upload']")
	public WebElement upload;
	
	
	@FindBy(xpath = "//button[text()='Ok']")
	public WebElement clickOKc;
	
	//ONB SPOC Verification Elements
	@FindBy(xpath = "//span[text()='ONB SPOC Verification(USA)']")
	public WebElement clickONBSPOC;
	
	@FindBy(xpath = "//select[@aria-label='Provisioning Level']")
	public WebElement selectProvision;
	
	@FindBy(xpath = "//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_DropDownList_168']")
	public WebElement pushHRMS ;
	
	 //Full Provisioning
	
	
	
	
	By clickOnPSD = By.xpath("//span[text()='Planned Start Date(UK)']");
	By plannedStartDate = By.xpath("//input[@aria-label='Planned Start Date']");
	
	By repushHRMS = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_DropDownList_198']");
	
	//NESProcess
	
	By title= By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_135_BizxPickList_135_ddl']");
	
	By prefFirstName= By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_91']");
	
	By gender = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_139_BizxPickList_139_ddl ']");
	
	By date = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_DatePicker_112_txtDateValue']");
	
	By maritalStatus= By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_137_BizxPickList_137_ddl']");
	
	By homePhone = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_85']");
	
	By selectNo = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_120_1']");
	
	By religion = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_145_BizxPickList_145_ddl']");
	
	By sexualOrientation = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_147_BizxPickList_147_ddl']");
	
	By nationalInsurance = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_172']");
	
	By contactName = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_139']");
	
	By relationship = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_163']");
	
	By mobile = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_TextBox_143']");
	
	By selectOptionA = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_8_0']");
	
	By selectFile = By.xpath("//input[@value='Click to select file...']");
	
	By uploadFilee = By.xpath("//input[@value='Upload']");
	
	By selectProof = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_274_BizxPickList_274_ddl']");
	
	By selectVisa = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_BizxPickList_276_BizxPickList_276_ddl']");
	
	By selectvalueA = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_27_0']");
	
	
	By selectvalueB= By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_27_1']");
	
	
	By selectvalueC = By.xpath("//select[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_27_2']");
	
	
	By selectPlan1 = By.xpath("//input[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_1136_0']");
	
	By selectPlan2 = By.xpath("//input[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_RadioButton_1136_1']");
	
	By selectPic = By.xpath("//input[@id=\"ctl00_ContentPlaceHolder_UserDefinedPanel_FileUpload_8\"]");
	
	By uploadPic = By.xpath("//input[@id='ctl00_ContentPlaceHolder_UserDefinedPanel_FileUpload_8_btnUpload']");
	
	By clickonUpload = By.xpath("//input[@value='Finish']");
	
	//new
	@FindBy(xpath = "//select[@name='custperstitle']")
	public WebElement perstitle;
	
	@FindBy(xpath = "//select[@name='custnationality']")
	public WebElement nationality;
	
	//Offer 
		//Intern Valid Until
		
		@FindBy(xpath = "//input[@aria-label='Valid Until. MM/DD/YYYY']")
		public WebElement ValidUntil;
	
		
		@FindBy(xpath = "//select[@name='custVisaUS']")
		public WebElement StatusVisa;
		
	
		@FindBy(xpath = "//select[@name='CustNAUpdateTTC']")
		public WebElement semiMonth;
	
	
		

		@FindBy(xpath = "//select[@name='CustOffTempBGV']")
		public WebElement BGVReq;
		@FindBy(xpath = "//select[@name='CustLevelGrade']")
		public WebElement TTCgrade;
		
		@FindBy(xpath = "//select[@name='CustOffdesig']")
		public WebElement Designation1;
		
		
		

		@FindBy(xpath = "//em[@class='surjhighlight']")
		public WebElement Offerselect;
		
		
		@FindBy(xpath = "//a[text()='Clear Filters']")
		public WebElement clearfilter;
		
		
	
	
	
	
	
	
	
	
	
}
