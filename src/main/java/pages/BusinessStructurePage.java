package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import projectSpecification.ProjectSpecification;

public class BusinessStructurePage extends ProjectSpecification{
	By addBtn = By.xpath("//button[text()='+ Add']");
	By GOC = By.xpath("//span[text()='Group of Company']");
	By successMsg = By.xpath("//div[text()='Group company added successfully.']");
	By tableHead = By.xpath("//tr[contains(@class, 'MuiTableRow-root')]/child::th/child::div[contains(text(),'Group')]");
	By tableBody = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]/preceding-sibling::td");
	By editBtn = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]//button[@aria-label='Edit']");
	By header = By.xpath("//div[contains(@class,'MuiBox-root')]/child::header");
	By delete = By.xpath("(//tbody[contains(@class, 'MuiTableBody-root')])[1]//td[5]//button[@aria-label='Delete']");
	By yesDelete = By.xpath("//button[text()='Yes, Delete']");
	
	public BusinessStructurePage clickAddBtn()
	{
		click(driver.findElement(addBtn));
		return this;
	}
	
	public BusinessStructurePage clickGOC() {
		click(driver.findElement(GOC));
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
