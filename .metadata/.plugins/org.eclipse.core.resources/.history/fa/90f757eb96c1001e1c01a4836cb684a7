package Automation.Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	WebDriver driver;

	public PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='radio1']")
	WebElement radioButton;

	@FindBy(id = "autocomplete")
	WebElement dynamicDropdown;

	@FindBy(xpath = "//li[@class='ui-menu-item']/div[text()='India']")
	WebElement dropdownIndia;

	@FindBy(xpath = "//a[@id='opentab']")
	WebElement openTab;

	@FindBy(id = "name")
	WebElement alertName;
	
	@FindBy(id="alertbtn")
	WebElement alertbutton;
	
	@FindBy(id="mousehover")
	WebElement mousehoverele;
	
	@FindBy(xpath="//div[@class='mouse-hover-content']")
	List<WebElement> elementsMouseHover;
	
	
	public void mouseHoverElements() {
		
		for(int i=0;i<elementsMouseHover.size();i++) {
			System.out.println(elementsMouseHover.get(i));
		}
		
		for(WebElement s: elementsMouseHover) {
			
		}
	}

	public void buttons(String country) throws Exception {
		radioButton.click();
		dynamicDropdown.sendKeys(country);
		Thread.sleep(4000);
		dropdownIndia.click();
	}

	public String alertUsage(String Name) {
		alertName.sendKeys(Name);
		alertbutton.click();
		return driver.switchTo().alert().getText();
	}
	
	

	public void switchTab() {
		openTab.click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		driver.switchTo().window(parentWindow);
	}

}
