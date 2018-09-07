package PracticeCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DargAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anjur/Desktop/Anju/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https:jqueryui.com/droppable");
		
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		
		WebElement Target = driver.findElement(By.id("draggable"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		Actions build = new Actions(driver);
		build.clickAndHold(Target).build().perform();
		build.moveToElement(Destination).build().perform();
		build.release(Destination).build().perform();
		driver.quit();
		
	}
	

}
