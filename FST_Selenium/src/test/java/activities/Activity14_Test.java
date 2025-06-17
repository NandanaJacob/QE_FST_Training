package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//Open a new browser to https://training-support.net/webelements/tables
//Get the title of the page and print it to the console.
//Using xpaths on the table:
//Find the number of rows and columns in the table and print them.
//Find and print the Book Name in the 5th row.
//Click the header of the Price column to sort it in ascending order.
//Find and print the Book Name in the 5th row again.
//Close the browser.

public class Activity14_Test {
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
		
		//Find and print the Book Name in the 5th row.
		WebElement row5_book = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		System.out.println("book name before sorting = " + row5_book.getText());
		
		//Click the header of the Price column to sort it in ascending order.
		WebElement price = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
		System.out.println("");
		Actions builder = new Actions(driver);
		builder.click(price).build().perform();
		
		//Find and print the Book Name in the 5th row again.
		WebElement row5_book_sort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		System.out.println("book name after sorting = " + row5_book_sort.getText());

		driver.quit();

	}
}
