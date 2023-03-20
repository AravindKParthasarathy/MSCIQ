package testCase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.BusinessStructurePage;
import pages.CreateGOC;
import pages.DashBoard;
import pages.LoginPage;
import pages.Opex_1A;
import pages.PlanningForecasting;
import pages.UpdateGOCPage;
import projectSpecification.ProjectSpecification;

public class TestCase extends ProjectSpecification{
	String name = "samplename008";
	String code = "samplecode008";
	
	//String name1 = "samplename08";
	//String code1 = "samplename08";
	
	@Test (priority = 1)
	public void testCreateGOC() throws Exception {
		
		new LoginPage().enterEmail("admin@msciq.io").enterpassword("123456").clickLoginButton();
		new DashBoard().clickplanningandforecasting();
		new PlanningForecasting().clickforecasttile();
		new Opex_1A().clickrow();
//		new BusinessStructurePage().clickAddBtn().clickGOC();
//		new CreateGOC().enterName(name).enterCode(code).SelectCountry().SelectCurrency().clickSaveBtn();
//		new BusinessStructurePage().successMSG();
		
	}
	
//	@Test (priority = 2)
//	public void testPrintCreatedGOC() throws AWTException {
//		new BusinessStructurePage().clickCreatedGOC(name).printCreatedGOC().clickEditbtn();
//	}
//	
//	@Test (priority =3)
//	public void testUpdateGOC() throws InterruptedException, AWTException {
//		new UpdateGOCPage().SelectCountry().SelectCurrency().clickUpdateBtn();
//		
//	}
//	@Test (priority = 4)
//	public void testDeleteGOC() throws AWTException, InterruptedException
//	{
//		Thread.sleep(3000);
//		refresh();
//		new BusinessStructurePage().clickCreatedGOC(name).deleteGOC();
//	}

}
