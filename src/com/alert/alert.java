package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
		
        driver.manage().window().maximize();
        
    
        
        WebElement alert = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        
        alert.click();
        
        driver.switchTo().alert().accept();
        
        
          boolean selected = alert.isEnabled();
        
         System.out.println(selected);
        
         WebElement timer = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
         
         timer.click();
         
         Thread.sleep(6000);
         
         driver.switchTo().alert().accept();;
         
         WebElement confirm = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
         
         confirm.click();
         
         driver.switchTo().alert().dismiss();
         
         WebElement prompt = driver.findElement(By.id("promtButton"));
         
         prompt.click();
         
         Thread.sleep(3000);
         
         driver.switchTo().alert().sendKeys("vishal");
         
         String text = driver.switchTo().alert().getText();
         
         System.out.println(text);
         
         driver.switchTo().alert().accept();
         
         
         
         
         
         
      
        

	}
}
