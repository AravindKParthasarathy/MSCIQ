package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class AllocationGroup extends ProjectSpecification {
	
Actions actions = new Actions(driver);
	
	String bcname = "BCAK";
	//By name = By.id("//input[@id='name']");
	
	WebElement GLdropdown= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".select__input-container.css-19bb58m")));
	 WebElement enter= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='select__input']")));
    
	
	By saveBtn = By.xpath("//button[text()='Save']");
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	
	 public AllocationGroup addName() throws Exception {

		 driver.findElement(By.id("name")).sendKeys(bcname);
		    return this;

		  }
	
	public AllocationGroup enterGL() throws Exception
	{
		GLdropdown.click();
		enter.sendKeys("Revaluation");
		Thread.sleep(5000);
		enter.sendKeys( Keys.RETURN);
		return this;
	}
	
	public AllocationGroup saveBC() throws Exception
	{
		click(driver.findElement(saveBtn));
		return this;
	}
	

}
