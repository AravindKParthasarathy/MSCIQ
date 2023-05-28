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

public class UpdateCompany extends ProjectSpecification {

	
public UpdateCompany selectCompanyCode() {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
WebElement CompanyCode= wait.until(
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[3]")));

	
	
		
	Actions actions = new Actions(driver);
	
	 Properties prop = ConfigReader.getProperties();
	 String companyCode = prop.getProperty("companyCode");
		
	 actions.doubleClick(CompanyCode).sendKeys(companyCode).perform();
	
		return this;
	}
	
	
}
