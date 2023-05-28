package pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ConfigReader;
import projectSpecification.ProjectSpecification;

public class Company extends ProjectSpecification {


	
	
	 WebElement CompanyCode= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[3]")));
	 
	 WebElement CompanyName= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[4]")));
	 WebElement companyCurrency = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[5]")));
	 By currencyName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='USD']");
	 	
	 WebElement fiscalYear = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[6]")));
	 By fiscalYearName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='FC01']");
	 
	 WebElement activeFrom= wait.until(
		        ExpectedConditions.elementToBeClickable(By.cssSelector("#spreadsheet > div.jtabs-content > div > div.jss_content > table > tbody > tr > td:nth-child(8)")));
		By saveBtn = By.xpath("//button[text()='Save']");
		
	 
	 Actions actions = new Actions(driver);
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	
	public Company companyCode() throws Exception {
		
		 Properties prop = ConfigReader.getProperties();
         String companyCode = prop.getProperty("companyCode");
			
		 actions.doubleClick(CompanyCode).sendKeys(companyCode).perform();
		 
        
        return this;

    }
	
	public Company companyName() throws Exception {
		
		 Properties prop = ConfigReader.getProperties();
         String companyName = prop.getProperty("companyName");
		
		 actions.doubleClick(CompanyName).sendKeys(companyName).perform();
		 
       
       return this;

   }
	
	public Company companyCurrency() throws Exception {
		
		 actions.doubleClick(companyCurrency).perform();
	        click(driver.findElement(currencyName));
	        return this;   

  }
	
	public Company companyFiscalYear() throws Exception {
		
		 actions.doubleClick(fiscalYear).perform();
	        click(driver.findElement(fiscalYearName));
	        return this;   

 }
	
	public Company activeFrom() throws Exception {
		
		 actions.doubleClick(activeFrom).sendKeys("04/01/2023").perform();
		 
      
      return this;

  }
	
	public Company clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
	
		return this;
	}

}

