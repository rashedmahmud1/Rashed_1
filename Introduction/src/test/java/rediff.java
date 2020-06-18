import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//div[@class='row']/div[2]/input")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("GoodBye");
		driver.findElement(By.xpath("//div[@class='cell']/input[2]")).click();
		
		driver.quit();
	}

}
