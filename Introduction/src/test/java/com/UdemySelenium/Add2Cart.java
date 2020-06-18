package com.UdemySelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.emory.mathcs.backport.java.util.Arrays;


public class Add2Cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String[] myVegi= {"Brocolli","Tomato","Cucumber"};
		Grocery(driver, myVegi);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		}
	
	
	
	 
	public static void Grocery(WebDriver driver,String[] myVegi) throws InterruptedException {
		int j=0;
		
		List<WebElement> vegiCount=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<vegiCount.size();i++) {
			//String iteamName=driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).getText();
			String iteamNames=vegiCount.get(i).getText();
			
			String[] acctulIteam=iteamNames.split("-");
			String vegi =acctulIteam[0].trim();
			j++;
			List myList=Arrays.asList(myVegi);
			//String formatVegi="Cucumber";
			Thread.sleep(5000);
			if(myList.contains(vegi))
			
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==myVegi.length) {
				break;
			}
		}
		
	////div[@class='products-wrapper']	
		
		
		//driver.quit();
	}

}
