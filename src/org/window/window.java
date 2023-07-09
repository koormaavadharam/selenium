package org.window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        
        Thread.sleep(3000);
        
        driver.navigate().refresh();
        
        WebElement deal = driver.findElement(By.linkText("Today's Deals"));
        
        WebElement service = driver.findElement(By.linkText("Customer Service"));
        
        Actions a=new Actions(driver);
        
        a.contextClick(deal).build().perform();
        
        Robot r=new Robot();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        
        
       a.contextClick(service).build().perform();
       
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyPress(KeyEvent.VK_ENTER);
       
       
       String parent = driver.getWindowHandle();
       
       String title = driver.switchTo().window(parent).getTitle();
       
       System.out.println(title);
       
       Set<String> child = driver.getWindowHandles();
       
       for (String s : child) {
    	   
    	   String title2 = driver.switchTo().window(s).getTitle();
    	   
    	   System.out.println(title2);
    	   
    	   String h="Help & Contact Us - Amazon Customer Service";
    	   
    	   Set<String> w = driver.getWindowHandles();
    	   
    	   for (String str : w) {
    		   
    		   if (driver.switchTo().window(str).getTitle().equals(h)) {
    			   
    			   break;
				
			}
    		   
			
		}
		
	}
       
       
        
        
	}
		

}
