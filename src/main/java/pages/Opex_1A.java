package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectSpecification.ProjectSpecification;

public class Opex_1A extends ProjectSpecification {

    By clickrow = By.xpath("//td[contains(.,'1')]");
    By insertnewrow = By.xpath("//a[contains(.,'Insert a new row after')]");
    By DepartmentName = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Human Resources']");
    By businessUnit = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Sales and Marketing']");
    By projectCode = By.xpath("//div[@class='jdropdown-item']/child::div[text()='demo project']");
    By location = By.xpath("//div[@class='jdropdown-item']/child::div[text()='Pune']");
    Actions actions = new Actions(driver);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    WebElement department = wait.until(
        ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2)")));

    WebElement businessunit = wait.until(
        ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)")));

    WebElement project_code = wait.until(
        ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(4)")));

    WebElement Location = wait.until(
        ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(5)")));

    public Opex_1A clickrow() throws Exception {

        Thread.sleep(5000);
        WebElement m = driver.findElement(clickrow);
        actions.contextClick(m).perform();
        click(driver.findElement(insertnewrow));
        return this;
    }


    public Opex_1A addDepartment() throws Exception {
        actions.doubleClick(department).perform();
        click(driver.findElement(DepartmentName));
        return this;

    }
    public Opex_1A addbusinessUnit() throws Exception {

        actions.doubleClick(businessunit).perform();
        click(driver.findElement(businessUnit));
        return this;
    }
    public Opex_1A addprojectCode() throws Exception {

        actions.doubleClick(project_code).perform();

        click(driver.findElement(projectCode));
        return this;
    }

    public Opex_1A addLocation() throws Exception {

        actions.doubleClick(Location).perform();
        click(driver.findElement(location));
        return this;
    }
    public Opex_1A addGLAccounts() throws Exception {

        WebElement GLaccounts = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(6)")));
        actions.doubleClick(GLaccounts).perform();
        driver.findElement(By.xpath("//div[@class='jdropdown-item']/child::div[text()='Disposal commitments']")).click();

        WebElement Vendor = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(7)")));
        actions.doubleClick(Vendor).sendKeys("amazon").perform();

        WebElement ItemDescription = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(8)")));
        actions.doubleClick(ItemDescription).sendKeys("Pen").perform();

        WebElement Business_Justification = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(9)")));
        actions.doubleClick(Business_Justification).sendKeys("Projectneed").perform();

        WebElement Project_name = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(10)")));
        actions.doubleClick(Project_name).sendKeys("MSCIQ").perform();

        WebElement Amount = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(11)")));
        actions.doubleClick(Amount).sendKeys("5000").perform();

        WebElement Month = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(12)")));
        actions.doubleClick(Month).perform();
        driver.findElement(By.xpath("//div[@class='jdropdown-item']/child::div[text()='MAY']")).click();

        WebElement Year = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("tbody tr:nth-child(2) td:nth-child(13)")));
        actions.doubleClick(Year).perform();
        driver.findElement(By.xpath("//div[@class='jdropdown-item']/child::div[text()='2023']")).click();

        driver.findElement(By.xpath("//div[@class='MuiBox-root css-k008qs']/button[2]")).click();

        Thread.sleep(1000);

        return this;
    }

}