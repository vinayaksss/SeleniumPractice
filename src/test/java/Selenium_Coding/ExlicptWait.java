package Selenium_Coding;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExlicptWait {
	public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://seleniumpractise.blogspot.com/");
	WebElement ele=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	ele.click();
	//WebDriverWait wait= WebDriverWait(driver,20);
	Wait<WebDriver>wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.alertIsPresent());
	//some diff methods 
	wait.until(ExpectedConditions.visibilityOf(ele));
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	Alert ale= driver.switchTo().alert();
	System.out.println(ale.getText());
	ale.accept(); 
	driver.quit();
	
	
	
	
	
}



}