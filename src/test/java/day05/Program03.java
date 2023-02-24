package day05;
 

  // Enable option  - Those test case not going to execute
import org.testng.annotations.Test;

public class Program03 {
	@Test(priority =0 , enabled=false)
	public void testcase1()
	{
		System.out.println("Running1");
	}
	@Test(priority =3)
	public void testcase2()
	{
		System.out.println("Running2");
	}
	@Test(priority =4 , enabled=false)
	public void testcase3()
	{
		System.out.println("Running3");
	}
	@Test(priority =5)
	public void testcase4()
	{
		System.out.println("Running4");
	}
}
