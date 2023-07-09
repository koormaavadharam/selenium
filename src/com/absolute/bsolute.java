package com.absolute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bsolute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  WebDriverWait w=new WebDriverWait(driver, 20);
	  
	  w.until(ExpectedConditions.visibilityOf(null));
	  
	  w.until(ExpectedConditions.invisibilityOf(null));
	 
		
		driver.findElement(By.linkText("Gift Cards")).click();
		
		
		WebElement registry = driver.findElement(By.xpath("(/html/body/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div/div/div/a)[2]"));
		
		registry.click();
			
          
	}

}
