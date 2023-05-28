package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class BusinessStructurePage extends ProjectSpecification{
	By addBtn = By.xpath("//button[text()='+ Add Group of Companies']");
	By GOC = By.xpath("//span[text()='Group of Company']");
	By addGOC = By.xpath("//button[contains(.,'+ Add Group of Companies')]");
	By clickCompany = By.xpath("//span[text()='Company']");
	By successMsg = By.xpath("//div[text()='Group company added successfully.']");
	By clickBUtab = By.xpath("//button[contains(.,'Business Unit')]");
	By clickCompanytab = By.xpath("//button[contains(.,'Company')]");
	By tableHead = By.xpath("//tr[contains(@class, 'MuiTableRow-root')]/child::th/child::div[contains(text(),'Group')]");
	By tableBody = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]/preceding-sibling::td");
	By editBtn = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]//button[@aria-label='Edit']");
	By GOCEdit = By.xpath("//*[@id=\"table-scrollbar\"]/div/div[2]/div/div/div/table/tbody/tr[2]/td[5]/div/div/div[1]/button");
	By GOCDelete = By.xpath("//*[@id=\"table-scrollbar\"]/div/div[2]/div/div/div/table/tbody/tr[2]/td[5]/div/div/div[2]/button");
	By header = By.xpath("//div[contains(@class,'MuiBox-root')]/child::header");
	By delete = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]//button[@aria-label='Delete']");
	By yesDelete = By.xpath("//button[text()='Delete']");
	By addBU = By.xpath("//button[contains(.,'+ Add Business Unit')]");
	By clickDepartmentab = By.xpath("//button[contains(.,'Department')]");
	By addDepartment = By.xpath("//button[contains(.,'+ Add Department')]");
	By addCompany = By.xpath("//button[contains(.,'+ Add Company')]");
	By addLocation = By.xpath("//button[contains(.,'+ Add Location')]");
	By addProject = By.xpath("//button[contains(.,'Add Project')]");
	By fiscalCalendar = By.xpath("//button[contains(.,'+ Add Fiscal Calender')]");
	By addAllocationGroup = By.xpath("//button[contains(.,'+ Add Account Group')]");
	By addBudgetCategory = By.xpath("//button[contains(.,'+ Add Budget Category')]");
	By chooseexistingGOC = By.xpath("//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']/p[text()='AKGC']");
	By chooseexistingcompany = By.xpath("//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']/p[text()='AKMOT - AKMOT']");
	By searchGOC = By.id("filled-search");
	public BusinessStructurePage clickAddBtn()
	{
		
		
		click(driver.findElement(addBtn));
		return this;
	}
	
	public BusinessStructurePage clickGOC() {
		click(driver.findElement(GOC));
		return this;
		
	}
	
	public BusinessStructurePage clickCompany() {
		click(driver.findElement(clickCompany));
		return this;
		
	}
	
	public BusinessStructurePage addGOC() {
		click(driver.findElement(addGOC));
		return this;
		
	}
	
	
	public BusinessStructurePage clickLocation() {
		WebElement spanname = driver.findElement(By.xpath("//span[text()='AKGC - Aravind Group of Companies']"));
		String text = spanname.getText();
		System.out.println(text);
		WebElement iconContainer = driver.findElement(By.cssSelector(".Mui-focused > .MuiTreeItem-iconContainer path"));
		iconContainer.click();
		return this;
		
	}
	
	  public BusinessStructurePage clickCompanytab() throws Exception {
		  Thread.sleep(2000);
		    click(driver.findElement(clickCompanytab));
		    return this;
		  }
	
	  public BusinessStructurePage choose_GOC_for_creating_Company() throws Exception {
		  Thread.sleep(3000);
		    click(driver.findElement(chooseexistingGOC));
		    return this;
		  }
	  
	  public BusinessStructurePage choose_Company_for_creating_Location() throws Exception {
		  Thread.sleep(3000);
		    click(driver.findElement(chooseexistingcompany));
		    return this;
		  }
	  
	  
	  public BusinessStructurePage searchGOC(String str) throws Exception {
		  Thread.sleep(2000);
		    driver.findElement(searchGOC).sendKeys(str);;
		    return this;
		  }
	  
	  public BusinessStructurePage clickGOCedit() throws Exception {
		  Thread.sleep(2000);
		    
		    WebElement editIcon = driver.findElement(GOCEdit);
		    Actions action = new Actions(driver);
		    action.moveToElement(editIcon).perform();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(editIcon));
		    editIcon.click();
		    return this;
		  }
	  
	  
	
	  
	  public BusinessStructurePage clickBUtab() throws Exception {
		  Thread.sleep(2000);
		    click(driver.findElement(clickBUtab));
		    return this;
		  }
	  
	  public BusinessStructurePage clickDepartmenttab() throws Exception {
		  Thread.sleep(2000);
		    click(driver.findElement(clickDepartmentab));
		    return this;
		  }
	  
	  public BusinessStructurePage addBU() throws Exception {
		    click(driver.findElement(addBU));
		    return this;
		  }
	  
	  public BusinessStructurePage addDepartment() throws Exception {
		    click(driver.findElement(addDepartment));
		    return this;
		  }
	
	  public BusinessStructurePage addCompany() throws Exception {
		    click(driver.findElement(addCompany));
		    return this;
		  }
	  
	  public BusinessStructurePage addLocation() throws Exception {
		    click(driver.findElement(addLocation));
		    return this;
		  }
	  
	  public BusinessStructurePage addProject() throws Exception {
		    click(driver.findElement(addProject));
		    return this;
		  }
	  
	  public BusinessStructurePage addFiscalCalendar() throws Exception {
		    click(driver.findElement(fiscalCalendar));
		    return this;
		  }
	  
	  public BusinessStructurePage addAllocationGroup() throws Exception {
		    click(driver.findElement(addAllocationGroup));
		    return this;
		  }
	  
	  public BusinessStructurePage addBudgetCategory() throws Exception {
		    click(driver.findElement(addBudgetCategory));
		    return this;
		  }
	  
	  
	  
	public BusinessStructurePage successMSG()
	{
		System.out.println(driver.findElement(successMsg).getText());
		return this;
	}
	
	public BusinessStructurePage clickCreatedGOC(String str)
	{
		By createdGOCName = By.xpath("//span[contains(text(), '"+str+"')]");
		click(driver.findElement(createdGOCName));
		return this;
	}
	
	public BusinessStructurePage printCreatedGOC() {
		List<WebElement> title = driver.findElements(tableHead);		
		List<WebElement> body = driver.findElements(tableBody);
		for(int i =0; i<title.size(); i++) {
			System.out.println(title.get(i).getText() +" ----- "+body.get(i).getText());
		}
		return this;
	}
	
	public BusinessStructurePage clickEditbtn() throws AWTException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(header));
		Robot bot = new Robot();
		bot.mouseMove(1104, 330);
		click(driver.findElement(editBtn));
		return this;
	}
	
	public BusinessStructurePage deleteGOC() throws AWTException
	{
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(header));
//		Robot bot = new Robot();
//		bot.mouseMove(1104, 328);
//		click(driver.findElement(delete));
		
		
		  WebElement deleteIcon = driver.findElement(GOCDelete);
		    Actions action = new Actions(driver);
		    action.moveToElement(deleteIcon).perform();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(deleteIcon));
		    deleteIcon.click();
		    click(driver.findElement(yesDelete));
		    return this;
		
	}

}
