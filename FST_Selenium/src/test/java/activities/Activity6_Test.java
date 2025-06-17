package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
				
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/dynamic-controls");
				
		//print the page title
		System.out.println(driver.getTitle()); 
		
//		Find the checkbox input element.
//		Check if the checkbox is selected and print the result.
		Boolean displayed = driver.findElement(By.id("checkbox")).isSelected();
		System.out.println("Is input selected - " + displayed);
		
		//Click the "Remove Checkbox" button.
		driver.findElement(By.id("checkbox")).click();
		//driver.findElement(By.xpath("//button[@class='svelte-sfj3o4']")).click();
		
		//Check if it is visible again and print the result.
		Boolean displayed_next = driver.findElement(By.id("checkbox")).isSelected();
		System.out.println("Is checkbox selected? - " + displayed_next);
		
		driver.quit();
	}
}
