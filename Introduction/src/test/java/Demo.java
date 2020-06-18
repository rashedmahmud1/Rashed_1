import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13477\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver =   new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("http://www.Google.com/");//This is to validate if in the right
		 * page System.out.println(driver.getTitle());//This is to validate if the title
		 * is matching or not System.out.println(driver.getCurrentUrl());// This is to
		 * validate the correct URL
		 */	
		
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("This is my xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//System.out.println(driver.findElement(By.xpath("//span[@class='_50f6']")).getText());
		//driver.quit();
		
		
		
		/*
		 * System.out.println(driver.getTitle());//This is to validate if the title is
		 * matching or not System.out.println(driver.getCurrentUrl());// This is to
		 * validate the correct URL
		 * driver.findElement(By.id("email")).sendKeys("This is my first code");
		 * driver.findElement(By.name("pass")).sendKeys("123456");
		 * driver.findElement(By.linkText("Forgot account?")).click();
		 */
	
		
		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());// This is to tpo validatye the sourse code 
		
	}

}
