package com.jse;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		WebElement host = driver.findElement(By.linkText("Host an Amazon Hub"));
		
		js.executeAsyncScript("window.scrollBy(0,10000);");
		
		
		//js.executeScript("arguments[0].scrollIntoView();", host);
		
		//js.executeScript("arguments[0].click();", host);
		
	    
		
	}
		
		
		
		
		

}
