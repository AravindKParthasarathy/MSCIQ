package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class Department extends ProjectSpecification {
	

	String departmentcode = "Pantry";
	String departmentname = "Pantry";
	String activefrom = "04/01/2023";
	

  static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

  Actions actions = new Actions(driver);

  
  WebElement departmentCode = wait.until(
    ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[3]")));

  By saveBtn = By.xpath("//button[text()='Save']");
  
 

  public Department departmentCode() throws Exception {

    actions.doubleClick(departmentCode).sendKeys(departmentcode).perform();
    return this;

  }

  public Department departmentName() throws Exception {
    WebElement buName = wait.until(
      ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[4]")));

    actions.doubleClick(buName).sendKeys(departmentname).perform();

    return this;

  }
  
//  public Department activeFrom() throws Exception {
//	  WebElement activeFrom= wait.until(
//		        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"spreadsheet\"]/div[3]/div/div[2]/table/tbody/tr/td[7]")));
//	
//	  actions.doubleClick(activeFrom).sendKeys(activefrom).perform();
//   return this;
//
//}
  
  public Department clickSaveBtn()
	{
		click(driver.findElement(saveBtn));
	
		return this;
	}

}