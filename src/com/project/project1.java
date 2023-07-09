package com.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement signup = driver.findElement(By.className("login"));

		signup.click();

		driver.findElement(By.id("email_create")).sendKeys("vishalrajagopalan22@gmail.com");

		driver.findElement(By.id("SubmitCreate")).click();

		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("rollins");

		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("roy");

		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Qwerty12");

		WebElement date = driver.findElement(By.id("days"));

		Select s1 = new Select(date);

		s1.selectByValue("7");

		WebElement months = driver.findElement(By.xpath("//select[@name='months']"));

		Select s2 = new Select(months);

		s2.selectByValue("3");

		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));

		Select s3 = new Select(years);

		s3.selectByValue("2019");

		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("rollins");

		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("roy");

		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("velacherry");

		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");

		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));

		Select s4 = new Select(state);

		s4.selectByValue("6");
		
		driver.findElement(By.xpath("")).sendKeys("chennai");

	}

}
