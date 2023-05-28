package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class Project extends ProjectSpecification {

	
	String projectName = "AKMOT";
	String projectCode = "AKMOT";
	
	 WebElement ProjectCode= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[3]")));
	 
	 WebElement ProjectName= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[4]")));
	 WebElement BusinessUnit = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[5]")));
	 By BusinessUnitName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Sales and Research']");
	 
	 WebElement ProductGroup = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[6]")));
	 By ProductGroupName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Produt Group1']");
	 
	 WebElement ProfitCenter = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[7]")));
	 By ProfitCenterName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Profilt Center1']");
	 	
	 WebElement ProjectOwnerName = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[8]")));
	 
	 WebElement ProjectOwnerEmail = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[9]")));
	 
	 WebElement activeFrom= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[10]")));
		By saveBtn = By.xpath("//button[text()='Save']");
		
	 
	 Actions actions = new Actions(driver);
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	
	public Project projectCode() throws Exception {
			
		 actions.doubleClick(ProjectCode).sendKeys(projectCode).perform();
		 
        
        return this;

    }
	
	public Project projectName() throws Exception {
		
		 actions.doubleClick(ProjectName).sendKeys(projectName).perform();
		 
       
       return this;

   }
	
	public Project businessUnit() throws Exception {
		
		 actions.doubleClick(BusinessUnit).perform();
	        click(driver.findElement(BusinessUnitName));
	        return this;   

  }
	
	public Project productGroup() throws Exception {
		
		 actions.doubleClick(ProductGroup).perform();
	        click(driver.findElement(ProductGroupName));
	        return this;   

 }
	
	public Project profitCenter() throws Exception {
		
		 actions.doubleClick(ProfitCenter).perform();
	        click(driver.findElement(ProfitCenterName));
	        return this;   

}
	
	public Project projectOwnerName() throws Exception {
		
		 actions.doubleClick(ProjectOwnerName).sendKeys("King Cloud").perform();
		 
     
     return this;

 }
	
	public Project projectOwnerEmail() throws Exception {
		
		 actions.doubleClick(ProjectOwnerEmail).sendKeys("KingCloud@gmail.com").perform();
		 
    
    return this;

}
	
	public Project activeFrom() throws Exception {
		
		 actions.doubleClick(activeFrom).sendKeys("04/01/2023").perform();
		 
      
      return this;

  }
	
	public Project clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
	
		return this;
	}

}
