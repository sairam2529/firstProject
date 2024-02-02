package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSiteAutomation extends commonWebMethods{
	
	private PageObjects pageobjects;
	
	

	@Test
	public void automationEndtoEnd() throws Exception {
		NavigatingtoUrl();
		System.out.println("Page Title: "+getTitle());
		pageobjects= PageFactory.initElements(driver, PageObjects.class);
		
		pageobjects.buttons("Ind");
		
		WebElement dropdownele= driver.findElement(By.id("dropdown-class-example"));
		selectdropdown(dropdownele, 1);
		pageobjects.switchTab();
		System.out.println("Title of Child Window: "+getTitle());
		Thread.sleep(2000);
		String Actual= pageobjects.alertUsage("Sairam");
		System.out.println("Alert Msg: "+Actual);
		Assert.assertEquals(Actual, "Hello Sairam, share this practice page and share your knowledge");
		alertAccept();
		scrolling(0, 900);
		Thread.sleep(2000);
		movetoElement(pageobjects.mousehoverele);
		pageobjects.mouseHoverElements();
		
		
		Thread.sleep(5000);
	}
}
