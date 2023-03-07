package day10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// To connect web browser and application it takes some time 

public class Program04 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // implicit - To load web page
		
		}

	}

