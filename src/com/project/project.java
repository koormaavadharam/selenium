package com.project;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rollinss");
		driver.findElement(By.id("password")).sendKeys("Qwerty12");

		driver.findElement(By.id("login")).click();

		WebElement location = driver.findElement(By.id("location"));

		Select s1 = new Select(location);
		s1.selectByValue("Melbourne");

		WebElement hotels = driver.findElement(By.id("hotels"));

		Select s2 = new Select(hotels);
		s2.selectByVisibleText("Hotel Creek");

		WebElement room = driver.findElement(By.id("room_type"));

		Select s3 = new Select(room);
		s3.selectByVisibleText("Standard");

		WebElement roomnumber = driver.findElement(By.xpath("//select[@id='room_nos']"));

		Select s4 = new Select(roomnumber);
		s4.selectByValue("4");

		Thread.sleep(5000);

		driver.findElement(By.id("datepick_in")).clear();

		driver.findElement(By.id("datepick_in")).sendKeys("6/10/2022");

		Thread.sleep(5000);

		driver.findElement(By.id("datepick_out")).clear();

		driver.findElement(By.id("datepick_out")).sendKeys("7/10/2022");

		WebElement perroom = driver.findElement(By.id("adult_room"));

		Select s5 = new Select(perroom);
		s5.selectByVisibleText("3 - Three");

		WebElement croom = driver.findElement(By.id("child_room"));

		Select s6 = new Select(croom);
		s6.selectByVisibleText("2 - Two");

		driver.findElement(By.id("Submit")).click();

		driver.findElement(By.id("radiobutton_0")).click();

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("first_name")).sendKeys("rollins");

		driver.findElement(By.id("last_name")).sendKeys("roy");

		driver.findElement(By.id("address")).sendKeys("abcd");

		driver.findElement(By.name("cc_num")).sendKeys("1234567899876543");

		WebElement ccv = driver.findElement(By.id("cc_type"));

		Select s7 = new Select(ccv);
		s7.selectByVisibleText("American Express");

		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));

		Select s8 = new Select(expirymonth);
		s8.selectByVisibleText("February");

		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));

		Select s9 = new Select(expiryyear);
		s9.selectByVisibleText("2013");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));

		cvv.sendKeys("123");

		driver.findElement(By.id("book_now")).click();

		driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();

		driver.findElement(By.xpath("(//input[@name='ids[]'])[1]")).click();

		driver.findElement(By.xpath("(//input[@name='ids[]'])[3]")).click();

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\screenshot\\screenshot.png");
		FileUtils.copyFile(s, d);

		driver.findElement(By.xpath("//input[@name='logout']")).click();
		
		

	}

}
