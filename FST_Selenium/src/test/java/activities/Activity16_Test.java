package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//find no.of rows an cols
//find and click add row
//find newly added row and add following data:
//		id = 10
//		book name= Hover Car Racer
//		author= MAthew REilly
//		ASIN= 0330440168
//		price= $7.99
		
public class Activity16_Test {
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
		
		//find and click add row
		WebElement add_row = driver.findElement(By.xpath("//button[text()='Add Row +']"));
		Actions builder = new Actions(driver);
		builder.click(add_row).build().perform();
		
		//find newly added row and add following data:
//		id = 10
//		book name= Hover Car Racer
//		author= MAthew REilly
//		ASIN= 0330440168
//		price= $7.99
		WebElement last_row_id = driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]"));
		driver.findElement(By.xpath("//table/tbody/tr[last()]/td[1]")).clear();
		last_row_id.sendKeys("10");
		
		WebElement last_row_bookname = driver.findElement(By.xpath("//table/tbody/tr[last()]/td[2]"));
		driver.findElement(By.xpath("//table/tbody/tr[last()]/td[2]")).clear();
		last_row_bookname.sendKeys("Hover Car Racer");
		
		WebElement last_row_author = driver.findElement(By.xpath("//table/tbody/tr[last()]/td[3]"));
		driver.findElement(By.xpath("//table/tbody/tr[last()]/td[3]")).clear();
		last_row_author.sendKeys("MAthew Reilly");
		
		WebElement last_row_ASIN = driver.findElement(By.xpath("//table/tbody/tr[last()]/td[4]"));
		driver.findElement(By.xpath("//table/tbody/tr[last()]/td[4]")).clear();
		last_row_ASIN.sendKeys("0330440168");
		
		WebElement last_row_price = driver.findElement(By.xpath("//table/tbody/tr[last()]/td[5]"));
		driver.findElement(By.xpath("//table/tbody/tr[last()]/td[5]")).clear();
		last_row_price.sendKeys("$7.99");
		
		System.out.println("In a line = " + driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());

		driver.quit();

	}
}
