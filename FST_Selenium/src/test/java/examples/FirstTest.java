package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	public static void main(String[] args) {
		
		//1. initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriver chromeDriver = new ChromeDriver();
		WebDriver edgeDriver = new EdgeDriver();
		
		//2. open the browser or page
		driver.get("https://training-support.net/");
		chromeDriver.get("https://training-support.net/");
		edgeDriver.get("https://training-support.net/");
		
		//3. page interactions
		
		//print the page title
		System.out.println(driver.getTitle());  //return a string value
		System.out.println(chromeDriver.getTitle());
		System.out.println(edgeDriver.getTitle());
		
		
		//4. close the browser
		//driver.close() closes the "Active" tab
		//driver.quit() closes every driver window open i.e. all firefox windows
		driver.quit();
		chromeDriver.quit();
		edgeDriver.quit();;
	}
}
