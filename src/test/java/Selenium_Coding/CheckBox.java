package Selenium_Coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	private static WebDriver driver;

	static void selectCheckbox() {

		driver.findElement(By.xpath("//*[@class='orangehrm-container']//div[3]//*[@type='checkbox']")).click();
	}

	static void isselectedorNot() {

		WebElement ele = driver.findElement(By.xpath("//*[@class='orangehrm-container']//div[3]//*[@type='checkbox']"));
		System.out.println(ele.isSelected());
	}

	static void deselect() {

		WebElement ele = driver.findElement(By.xpath("//*[@class='orangehrm-container']//div[3]//*[@type='checkbox']"));
		ele.click();
		System.out.println(ele.isSelected());
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']//span[1]")).click();
		CheckBox.selectCheckbox();
		Thread.sleep(1000);
		CheckBox.isselectedorNot();
		Thread.sleep(1000);
		CheckBox.deselect();
		driver.quit();
	}

}
