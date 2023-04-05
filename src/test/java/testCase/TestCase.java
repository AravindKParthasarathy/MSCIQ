package testCase;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.BusinessStructurePage;
import pages.BusinessUnit;
import pages.Company;
import pages.CreateGOC;
import pages.DashBoard;
import pages.Department;
import pages.LoginPage;
import pages.Opex_1A;
import pages.PlanningForecasting;
import pages.UpdateGOCPage;
import projectSpecification.ProjectSpecification;

public class TestCase extends ProjectSpecification {
  String name = "NFGC";
  String code = "NFGC";

  @Test(priority = 1)
  public void testlogin() throws Exception {
    new LoginPage().enterEmail("admin@msciq.io").enterpassword("123456").clickLoginButton();

  }

  @Test(priority = 2)
  public void testBusinessStructure() throws Exception {
  new DashBoard().clickBusinessStructure();
  }
  
  @Test(priority = 3)
  public void testGOC() throws Exception {

    new BusinessStructurePage().clickCompanytab();
    
        new BusinessStructurePage().clickAddBtn();
        new CreateGOC().enterName(name).enterCode(code).SelectCountry().SelectCurrency().clickSaveBtn();
        new BusinessStructurePage().successMSG();

  }
  
  @Test(priority = 4)
  
  public void testCompany() throws Exception {
	  
	  new BusinessStructurePage().clickCompanytab();
	    new BusinessStructurePage().searchGOC();
	    new BusinessStructurePage().choose_GOC_for_creating_Company();
	    new BusinessStructurePage().addCompany();

	    new Company().companyCode();
	    new Company().companyName();
	    new Company().companyCurrency();
	    new Company().companyFiscalYear();
	    new Company().activeFrom();
	    new Company().clickSaveBtn();
  }

    @Test(priority = 5)
    public void testCreateBU() throws Exception {
      new BusinessStructurePage().clickBUtab();
      new BusinessStructurePage().addBU();
      new BusinessUnit().addGOC();
      new BusinessUnit().addBUCODE();
      new BusinessUnit().buName();
      new BusinessUnit().activeFrom();
      new BusinessUnit().clickSaveBtn();
    }

    @Test(priority = 6)
    public void testCreateDepartment() throws Exception {
      new BusinessStructurePage().clickDepartmenttab();
      new BusinessStructurePage().addDepartment();
  
      new Department().departmentCode();
      new Department().departmentName();
      new Department().clickSaveBtn();
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