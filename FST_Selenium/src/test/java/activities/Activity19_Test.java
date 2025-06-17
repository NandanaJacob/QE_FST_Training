package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//Open a new browser to https://training-support.net/webelements/selects
//Get the title of the page and print it to the console.
//On the Multi Select:
//Select the "HTML" option using the visible text.
//Select the 4th, 5th and 6th options using the index.
//Select the "Node" option using the value.
//Deselect the 5th option using index.
//Close the browser.

public class Activity19_Test {
	public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/selects");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		WebElement multiple_dropdown = driver.findElement(By.cssSelector("select.h-80"));
		Select select = new Select(multiple_dropdown);
		
		select.deselectAll();
		
		//Select the "HTML" option using the visible text.
		select.selectByVisibleText("HTML");
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement option: selectedOptions) {
			System.out.println(option.getText());
		}
		
		//Select the 4th, 5th and 6th options using the index.
		System.out.println("Select the 4th, 5th and 6th options using the index.");
		select.selectByIndex(3);
		select.selectByIndex(4);
		select.selectByIndex(5);
		List<WebElement> selectedOptions2 = select.getAllSelectedOptions();
		for(WebElement option: selectedOptions2) {
			System.out.println(option.getText());
		}
		
		//Select the "Node" option using the value.
		System.out.println("Select the \"Node\" option using the value.");
		select.selectByValue("nodejs");
		List<WebElement> selectedOptions3 = select.getAllSelectedOptions();
		for(WebElement option: selectedOptions3) {
			System.out.println(option.getText());
		}
		
		//Deselect the 5th option using index.
		System.out.println("Deselect the 5th option using index.");
		select.deselectByIndex(4);
		List<WebElement> selectedOptions4 = select.getAllSelectedOptions();
		for(WebElement option: selectedOptions4) {
			System.out.println(option.getText());
		}
		
	
		driver.quit();

	}
}
