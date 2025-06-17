package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Open a new browser to https://training-support.net/webelements/dynamic-controls
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the checkbox input element.
//Check if it is visible on the page.
//Click the "Remove Checkbox" button.
//Check if it is visible again and print the result.
//Close the browser.

public class Activity5_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
				
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-controls");
				
		//print the page title
		System.out.println(driver.getTitle()); 
		
		//Find the checkbox input element.
		//Check if it is visible on the page.
		Boolean displayed = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println("Is checkbox visible? - " + displayed);
		
		//Click the "Remove Checkbox" button.
		driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
		//driver.findElement(By.xpath("//button[@class='svelte-sfj3o4']")).click();
		
		//Check if it is visible again and print the result.
		Boolean displayed_next = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println("Is checkbox visible? - " + displayed_next);
		
		driver.quit();
	}
}
