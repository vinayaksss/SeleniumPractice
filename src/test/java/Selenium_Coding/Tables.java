package Selenium_Coding;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {
	
	private static WebDriver driver;
	static void getAlltablevalues() {
		List<WebElement>table= driver.findElements(By.xpath("//*[@role='columnheader']"));
		
		//List<WebElement>table1= driver.findElements(By.xpath("//*[@class='oxd-table-body']//div[1]"));
		System.out.println(table.size());
		for(WebElement ts:table) {
			String Headers=ts.getText();
			if(Headers.equals("Employee Name")) {
				List<WebElement>table1= driver.findElements(By.xpath("//*[@class='oxd-table-body']//div[4]"));
				for(WebElement tss:table1) {
					String colvalues=tss.getText();
					//System.out.println(Headers);
					System.out.println(Headers+" "+colvalues);
			}
		}
		}
	
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
			Tables.getAlltablevalues();
			driver.quit();	

	}

}
