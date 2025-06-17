package activities;

//Using Selenium:
//
//Open the training support site. (https://training-support.net)
//
//Print the title of the page
//
//Click the about us button
//
//Print the title of the new page

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1_Test {
	public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/");
		
		//3. page interactions
		
		//print the page title
		System.out.println(driver.getTitle());  

		
		//4. close the browser
		driver.quit();

	}
}
