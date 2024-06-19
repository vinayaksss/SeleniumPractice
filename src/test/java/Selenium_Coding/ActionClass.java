package Selenium_Coding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Actions actions = new Actions(driver);
		//WebEleemnts
		
		WebElement source = driver.findElement(By.id("sourceElement"));
		WebElement target = driver.findElement(By.id("targetElement"));
		WebElement element = driver.findElement(By.id("WebElement"));
		
		
		
		//DoubleClick
		actions.doubleClick(element).perform();
		
		//DragAndDrop
		actions.dragAndDrop(source, target).perform();
		
		//Right Click
		actions.contextClick().perform();
		
		//mouse hover
		
		actions.moveToElement(element).perform();
		
		//Keys Actions
		
		actions.keyDown(Keys.ALT.SHIFT.DELETE).perform();
		
		actions.keyUp(Keys.ARROW_LEFT).sendKeys("A").perform();
		
		actions.clickAndHold().perform();
		actions.moveToLocation(12, 23).perform();
		
		actions.scrollByAmount(0, 0).click();
		actions.scrollFromOrigin(null, 0, 0).perform();
		
		actions.scrollToElement(element).perform();

	}

}
