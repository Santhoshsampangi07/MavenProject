package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Topic :Data Provider - Same test case to run with different data 
public class Program04selenium {
	WebDriver driver;
	@DataProvider(name="login")
	public Object[][]testdata()
	{
		return new Object[][] {{"santhosh","pass123"},{"kumaravel","pass456"},{"frooti","pass789"}};
		
	}
	
    @Test(dataProvider="login")
	public void logIn(String username , String password)
	{
    	driver=new ChromeDriver();
    	driver.get("https://demo.guru99.com/V1/index.php");
    	driver.findElement(By.name("username")).sendKeys(username); 
    	driver.findElement(By.name("password")).sendKeys(password); 
		
	}
}

   //?? Doubt 