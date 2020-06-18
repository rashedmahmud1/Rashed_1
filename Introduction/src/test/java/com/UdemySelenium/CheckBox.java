package com.UdemySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[(@type='checkbox')]")).size());
		driver.quit();

	}

}
