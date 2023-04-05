package pages;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class Location extends ProjectSpecification {
	Actions actions = new Actions(driver);
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	
	
	public Location clickCompany() {
		click(driver.findElement());
		return this;
		
	}
}
