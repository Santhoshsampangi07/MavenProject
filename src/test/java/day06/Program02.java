package day06;
  //Topic : Groups - Run particular test case which we needed  -  Include and Exclude is used 
  // We can group multiple groups also e.g:(groups={"smoke","test"})
import org.testng.annotations.Test;

public class Program02 {
	@Test (groups = {"smoke"})
	public void testcase1()
	{
		System.out.println("Running1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Running2");
	}
	@Test(groups = {"smoke"})
	public void testcase3()
	{
		System.out.println("Running3");
	}
	@Test(groups = {"smoke"})
	public void testcase4()
	{
		System.out.println("Running4");
	}

}
