package testCase;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.ConfigReader;
import pages.AllocationGroup;
import pages.BudgetCategory;
import pages.BusinessStructurePage;
import pages.BusinessUnit;
import pages.Company;
import pages.CreateGOC;
import pages.DashBoard;
import pages.Department;
import pages.FiscalCalendar;
import pages.Location;
import pages.LoginPage;
import pages.Opex_1A;
import pages.PlanningForecasting;
import pages.Project;
import pages.UpdateGOCPage;
import projectSpecification.ProjectSpecification;

public class TestCase extends ProjectSpecification {
    String name = "AKGC";
    String code = "AKGC";

    @BeforeSuite
    public void loadConfig() throws Exception {
        Properties prop = new Properties();
        FileInputStream input = new FileInputStream("C:\\Users\\Windows\\git\\MSCIQ\\TestData.properties");
        prop.load(input);
        ConfigReader.setProperties(prop);
    }

    @Test(priority = 0)
    public void testlogin() throws Exception {

        Properties prop = ConfigReader.getProperties();
        String username = prop.getProperty("user_name");
        String password = prop.getProperty("password");
        new LoginPage().enterEmail(username).enterpassword(password).clickLoginButton();


    }

    @Test(priority = 1)
    public void testBusinessStructure() throws Exception {
    new DashBoard().clickBusinessStructure();

    }

    @Test(priority = 2)
    public void GOC_Creation() throws Exception {


        new BusinessStructurePage().addGOC();
        Properties prop = ConfigReader.getProperties();
        String gcname = prop.getProperty("gcname");
        String gccode = prop.getProperty("gccode");
        new CreateGOC().enterName(gcname).enterCode(gccode).SelectCurrency().SelectCountry().clickSaveBtn();
        

        new BusinessStructurePage().successMSG();
        driver.navigate().refresh();
    }
    
    
    @Test(priority = 3)
    public void testPrintCreatedGOC() throws Exception {
    	
    	 Properties prop = ConfigReader.getProperties();
         String gcname = prop.getProperty("gcname");
         new BusinessStructurePage().searchGOC(gcname);
         new BusinessStructurePage().clickGOCedit();
         
    }

    @Test(priority = 4)
    public void testUpdateGOC() throws InterruptedException, AWTException {
        new UpdateGOCPage().SelectCountry();
        new UpdateGOCPage().SelectCurrency();
        new UpdateGOCPage() .clickUpdateBtn();
        driver.navigate().refresh();


    }
    @Test(priority = 5)
    public void testDeleteGOC() throws Exception {
    	 Properties prop = ConfigReader.getProperties();
         String gcname = prop.getProperty("gcname");
         Thread.sleep(03000);
         new BusinessStructurePage().searchGOC(gcname);
        new BusinessStructurePage().deleteGOC();
    }

//    @Test(priority = 4)
//
//    public void testCompany() throws Exception {
//
//        new BusinessStructurePage().clickCompanytab();
//        new BusinessStructurePage().searchGOC();
//        new BusinessStructurePage().choose_GOC_for_creating_Company();
//        new BusinessStructurePage().addCompany();
//
//        new Company().companyCode();
//        new Company().companyName();
//        new Company().companyCurrency();
//        new Company().companyFiscalYear();
//        new Company().activeFrom();
//        new Company().clickSaveBtn();
//    }
//
//    @Test(priority = 5)
//
//    public void testLocation() throws Exception {
//
//        new BusinessStructurePage().clickCompanytab();
//        new BusinessStructurePage().searchGOC();
//        new BusinessStructurePage().choose_GOC_for_creating_Company();
//        new BusinessStructurePage().choose_Company_for_creating_Location();
//        new BusinessStructurePage().addLocation();
//        new Location().locationCode();
//        new Location().locationName();
//        new Location().locationAddresss();
//        new Location().country();
//        new Location().activeFrom();
//        new Company().clickSaveBtn();
//    }
//
//    @Test(priority = 6)
//    public void testCreateBU() throws Exception {
//        new BusinessStructurePage().clickBUtab();
//        new BusinessStructurePage().addBU();
//        new BusinessUnit().addGOC();
//        new BusinessUnit().addBUCODE();
//        new BusinessUnit().buName();
//        new BusinessUnit().activeFrom();
//        new BusinessUnit().clickSaveBtn();
//    }
//
//    @Test(priority = 7)
//    public void testCreateDepartment() throws Exception {
//        new BusinessStructurePage().clickDepartmenttab();
//        new BusinessStructurePage().addDepartment();
//        new Department().departmentCode();
//        new Department().departmentName();
//        new Department().clickSaveBtn();
//    }
//
//    @Test(priority = 8)
//    public void testCreateProject() throws Exception {
//        driver.get("http:qa.msciq.iomaster-data-managementcore-biz-dataproject");
//        new BusinessStructurePage().addProject();
//        new Project().projectCode();
//        new Project().projectName();
//        new Project().businessUnit();
//        new Project().productGroup();
//        new Project().profitCenter();
//        new Project().projectOwnerName();
//        new Project().projectOwnerEmail();
//        new Project().activeFrom();
//        new Project().clickSaveBtn();
//    }
//
//    @Test(priority = 9)
//    public void testCreateFiscalCalendar() throws Exception {
//        driver.get("http:qa.msciq.iomaster-data-managementglobal-unitsfiscalCal");
//        new BusinessStructurePage().addFiscalCalendar();
//        new FiscalCalendar().fiscalCalendarKey();
//        new FiscalCalendar().startMonth();
//        new FiscalCalendar().startingDay();
//
//        new FiscalCalendar().clickSaveBtn();
//    }
//
//    @Test(priority = 10)
//    public void addBudgetCategory() throws Exception {
//        driver.get("http:qa.msciq.iomaster-data-managementcore-biz-databudget-category");
//        new BusinessStructurePage().addBudgetCategory();
//        new BudgetCategory().addName();
//        new BudgetCategory().enterGL();
//        new BudgetCategory().saveBC();
//
//    }
//
//    @Test(priority = 10)
//    public void addAllocationGroup() throws Exception {
//        driver.get("http:qa.msciq.iomaster-data-managementcore-biz-dataallocation-account-group");
//        new BusinessStructurePage().addAllocationGroup();
//        new AllocationGroup().addName();
//        new AllocationGroup().enterGL();
//        new AllocationGroup().saveBC();
//
//    }




    

}