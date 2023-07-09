package com.dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men-tshirts");

		driver.manage().window().maximize();

		WebElement dress = driver.findElement(
				By.xpath("(//span[@class='product-strike'])[2]//ancestor::span"));

		dress.click();

	}

}
