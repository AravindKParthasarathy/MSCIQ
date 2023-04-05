package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import projectSpecification.ProjectSpecification;

public class DashBoard extends ProjectSpecification{
	Actions actions = new Actions(driver);
	WebElement tile = driver.findElement(By.xpath("//div[@class='card-title MuiBox-root css-1itv5e3']/p[text()='Business Structure']"));
//	By cardName = By.xpath("//div[@class='card-title MuiBox-root css-1itv5e3']/p[text()='Business Structure']");
//	By BusinessStructure = By.xpath("//button[text()='Business Structure']");
	By PlanningandForecasting = By.xpath("//button[@type='button']/child::h6[text()='Planning & Forecasting']");
	public DashBoard clickBusinessStructure() throws InterruptedException
	{
		
		actions.moveToElement(tile).perform();
		Thread.sleep(2000);
		actions.click().perform();
		//click(driver.findElement(cardName));
		return this;
		
	}
	
	
	public DashBoard clickplanningandforecasting()
	{
		click(driver.findElement(PlanningandForecasting));
		return this;
		
	}

}
