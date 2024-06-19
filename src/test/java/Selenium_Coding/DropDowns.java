package Selenium_Coding;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("tshirt");
		Thread.sleep(2000);
		//String str =driver.findElement(By.xpath("//*[@id='nav-flyout-searchAjax']//span[1]")).getText();
		//System.out.println(str);
		List<WebElement>values=driver.findElements(By.xpath("//*[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println(values.size());
		
		for(WebElement valuesofdropdown:values) {
			System.out.println("DropDown values are "+valuesofdropdown.getText());
			
		}
		
		driver.quit();
	}

}
