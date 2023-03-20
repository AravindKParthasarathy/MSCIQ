package pages;

import org.openqa.selenium.By;

import projectSpecification.ProjectSpecification;

public class DashBoard extends ProjectSpecification{
	By cardName = By.xpath("//button[@type='button']/child::h6[text()='Business Structure']");
	By PlanningandForecasting = By.xpath("//button[@type='button']/child::h6[text()='Planning & Forecasting']");
	public DashBoard clickCard()
	{
		click(driver.findElement(cardName));
		return this;
		
	}
	
	
	public DashBoard clickplanningandforecasting()
	{
		click(driver.findElement(PlanningandForecasting));
		return this;
		
	}

}
