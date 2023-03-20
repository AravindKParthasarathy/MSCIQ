package pages;

import org.openqa.selenium.By;

import projectSpecification.ProjectSpecification;

public class PlanningForecasting extends ProjectSpecification {

	By Forecast = By.xpath("//button[contains(.,'Forecast')]");
	
	
	public PlanningForecasting clickforecasttile()
	{
		click(driver.findElement(Forecast));
		return this;
	}
}
