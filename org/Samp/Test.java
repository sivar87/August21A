package org.Samp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "\\Users\\STEEVA\\eclipse-workspace\\org.Samp\\drive\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.flipkart.com/");
		
		/*WebElement find=d.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		find.click();*/
		
		/*WebElement uname=d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		uname.sendKeys("SivaR_87");
		
		WebElement pass=d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		pass.sendKeys("password");

		WebElement btn=d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		btn.click();
*/		
		WebElement find=d.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		find.click();
		
		WebElement scr=d.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
		scr.sendKeys("IPhoneX");
		
		WebElement scrbtn=d.findElement(By.xpath("/html/body/div/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
		
		Thread.sleep(1000);
		
		Robot r=new Robot();
	
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement frst=d.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
		frst.click();
		
		
		
		}

} 
