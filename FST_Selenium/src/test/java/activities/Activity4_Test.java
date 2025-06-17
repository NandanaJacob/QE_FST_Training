package activities;

//import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

//Open a new browser to https://training-support.net/webelements/target-practice
//Get the title of the page and print it to the console.
//Using xpath:
//Find the 3rd header on the page and print it's text to the console.
//Find the 5th header on the page and print it's color.
//Using any other locator:
//Find the purple button and print all it's classes.
//Find the slate button and print it's text.
//Close the browser.

public class Activity4_Test {
	public static void main(String[] args) {
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/target-practice");
		
		//print the page title
		System.out.println(driver.getTitle()); 
		
		//Find the 3rd header on the page and print it's text to the console.
		String message = driver.findElement(By.xpath("//h3[contains(@class,'text-orange-600')]")).getText();
		System.out.println("Text of 3rd header= " + message);
		
		//Find the 5th header on the page and print it's color.
		String colour = driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color");
		Color proper_color_name = Color.fromString(colour); //to print as hex value
		System.out.println("Color of header #5 = " + colour);
		System.out.println("Color of header #5 as hex= " + proper_color_name.asHex());
		System.out.println("Color of header #5 as rgb= " + proper_color_name.asRgb());
		
		//Find the purple button and print all it's classes.
		String classes = driver.findElement(By.className("bg-purple-200")).getDomAttribute("class");
		System.out.println("classes of purple button = " + classes);
		
		//Find the slate button and print it's text.
		String slate_text = driver.findElement(By.className("bg-slate-200")).getText();
		System.out.println("text of slate button = " + slate_text);
		
		driver.quit();
		
	}
	
}
