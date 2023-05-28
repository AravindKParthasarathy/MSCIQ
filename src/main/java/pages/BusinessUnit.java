package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class BusinessUnit extends ProjectSpecification {
	

	String bucode = "AKPantry";
	String buname = "AKPantry";
	String activefrom = "04/01/2023";
	String goc = "AKGC - AKGC";
	

  static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

  Actions actions = new Actions(driver);

  WebElement GroupofCompany = wait.until(
    ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='spreadsheet']/div[3]/div/div[2]/table/tbody/tr/td[3]")));
  By GOCName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='"+goc+"']");

  WebElement BUCode = wait.until(
    ExpectedConditions.elementToBeClickable(By.cssSelector("#spreadsheet > div.jtabs-content > div > div.jss_content > table > tbody > tr > td:nth-child(4)")));

  By saveBtn = By.xpath("//button[text()='Save']");
  public BusinessUnit addGOC() throws Exception {

    actions.doubleClick(GroupofCompany).perform();
    click(driver.findElement(GOCName));
    return this;

  }

  public BusinessUnit addBUCODE() throws Exception {

    actions.doubleClick(BUCode).sendKeys(bucode).perform();
    return this;

  }

  public BusinessUnit buName() throws Exception {
    WebElement buName = wait.until(
      ExpectedConditions.elementToBeClickable(By.cssSelector("#spreadsheet > div.jtabs-content > div > div.jss_content > table > tbody > tr > td:nth-child(5)")));

    actions.doubleClick(buName).sendKeys(buname).perform();

    return this;

  }
  
  public BusinessUnit activeFrom() throws Exception {
	  WebElement activeFrom= wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[7]")));
	
	  actions.doubleClick(activeFrom).sendKeys(activefrom).perform();
   return this;

}
  
  public BusinessUnit clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
	
		return this;
	}

}