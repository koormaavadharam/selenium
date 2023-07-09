package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement email =driver.findElement(By.id("email"));
		
		email.sendKeys("vishalrajagopalan22@gmail.com");
		
	WebElement Password= driver.findElement(By.id("pass"));
	
	Password.sendKeys("Vishal$231096");
	
WebElement login=driver.findElement(By.id("loginbutton"));

login.click();

driver.close();

		
		
	}

}
