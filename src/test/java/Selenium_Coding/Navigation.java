package Selenium_Coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("");
		
		driver.navigate().refresh();
		
	}

}
