/**
 *
 */
package testRCM;

import org.testng.annotations.Test;

import com.BasePages.ConfigExcel1;
import com.candidateportal.CareerSite;


public class CareerSiteCandidatePortal extends BaseClass {

	
	CareerSite cs1;
	ConfigExcel1 exceldata =new  ConfigExcel1();

	@Test(priority = 0)
	public void UK_CareerSite_For_ExternalPosting() throws Exception {
		// Enable if u want to run the method individually
		driver.navigate().to(exceldata.getRowAndColumn(0, 6, 1));
		Thread.sleep(3000);
		cs1 = new CareerSite(driver);
		// call the method
		cs1.SelectJob();
		Thread.sleep(2000);
		// call the method
		cs1.CreateNew_account();
		Thread.sleep(3000);
		// call the method
		//cs1.signIn();
		System.out.println("Candidate applied successfully");

	
	}
}
