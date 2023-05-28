package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class Location extends ProjectSpecification {


	String locationFullName = "LosAngels";
	String locationCode = "LA";
	String locationAddressinput = "LA";
	 WebElement LocationCode= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[3]")));
	 
	 WebElement locationName= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[4]")));
	 WebElement locationAddress= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[5]")));
	 
	 WebElement fiscalYear = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[6]")));
	 By fiscalYearName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='FC01']");
	 
	 WebElement location = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[6]")));
	 By dropdownlocationName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='United States']");
	 
	 WebElement activeFrom= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[9]")));
		By saveBtn = By.xpath("//button[text()='Save']");
		
	 
		
	 Actions actions = new Actions(driver);
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	
	public Location locationCode() throws Exception {
			
		 actions.doubleClick(LocationCode).sendKeys(locationCode).perform();
		 
        
        return this;

    }
	
	public Location locationName() throws Exception {
		
		 actions.doubleClick(locationName).sendKeys(locationFullName).perform();
		 
       
       return this;

   }
	
	public Location locationAddresss() throws Exception {
		
		 actions.doubleClick(locationAddress).sendKeys(locationAddressinput).perform();
		 
      
      return this;

  }
	
	public Location country() throws Exception {
		
		 actions.doubleClick(location).perform();
	        click(driver.findElement(dropdownlocationName));
	        return this;   

 }
	
	public Location activeFrom() throws Exception {
		
		 actions.doubleClick(activeFrom).sendKeys("04/01/2023").perform();
		 
      
      return this;

  }
	
	public Location clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
	
		return this;
	}

}

