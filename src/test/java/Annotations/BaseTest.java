package Annotations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	
	@Test(enabled=false)
	public void initializeBrowser() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
//	@Test(dependsOnMethods={"initializeBrowser"})
	
	
	@Test(dataProvider = "Sample")
	public void dataDriving(String greet,String get,int id) {
		System.out.println(greet+" "+get+" "+id);
	}
	
	@DataProvider(name="Sample")
	public void dataDrive() {
		Object[][] a = {{"Hello","Hi",123},{"Hi","Hello",1}};
		
	}
	
	@Test(enabled=false)
	public void goToUrl() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void fillUpForm(String userName,String email,String password) {
		driver.findElement(By.xpath("//input[@class='form-control ng-dirty ng-valid ng-touched' and @name='name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@class='form-control ng-dirty ng-valid ng-touched' and @name='email']")).sendKeys(email);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"sai","sai@gmail.com","password1"},{"ram","ram@gmail.com","password1"}};
	}
	
	@Test(enabled=false)
	public void closeBrowser() {
		driver.close();
	}

}
