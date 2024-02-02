package Automation.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonWebMethods {
	
	public WebDriver driver;
	Actions actions;
	
	
	@BeforeTest
	public void initializeDriver() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public void NavigatingtoUrl() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void movetoElement(WebElement targetElement) {
		actions=new Actions(driver);
		actions.moveToElement(targetElement);
	}
	
	public void selectdropdown(WebElement element,int index) throws Exception {
		Select dropdown=new Select(element);
		Thread.sleep(1000);
		dropdown.selectByIndex(index);
	}
	
	public void scrolling(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	
	
	
	

}
