package pages;

import java.time.Duration;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;


public class UpdateGOCPage extends ProjectSpecification{
	By name = By.xpath("//input[@id='gcName']");
	By code = By.xpath("//input[@id='gcCode']");
	By selectGOCCurrency = By.xpath("//div[@id='mui-component-select-currency']");
	By GOCcurrency = By.xpath("//li[text()='INR']");
	By selectCountry = By.xpath("//div[@id='mui-component-select-country']");
	By country = By.xpath("//li[text()='India']");
	By updateBtn = By.xpath("//button[text()='Update']");
	
//---Have to rework! cant't able to clear the existing text.
//	public UpdateGOCPage enterName(String str) throws InterruptedException, AWTException
//	{
//		click(driver.findElement(name));
//		driver.findElement(name).clear();
//		type(driver.findElement(name), str);
//		return this;
//	}
//	
//	public UpdateGOCPage enterCode(String str) throws InterruptedException
//	{
//		click(driver.findElement(code));
//		driver.findElement(code).clear();
//		type(driver.findElement(code), str);
//		return this;
//	}
	public UpdateGOCPage SelectCurrency()
	
	
	{
		
		

	    WebElement selectCurrency = driver.findElement((By) selectGOCCurrency);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    wait.until(ExpectedConditions.elementToBeClickable(selectCurrency));
	    selectCurrency.sendKeys("INR");
	    selectCurrency.click();
	    
	    WebElement currency = driver.findElement((By) GOCcurrency);
	    wait.until(ExpectedConditions.elementToBeClickable(currency));
	    currency.click();
	    
	
		return this;
	}
	
	
	public UpdateGOCPage SelectCountry()
	{
		click(driver.findElement(selectCountry));
		click(driver.findElement(country));
		return this;
	}
	
	public UpdateGOCPage clickUpdateBtn()
	{
		click(driver.findElement(updateBtn));
		return this;
	}
	

}
	
