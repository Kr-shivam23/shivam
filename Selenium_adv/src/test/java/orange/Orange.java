package orange;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generic.Orange_data;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange
{
	public WebDriver driver;

	@BeforeMethod
	public void login() 
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty(Chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		Orange_data o=new Orange_data();
//		ArrayList data = o.username("un", "pwd");
//		String un = (String) data.get(0);
//		String pwd = (String) data.get(1);
//				
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
//		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
//		
//		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
		
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Ddt.read_ddt("login", 0, 1));
//		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Ddt.read_ddt("login", 1, 1));
//		
//		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
		
		
		
		
		//Pom_class p=new Pom_class(driver);
		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Ddt.read_ddt("login", 0, 1));
//		
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Ddt.read_ddt("login", 1, 1));
//		
//		driver.findElement(By.xpath("//button[contains(.,'Log')]")).click();
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
