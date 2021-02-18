package testRCM;

import org.testng.annotations.Test;

import com.BasePages.ConfigExcel1;
import com.BasePages.PageFactoryClass;
import com.newRequisition.RCMOfferProcess;
import com.newRequisition.screeningCandidate;

public class OfferProcess extends BaseClass {
	screeningCandidate sc;
	RCMOfferProcess op;
	PageFactoryClass pg;
	
	
	ConfigExcel1 exceldata = new ConfigExcel1();
	@Test
		public void offer() throws Exception {
	            //Open browser
				driver.get(exceldata.getRowAndColumn(0, 1, 1));
				Thread.sleep(2000);
				op= new RCMOfferProcess(driver);
				//call the method
				op.Offerprocess();
}
}