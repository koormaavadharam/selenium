package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	private static Object object;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		
		driver.switchTo().frame(singleframe);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		textbox.sendKeys("Hi this is vishal");
		
		driver.switchTo().defaultContent();
		
		//multiple frames
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(inner);
		
		WebElement element1 = driver.findElement(By.xpath("(//input[@type='text'])"));
		
		element1.sendKeys("hi");
		
		
		
		
		
		
		
		
		

	}

}
