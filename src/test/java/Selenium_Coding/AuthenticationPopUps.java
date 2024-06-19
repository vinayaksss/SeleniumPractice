package Selenium_Coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Practice websites – Show notification- https://www.redbus.in/ Location
		 * notification- https://whatmylocation.com/ Media notification-
		 * https://mictests.com/
		 */	
		
		/*ChromeOptions is a class in Selenium WebDriver that is used to 
		customize and configure various options for the Chrome browser before launching it.
		This allows you to set preferences, manage extensions, disable features, and perform other configurations that 
		can control the behavior and characteristics of the Chrome browser instance during testing*/
		
		
		ChromeOptions opt= new ChromeOptions();
		//this for show notification
		//opt.addArguments("--disable-notifications");
		
	//	opt.addArguments("disable-geolocation");
		opt.addArguments("disable-media-stream");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.redbus.in/");
		//	driver.get("https://whatmylocation.com/");
		
		driver.get("https://mictests.com/");
		driver.findElement(By.xpath("//*[@id='mic-launcher']")).click();
		
	
	
	
	}

}
