package Selenium_Coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.gherkin.Argument;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TextEnterWithoutSndKeys {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("APjFqb"));
		JavascriptExecutor jc= (JavascriptExecutor)driver; 
		
		jc.executeScript("arguments[0].value='Testing'", ele);
		
			
			
	}

}
