package testRCM;
import org.testng.annotations.Test;

import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;
import com.newRequisition.screeningCandidate;

public class RCMNewApplicationProcess extends BaseClass {
	
	screeningCandidate sc;
	PageFactoryClass pg;
	
	
	ConfigExcel1 exceldata = new ConfigExcel1();
	@Test
		public void screening() throws Exception {
	            //Open browser
				driver.get(exceldata.getRowAndColumn(0, 1, 1));
				Thread.sleep(2000);
				sc = new screeningCandidate(driver);
				//call the method
				sc.screening();
			
			
}
}
