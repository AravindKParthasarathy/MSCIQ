package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class CreateGOC extends ProjectSpecification {
	By name = By.xpath("//input[@id='gcName']");
	By code = By.xpath("//input[@id='gcCode']");
	By selectGOCCurrency = By.xpath("//div[@id='mui-component-select-currency']");
	By GOCcurrency = By.xpath("//li[text()='ALL']");
	By selectCountry = By.xpath("//div[@id='mui-component-select-country']");
	By countryname = By.xpath("//li[text()='United States']");
	By saveBtn = By.xpath("//button[text()='Save']");
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	public CreateGOC enterName(String str)
	{
		type(driver.findElement(name), str);
		return this;
	}
	
	public CreateGOC enterCode(String str)
	{
		type(driver.findElement(code), str);
		return this;
	}
	public CreateGOC SelectCurrency() throws Exception
	{
//		click(driver.findElement(selectCurrency));
//		click(driver.findElement(currency));
		 WebElement selectCurrency = driver.findElement((By) selectGOCCurrency);
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	
		    wait.until(ExpectedConditions.elementToBeClickable(selectCurrency));
		    
		    selectCurrency.click();
		   
		  
//		    selectCurrency.sendKeys("ALL");
		    
		    WebElement currency = driver.findElement((By) GOCcurrency);
		    wait.until(ExpectedConditions.elementToBeClickable(currency));
		    currency.click();
		
		return this;
	}
	
	
	public CreateGOC SelectCountry() throws Exception
	{
//		click(driver.findElement(selectCountry));
//		click(driver.findElement(countryname));
		
		
		 WebElement selectCurrency = driver.findElement((By) selectCountry);
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	
		    wait.until(ExpectedConditions.elementToBeClickable(selectCountry));
		    Thread.sleep(5000);
		    selectCurrency.sendKeys("United");
		    selectCurrency.click();
		    
		    WebElement country = driver.findElement((By) countryname);
		    wait.until(ExpectedConditions.elementToBeClickable(country));
		    country.click();
		
		return this;
	}
	
	public CreateGOC clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
		return this;
	}
	
	
	

}
