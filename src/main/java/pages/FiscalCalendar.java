package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class FiscalCalendar extends ProjectSpecification{
	

	String fckey = "AKP1";
	String startday = "1";
	
	 WebElement fiscalCalendarKey= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[3]")));
	 
	 WebElement startMonth = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[4]")));
	 By monthName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Jan']");
	 
	 	
	 WebElement startingDay = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[7]")));
	
		By saveBtn = By.xpath("//button[text()='Save']");
		
	 
	 Actions actions = new Actions(driver);
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	
	public FiscalCalendar fiscalCalendarKey() throws Exception {
			
		 actions.doubleClick(fiscalCalendarKey).sendKeys(fckey).perform();
		 
        
        return this;

    }
	
	public FiscalCalendar startMonth() throws Exception {
		
		 actions.doubleClick(startMonth).perform();
	        click(driver.findElement(monthName));
	        return this;  
		

   }
	
	public FiscalCalendar startingDay() throws Exception {
		
		 actions.doubleClick(startingDay).sendKeys(startday).perform();
		 
       
       return this;

   }
	
	
	
	public FiscalCalendar clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
	
		return this;
	}

}
