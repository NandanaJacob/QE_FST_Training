package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8_Test {
public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/webelements/mouse-events");
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		
		WebElement cargoToml_element = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement cargoLock_element = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		
		Actions builder = new Actions(driver);
		builder.click(cargoLock_element).moveToElement(cargoToml_element).click(cargoToml_element).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//double click on src button. then right click target button and select open
		//print confirmation message
		WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='target']"));
		//WebElement open = driver.findElement(By.cssSelector("span.ml-3"));
		//WebElement open2 = driver.findElement(By.xpath("//span[text()='Open']"));
		
		builder.click(src).moveToElement(target).contextClick(target).perform();
		builder.click(driver.findElement(By.cssSelector("span.ml-3"))).perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//4. close the browser
		//driver.close() closes the "Active" tab
		//driver.quit() closes every driver window open i.e. all firefox windows
		driver.quit();

	}
}
