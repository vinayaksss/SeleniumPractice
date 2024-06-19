package Selenium_Coding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		//Alert is an interface
		Alert alt= driver.switchTo().alert();
		
		alt.accept();
		
		alt.dismiss();
		
		alt.sendKeys(null);
		
			
				
				

	}

}
