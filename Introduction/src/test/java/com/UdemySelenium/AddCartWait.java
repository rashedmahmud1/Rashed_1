package com.UdemySelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] myVegi= {"Cucumber","Brocolli","Beetroot"};
		muMethod(driver,myVegi);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
	}

public static void muMethod(WebDriver driver, String[] myVegi) throws InterruptedException {
	int j=0;
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++) {
			String[] a=product.get(i).getText().split("-");
			String b=a[0].trim();
			List mylist=Arrays.asList(myVegi);
			//System.out.println(product.get(i).getText());	
			Thread.sleep(5000);
			
			if(mylist.contains(b)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if(j==myVegi.length)
					break;
				}
			}
		
		
		
}
}		
		
		
		
		
		
		
		
//		String[] myVegi= {"Cucumber","Brocolli","Beetroot"};
//		Grocery(driver,myVegi);
//		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
//		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.cssSelector("button.promoBtn")).click();
//		
//		WebDriverWait w = new WebDriverWait(driver,10);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//		
//		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
//		//driver.quit();
//	
//		}
//
//
//
//public static void Grocery(WebDriver driver,String[] myVegi) {
//	
//	int j =0;
//	List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
//	for(int i=0;i<product.size();i++) {
//		String[] vegiName=product.get(i).getText().split("-");
//		String formatName=vegiName[0].trim();
//		List getMyvegi=Arrays.asList(myVegi);
//		//Thread.sleep(5000);
//		if(getMyvegi.contains(formatName)) {
//			j++;
//			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//			if(j==myVegi.length) {
//				break;
//			}
//		}
//	}


