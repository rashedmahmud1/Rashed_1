package com.UdemySelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		footerDriver.findElements(By.tagName("a")).size();
		
		WebElement coclomdriver=footerDriver.findElement(By.xpath("//td[1]//ul[1]"));
		System.out.println(coclomdriver.findElements(By.tagName("a")).size());
		
		for(int i =0;i<coclomdriver.findElements(By.tagName("a")).size();i++) {
			String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coclomdriver.findElements(By.tagName("a")).get(i).sendKeys(tab);
		}
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>name=ids.iterator();
		while(name.hasNext()) {
			driver.switchTo().window(name.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
