package activities;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

//Open a new browser to https://training-support.net/webelements/tables
//Get the title of the page and print it to the console.
//Using xpaths on the table:
//Find the number of rows and columns in the table and print them.
//Find and print all the cell values in the third row of the table.
//Find and print the cell value at the second row second column.
//Close the browser.

public class Activity13_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/tables");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		//Find the number of rows and columns in the table and print them.
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("No.of rows = " + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("No.of cols = " + cols.size());
		
		System.out.println("values of 3rd row = ");
		List<WebElement> row3_values = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for(WebElement value : row3_values) {
			System.out.println(value.getText());
		}
		System.out.println("In a line = " + driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
		
		//Find and print the cell value at the second row second column.
		WebElement table_2_2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println("table[2][2] = " + table_2_2.getText());
		

		driver.quit();

	}
}
