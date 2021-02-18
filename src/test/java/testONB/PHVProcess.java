package testONB;

import org.testng.annotations.Test;

import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;
import com.newRequisition.PHVStep;

import testRCM.BaseClass;

public class PHVProcess extends BaseClass {
	
	
	
	ConfigExcel1 exceldata = new ConfigExcel1();
	PHVStep CO;

	@Test
	public void onboarding() throws Exception {
		//Open browser
		driver.get(exceldata.getRowAndColumn(0, 1, 1));
		CO = new PHVStep(driver);
		//call the method
		CO.onboarding();;
		
		
		
	}

}
