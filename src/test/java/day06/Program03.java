
package day06;
//Topic :Data Provider - Same test case to run with different data 

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Program03 {
	
	
	@DataProvider(name="login")
	public Object[][] testdata()
	{
		return new Object[][] {{"santhosh","pass123"},{"kumaravel","pass456"},{"frooti","pass789"}};
	}
	
	
	
	@Test(dataProvider = "login")
	public void logIn(String username,String pwd)
	{
		System.out.println(username+"----"+pwd);
	}

}