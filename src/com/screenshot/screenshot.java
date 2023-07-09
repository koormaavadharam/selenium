package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.youtube.com/");

driver.manage().window().maximize();

driver.navigate().refresh();

String title = driver.getTitle();

if (title.equalsIgnoreCase("youtube")){
	
	System.out.println("you are in youtube page");
	
}

else {
	
	System.out.println("you are not in youtube page");	
	
	
}

TakesScreenshot ts=(TakesScreenshot) driver;

File s = ts.getScreenshotAs(OutputType.FILE);

File d=new File("C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\screenshot\\youtube.png");

FileUtils.copyFile(s, d);


	}







		


	}
	
			


