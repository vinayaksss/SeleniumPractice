package Selenium_Coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
    private static WebDriver driver;

	
	 static void mouseHover() throws InterruptedException {
		
		driver.get("https://export.ebay.com/in/");
		Actions act= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@class='desktop-menu__links']//div[3]"));
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
				
				
	}
	 
	 static void doubleClick() throws InterruptedException {
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Actions act= new Actions(driver);
			WebElement ele=driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
			Thread.sleep(2000);
			act.doubleClick(ele).perform();
			Thread.sleep(2000);
					
					
		}
	 
	 static void rightClick() throws InterruptedException {
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Actions act= new Actions(driver);
			WebElement ele=driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
			Thread.sleep(2000);
			act.contextClick(ele).perform();
			Thread.sleep(2000);
					
					
		}


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//MouseActions.mouseHover();
		
		//MouseActions.doubleClick();
		MouseActions.rightClick();
		driver.quit();	
		

}

}
