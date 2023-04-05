package base;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	public static RemoteWebDriver driver;
	
	public RemoteWebDriver startApp() {
		
		ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(co);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://qa.msciq.io/login");
		return driver;
	}
	
	public void type(WebElement e, String str) {
		e.sendKeys(str);	
		
	}
	public void clear(WebElement e) {
		e.clear();
	}
	public void click(WebElement e)
	{
		e.click();
	}
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	public void quitApp() {
		//driver.quit();
	}

}
