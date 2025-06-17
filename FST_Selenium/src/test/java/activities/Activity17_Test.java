package activities;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity17_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/sliders");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		//print default
		WebElement text = driver.findElement(By.xpath("//div[contains(@class,'border-purple-600 bg-purple-200')]"));
		System.out.println("default = " + text.getText());
		
		//get cursor object
		WebElement slider = driver.findElement(By.id("volume"));
		Actions builder = new Actions(driver);
		builder.click(slider).clickAndHold(slider).moveByOffset(-120, 0).release().build().perform();
		System.out.println("slide left = " + text.getText());
		
		builder.click(slider).clickAndHold(slider).moveByOffset(120, 0).release().build().perform();
		System.out.println("slide right = " + text.getText());
		
		
		driver.quit();

	}
}
