package org.Samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sam 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\STEEVA\\eclipse-workspace\\org.Samp\\drive\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		
		d.get("http://www.greenstechnologys.com/about.html");
		
		d.manage().window().maximize();
		
		WebElement sel=d.findElement(By.linkText("COURSES"));
		
		WebElement sub=d.findElement(By.xpath("/html/body/div/div/div[2]/ul/li[3]/ul/li[3]/a/span"));
		
		WebElement sele=d.findElement(By.xpath("/html/body/div/div/div[2]/ul/li[3]/ul/li[3]/ul/li[4]/a/span"));
		
		
		Actions act=new Actions(d);
		
		act.moveToElement(sel).moveToElement(sub).perform();

		Thread.sleep(4000);
		
		sele.click();

		Thread.sleep(3000);
	
		d.quit();

		}

}
