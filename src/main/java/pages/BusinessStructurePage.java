package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import projectSpecification.ProjectSpecification;

public class BusinessStructurePage extends ProjectSpecification{
	By addBtn = By.xpath("//button[text()='+ Add Group of Companies']");
	By GOC = By.xpath("//span[text()='Group of Company']");
	By clickCompany = By.xpath("//span[text()='Company']");
	By successMsg = By.xpath("//div[text()='Group company added successfully.']");
	By clickBUtab = By.xpath("//button[contains(.,'Business Unit')]");
	By clickCompanytab = By.xpath("//button[contains(.,'Company')]");
	By tableHead = By.xpath("//tr[contains(@class, 'MuiTableRow-root')]/child::th/child::div[contains(text(),'Group')]");
	By tableBody = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]/preceding-sibling::td");
	By editBtn = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]//button[@aria-label='Edit']");
	By header = By.xpath("//div[contains(@class,'MuiBox-root')]/child::header");
	By delete = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]//button[@aria-label='Delete']");
	By yesDelete = By.xpath("//button[text()='Yes, Delete']");
	By addBU = By.xpath("//button[contains(.,'+ Add Business Unit')]");
	By clickDepartmentab = By.xpath("//button[contains(.,'Department')]");
	By addDepartment = By.xpath("//button[contains(.,'+ Add Department')]");
	By addCompany = By.xpath("//button[contains(.,'+ Add Company')]");
	By chooseexistingGOC = By.xpath("//div[@class='MuiGrid-root MuiGrid-item css-1wxaqej']/p[text()='MSTS']");
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
	
	
	public BusinessStructurePage clickLocation() {
		WebElement spanname = driver.findElement(By.xpath("//span[text()='AGOC - Aravind Group of Companies']"));
		String text = spanname.getText();
		System.out.println(text);
		WebElement iconContainer = driver.findElement(By.cssSelector(".Mui-focused > .MuiTreeItem-iconContainer path"));
		iconContainer.click();
		return this;
		
	}
	
	  public BusinessStructurePage clickCompanytab() throws Exception {
		  Thread.sleep(5000);
		    click(driver.findElement(clickCompanytab));
		    return this;
		  }
	
	  public BusinessStructurePage choose_GOC_for_creating_Company() throws Exception {
		  Thread.sleep(5000);
		    click(driver.findElement(chooseexistingGOC));
		    return this;
		  }
	  
	  public BusinessStructurePage searchGOC() throws Exception {
		  Thread.sleep(5000);
		    driver.findElement(searchGOC).sendKeys("MSTS");;
		    return this;
		  }
	  
	  public BusinessStructurePage clickBUtab() throws Exception {
		  Thread.sleep(5000);
		    click(driver.findElement(clickBUtab));
		    return this;
		  }
	  
	  public BusinessStructurePage clickDepartmenttab() throws Exception {
		  Thread.sleep(5000);
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(header));
		Robot bot = new Robot();
		bot.mouseMove(1104, 328);
		click(driver.findElement(delete));
		click(driver.findElement(yesDelete));
		return this;
	}

}
