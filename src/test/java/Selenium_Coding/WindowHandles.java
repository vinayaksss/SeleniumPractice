package Selenium_Coding;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowHandles {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		/*Single Window
		
		System.out.println("Parent Window Page Tittle:"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id='newWindowBtn']")).click();
		String windowname=driver.getWindowHandle();
		String pageTittle=driver.switchTo().window(windowname).getTitle();
		System.out.println("Child Window Page Tittle: "+pageTittle);
		Thread.sleep(2000);
		//String childtext=driver.findElement(By.xpath("//*[@class='basicControls']/h1")).getText();
		//System.out.println("Child page text"+childtext);
		driver.switchTo().defaultContent();
		String Parenttext=driver.findElement(By.xpath("//*[@class='post-head']/h1")).getText();
		System.out.println("Parent page text"+Parenttext);*/
		
		//Multiple Window 
		
		System.out.println("Parent Window Page Tittle:"+driver.getTitle());
		//driver.findElement(By.xpath("//*[@id='newTabsBtn']")).click();
		driver.findElement(By.xpath("//*[@id='newTabsWindowsBtn']")).click();
		//driver.findElement(By.xpath("//*[@id='newWindowsBtn']")).click();
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);
		List<String> handlesList = new ArrayList<>(windows);
		for(String windowsNames:windows) {
			
			String pageTittle=driver.switchTo().window(windowsNames).getTitle();
			System.out.println("Page Tittle"+pageTittle);
		}
		
		String secondWindow =driver.switchTo().window(handlesList.get(1)).getTitle();
		System.out.println("Using List "+secondWindow);
		
		
		
		Iterator<String> it= windows.iterator();
		String firstwind=it.next();
		String secwind=it.next();
		String thrdwind=it.next();
		String thr=driver.switchTo().window(thrdwind).getTitle();
		System.out.println("Iterator 3rd window "+thr);
	driver.quit();
	}

}
