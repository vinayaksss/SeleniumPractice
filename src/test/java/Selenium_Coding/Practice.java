package Selenium_Coding;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	private static WebDriver driver;

	
	static void screenShot() throws IOException {
		
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File path=new File("C:\\Users\\svinayak\\eclipse-workspace\\Selenium_Practices\\ScreenShot\\page.png");
		FileUtils.copyFile(src, path);
		
		
		
		
	}

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://orangehrm.com/");
			Thread.sleep(1000);
			Practice.screenShot();

	}

}
