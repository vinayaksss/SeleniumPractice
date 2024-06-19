package Selenium_Coding;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	
	  private static WebDriver driver;
	  
	  static void handleIframes() {
		  List<String>frameValues=new ArrayList<String>();
		  
		  driver.get("https://www.hyrtutorials.com/p/frames-practice.html#google_vignette");
		 List<WebElement>ls=driver.findElements(By.tagName("iframe"));
		for(WebElement id:ls) {
			
			String idvalues=id.getAttribute("id");
			if(idvalues.contains("frm")) {
				frameValues.add(idvalues);
			
				
			}
			
		}
		
		driver.switchTo().frame(frameValues.get(1));
		String str=driver.findElement(By.xpath("//*[@class='post-title entry-title']")).getText();
		System.out.println(str);
	  
	  System.out.println("IframeValues "+frameValues);
	  }

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Iframes.handleIframes();
		driver.quit();
		
		
		
		
	}

}
