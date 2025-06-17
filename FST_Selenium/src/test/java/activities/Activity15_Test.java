package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Open a new browser to https://training-support.net/webelements/dynamic-attributes
//Get the title of the page and print it to the console.
//Find the input fields and type in the required data in the fields.
//Wait for success message to appear and print it to the console.
//Close the browser.

public class Activity15_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
						
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-attributes");
					
		//3. wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//print the page title
		System.out.println(driver.getTitle()); 
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name-')]")).sendKeys("name");
		driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("some@mail.com");
		driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2025-06-19");
		driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]")).sendKeys("random details");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		System.out.println(message);
		
		driver.quit();
	}
}
