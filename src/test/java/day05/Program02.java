package day05;

import org.testng.annotations.Test;

    //Priority wise

public class Program02 {
	@Test(priority =4)
	public void testcase1()
	{
		System.out.println("Running1");
	}
	@Test(priority =2)
	public void testcase2()
	{
		System.out.println("Running2");
	}
	@Test(priority =3)
	public void testcase3()
	{
		System.out.println("Running3");
	}
	@Test(priority =0)
	public void testcase4()
	{
		System.out.println("Running4");
	}

}
