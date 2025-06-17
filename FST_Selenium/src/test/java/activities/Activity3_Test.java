package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/login-form/");
		
		//3. page interactions
		
		//print the page title
		System.out.println(driver.getTitle());  

		//Find the username field using any locator and enter "admin" into it.
		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		
		//Find the password field using any locator and enter "password" into it.
		//driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		//Find the "Log in" button using any locator and click it.
		//driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		driver.findElement(By.xpath("//button[@class='svelte-1pdjkmx']")).click();
		
		//find the success message
		//String message = driver.findElement(By.tagName("h1")).getText();
		String message = driver.findElement(By.xpath("//h1[contains(@class,'text-emerald-500')]")).getText();
		System.out.println("upon click = " + message);
		System.out.println("Login successful? - " + message.equals("Login Success!"));
		
		//4. close the browser
		driver.quit();

	}
}
