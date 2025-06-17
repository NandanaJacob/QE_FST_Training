package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Open a new browser to https://training-support.net/webelements/dynamic-controls
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the text field.
//Check if the text field is enabled and print it.
//Click the "Enable Input" button to enable the input field.
//Check if the text field is enabled again and print it.
//Close the browser.

public class Activity7_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
				
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-controls");
						
		//print the page title
		System.out.println(driver.getTitle()); 
		
		//Find the text field.
		Boolean displayed = driver.findElement(By.id("textInput")).isEnabled();
		System.out.println("Is input enabled - " + displayed);
		
		driver.findElement(By.id("textInputButton")).click();
		//driver.findElement(By.xpath("//button[@class='svelte-sfj3o4']")).click();
		
		//Check if it is visible again and print the result.
		Boolean displayed_next = driver.findElement(By.id("textInput")).isEnabled();
		System.out.println("Is checkbox enabled? - " + displayed_next);
		
		driver.quit();
	}
}
