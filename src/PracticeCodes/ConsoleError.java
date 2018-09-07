package PracticeCodes;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class ConsoleError {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/anjur/Desktop/Anju/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		LogEntries jsError = driver.manage().logs().get(LogType.BROWSER);
		for(LogEntry entry : jsError ) {
			System.out.println(new Date(entry.getTimestamp()) + "" +entry.getLevel());
		}
	}

}
