package com.UdemySelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		int j=0;
		String[] myVegi= {"Cucumber","Brocolli","Beetroot"};
		//I am usint array to add multiple iteam as well to utilize the memories;not list
		
		//I am getting all the list of product And getting all there names.
		
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++) {
			//Brocolli - 1 Kg
			//formating the name and triming the space as well
			
			String[] vegiName=product.get(i).getText().split("-");
			String formatName=vegiName[0].trim();
			
			
			List getMyIteam=Arrays.asList(myVegi);
			
			//i am converting array to arraylist inorder to use contain method and also using on runtime.
			//I am formating my accutal vegi name from the Text what i am extraing from.
			//I am selecting my desire iteam and adding to my Chart.
			//
			
			Thread.sleep(5000);
			if(getMyIteam.contains(formatName)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//its block only excute 3 times.and lets puts break after that to maximige the code 
				if(j==3) {
					break;
				}
			}
		}
		
		
		
		//driver.quit();

	}

}
