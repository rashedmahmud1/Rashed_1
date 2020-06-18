import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercurrySite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\13477\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("userName");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String Exptitle="Sign-on: Mercury Tours";
		String actitle=driver.getTitle();
		
		if(Exptitle.equals(actitle)) {
			System.out.println("This test is pass");
		}else {
			System.out.println("This test is fail");
		}
		driver.quit();
	}

}
