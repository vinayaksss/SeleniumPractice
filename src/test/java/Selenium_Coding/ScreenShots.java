package Selenium_Coding;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Steps: Takescreenshot interface and upcast with Driver
	//in which format u want screenshot mention using create src using getscreenAs (outType.file)
	//create path using File class to store screen shot 
	//Uing fileUtil copy the file to sc and location
	
	
	driver.get("https://mictests.com/");
	//We need to do type caseting bcoz both are diff interface,if we not uing WebDriver above then no need of typecasting
	WebElement ele=driver.findElement(By.xpath("//*[@id='mic-visualizer']"));
	TakesScreenshot tc=(TakesScreenshot)driver;
	//(To take complete page screenshot)File scr=tc.getScreenshotAs(OutputType.FILE);
	//To take particular section 
	File scr=ele.getScreenshotAs(OutputType.FILE);
	
	File location=new File("C:\\Users\\svinayak\\eclipse-workspace\\Selenium_Practices\\ScreenShot\\loginpage.png");
	FileUtils.copyFile(scr, location);

}
}