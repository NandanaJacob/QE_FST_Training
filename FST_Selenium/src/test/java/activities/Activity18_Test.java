package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//Open a new browser to https://training-support.net/webelements/selects
//Get the title of the page and print it to the console.
//On the Single Select:
//Select the second option using the visible text.
//Select the third option using the index.
//Select the fourth option using the value.
//Get all the options and print them to the console.
//Close the browser.

public class Activity18_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/selects");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		//Select the second option using the visible text.
		WebElement single_dropdown = driver.findElement(By.xpath("//select"));
		Select select = new Select(single_dropdown);
		select.selectByVisibleText("One");
		
		WebElement message = driver.findElement(By.xpath("//p[contains(text(),'You have selected:')]"));
		System.out.println(message.getText());
		
		//Select the third option using the index.
		select.selectByIndex(2);
		System.out.println(message.getText());
		
		//Select the fourth option using the value.
		select.selectByValue("three");
		System.out.println(message.getText());
		
		//Get all the options and print them to the console.
		List<WebElement> options = select.getOptions();
		for(WebElement option: options) {
			System.out.println(option.getText());
		}
		driver.quit();

	}
}
