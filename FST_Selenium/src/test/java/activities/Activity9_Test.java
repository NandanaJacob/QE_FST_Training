package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		WebElement text = driver.findElement(By.xpath("//h1[contains(@class, 'text-4xl font-semibold')]"));
		
		Actions builder = new Actions(driver);
		builder.sendKeys("Hi hello").build().perform();
		System.out.println(text.getText());
		

		driver.quit();

	}
}
