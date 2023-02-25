package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Topic :Data Provider - Same test case to run with different data 
public class Program04instagramexample {
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
    	driver.get("https://www.instagram.com/accounts/login/");
    	driver.switchTo().frame("SingleFrame");
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username); // Xpath -//input[@name='username']
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password); // Xpath - //input[@name='password']
		System.out.println("$$$$$$$$$");
	}
}
