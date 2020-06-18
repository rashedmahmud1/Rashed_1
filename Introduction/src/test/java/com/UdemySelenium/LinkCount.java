package com.UdemySelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement minidriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(minidriver.findElements(By.tagName("a")).size());
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i=0;i<minidriver.findElements(By.tagName("a")).size();i++) {
			minidriver.findElements(By.tagName("a")).get(i).sendKeys(tab);
		}
			Set<String>win=driver.getWindowHandles();
			Iterator<String>it=win.iterator();
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(driver.findElements(By.tagName("a")).size());
		 * 
		 * WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		 * System.out.println(footerDriver.findElements(By.tagName("a")).size());
		 * 
		 * WebElement
		 * colomdriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 * System.out.println(colomdriver.findElements(By.tagName("a")).size());
		 * 
		 * for(int i =1;i<colomdriver.findElements(By.tagName("a")).size();i++) { String
		 * tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 * colomdriver.findElements(By.tagName("a")).get(i).sendKeys(tab); }
		 * 
		 * Set<String>abc=driver.getWindowHandles(); Iterator<String> it=abc.iterator();
		 * while(it.hasNext())
		 *  { driver.switchTo().window(it.next());
		 * System.out.println(driver.getTitle()); }
		 */
		
		//driver.quit();

	}

}
