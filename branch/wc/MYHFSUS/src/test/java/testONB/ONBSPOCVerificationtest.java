package testONB;

import org.testng.annotations.Test;

import com.BasePages.ConfigExcel1;
import com.newRequisition.ONBSPOCVerification;

import testRCM.BaseClass;


public class ONBSPOCVerificationtest extends BaseClass{
    
	
	ONBSPOCVerification ONB;
	ConfigExcel1 exceldata = new ConfigExcel1();
  @Test
  public void testONBSPOCProcess() throws Exception {
	//Open browser
	  driver.get(exceldata.getRowAndColumn(0, 1, 1));
	
	  ONB= new ONBSPOCVerification(driver);
	  
	  ONB.ONBSPOCVerify();
	  
	 
  }
}
