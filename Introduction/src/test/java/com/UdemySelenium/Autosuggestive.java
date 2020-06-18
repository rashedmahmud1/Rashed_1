package com.UdemySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']/label/input")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']/label/input")).sendKeys("mum");
	    WebElement source=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	    source.sendKeys("mun");
	    source.sendKeys(Keys.ARROW_DOWN);
	    source.sendKeys(Keys.ENTER);
		//driver.quit();

	}

}
