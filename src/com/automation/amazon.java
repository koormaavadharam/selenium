package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("http://www.amazon.in/");
driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com/");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.navigate().back();
driver.navigate().refresh();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());

Thread.sleep(5000);
WebElement mobiles = driver.findElement(By.xpath("(//a[@tabindex='0'])[6]"));
mobiles.click();
WebElement oneplus = driver.findElement(By.xpath("//span[text()='OnePlus']"));

oneplus.click();

	}
}


	
	
	
	


