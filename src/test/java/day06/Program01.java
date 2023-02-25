package day06;

import org.testng.annotations.Test;

// Topic :InvocationCount - To print how many times we need

public class Program01 {
	@Test (invocationCount=5)
	public void testcase1() {
		System.out.println("Feb 25");
	}
	
	

}
