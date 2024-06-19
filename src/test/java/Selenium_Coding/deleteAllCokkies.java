package Selenium_Coding;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deleteAllCokkies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies);
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("NID");
		Set<Cookie> cookies1=driver.manage().getCookies();
		System.out.println(cookies1);
	}

}
