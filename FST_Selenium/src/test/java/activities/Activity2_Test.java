package activities;

import java.time.Duration;

import org.openqa.selenium.By;

//Open a new browser to https://training-support.net/webelements/login-form/
//Get the title of the page and print it to the console.
//Find the username field using any locator and enter "admin" into it.
//Find the password field using any locator and enter "password" into it.
//Find the "Log in" button using any locator and click it.
//Close the browser.

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/login-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//3. page interactions
		
		//print the page title
		System.out.println(driver.getTitle());  

		//Find the username field using any locator and enter "admin" into it.
		driver.findElement(By.id("username")).sendKeys("admin");
		//u can also do:
//		WebElement element = driver.findElement(By.id("username"));
//		element.sendKeys("name");
		
		//Find the password field using any locator and enter "password" into it.
		driver.findElement(By.id("password")).sendKeys("password");
		
		//Find the "Log in" button using any locator and click it.
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		//find the success message
		String message = driver.findElement(By.tagName("h1")).getText();
		System.out.println("upon click = " + message);
		System.out.println("Login successful? - " + message.equals("Login Success!"));
		
		//4. close the browser
		driver.quit();

	}
}
