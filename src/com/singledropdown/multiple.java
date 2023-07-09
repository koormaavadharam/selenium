package com.singledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		WebElement heros = driver.findElement(By.id("superheros"));
		
		Select s=new Select(heros);
		
		boolean multiple = s.isMultiple();
		
	
		
		if (multiple==true) {
			
			s.selectByValue("bt");
			s.selectByVisibleText("Daredevil");
			s.selectByIndex(7);
			Thread.sleep(5000);
			s.deselectAll();
		}
		
		//List<WebElement> options = s.getOptions();
		
		//for (WebElement i : options) {
			
			//System.out.println(i.getText());
			
		}
		

		//WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		//System.out.println(firstSelectedOption.getText());
		
	}


