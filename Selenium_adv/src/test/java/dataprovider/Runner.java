package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import orange.Orange;

public class Runner extends Orange
{
	@DataProvider(name="login")
	public Object[][] data()
	{
		return new Object[][]
		{
			{"Admin", "admin123"},
			{"abc", "abc123"}
			
		};
	}
	@Test(dataProvider = "login")
	public void login(String un, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd, Keys.ENTER);
		driver.quit();
	}
}
