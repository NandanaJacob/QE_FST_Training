package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
				
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-controls");
			
		//wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//print the page title
		System.out.println(driver.getTitle()); 
		
//		Find the checkbox input element.
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		
		//Click the "Toggle Checkbox" button.
		driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
		
		//wait until checkbox disappears
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
		//click toggle checkbox agqain
		driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
		
		//wait for checkbox to appear
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		
		//click checkbox
		checkbox.click();
		
		driver.quit();
	}
}
