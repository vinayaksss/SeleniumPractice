package Selenium_Coding;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	private static WebDriver driver;
	static void findallLinks() throws IOException {
		List<WebElement>listofLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement list:listofLinks) {
			String urls=list.getAttribute("href");
			try {
			URL url= new URL(urls);
			
		HttpsURLConnection connection=(HttpsURLConnection)url.openConnection();	
		
		connection.setConnectTimeout(2000);
		connection.connect();
		
		if(connection.getResponseCode()>=400) {
			
			System.out.println("Broken Link"+url+" "+connection.getResponseMessage());
		}
		else {
			System.out.println("Working Link"+url+" "+connection.getResponseMessage());
		}
		
		}
			catch(Exception e){
				e.printStackTrace();
			}
	}
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://orangehrm.com/");
		Thread.sleep(1000);
		BrokenLinks.findallLinks();
		driver.quit();

	}

}
