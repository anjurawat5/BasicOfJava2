package PracticeCodes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anjur/Desktop/Anju/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0,500)");
		driver.close();
		
	}

}
