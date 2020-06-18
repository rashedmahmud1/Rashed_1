package com.UdemySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
	    driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement resourse=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(source, resourse).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		
		//driver.quit();

	}

}
