package activities;

//Open a new browser to https://training-support.net/webelements/drag-drop
//Get the title of the page and print it to the console.
//On the page, perform:
//Find the ball and simulate a click and drag to move it into "Dropzone 1".
//Verify that the ball has entered Dropzone 1.
//Once verified, move the ball into "Dropzone 2".
//Verify that the ball has entered Dropzone 2.
//Close the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/drag-drop");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		//Find the ball and simulate a click and drag to move it into "Dropzone 1".
		WebElement ball = driver.findElement(By.id("ball"));
		WebElement drop1 = driver.findElement(By.id("dropzone1"));
		Actions builder = new Actions(driver);
		builder.click(ball).dragAndDrop(ball, drop1).build().perform();
		//Verify that the ball has entered Dropzone 1.
		String message = drop1.getText();
		System.out.println("Is it dropped in zone1? - " + message.equals("Dropped!"));
		
		//Once verified, move the ball into "Dropzone 2".
		WebElement drop2 = driver.findElement(By.id("dropzone2"));
		builder.click(ball).dragAndDrop(ball, drop2).build().perform();
		//Verify that the ball has entered Dropzone 2.
		String message2 = drop2.getText();
		System.out.println("Is it dropped in zone2? - " + message2.equals("Dropped!"));
		
		
		driver.quit();

	}
}
