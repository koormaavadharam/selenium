package org.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_Robots {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5szpgfto9j_e&adgrpid=1320515071595367&hvadid=82532458765178&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=90&hvtargid=kwd-82533067351416:loc-90&hydadcr=14452_2334185");

		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions a=new Actions(driver);
		
		a.contextClick(electronics).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
