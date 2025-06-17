package activities;

//Open a new browser to https://training-support.net/webelements/dynamic-content
//Get the title of the page and print it to the console.
//On the page, perform:
//Find and click the "Click me!" button.
//Wait till the word "release" appears.
//Get the text and print it to console.
//Close the browser.

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
				
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-content");
			
		//wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//print the page title
		System.out.println(driver.getTitle()); 
		
		//Find and click the "Click me!" button.
		driver.findElement(By.id("genButton")).click();
		
		//Wait till the word "release" appears.
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
		
		//Get the text and print it to console.
		String text = driver.findElement(By.id("word")).getText();
		System.out.println("Text is = " + text);

		
		driver.quit();
	}
}
