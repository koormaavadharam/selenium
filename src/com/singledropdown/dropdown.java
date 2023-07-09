package com.singledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("vishal");
		
		driver.findElement(By.name("lastname")).sendKeys("raj");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("123455666");
		
		driver.findElement(By.id("password_step_input")).sendKeys("asdfghj");
		
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s=new Select(day);
		
		s.selectByIndex(20);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s1=new Select(month);
		
		s1.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s2=new Select(year);
		
		s2.selectByVisibleText("2014");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		signup.click();
		
		System.out.println(signup.getText());
		
		


	}

}
