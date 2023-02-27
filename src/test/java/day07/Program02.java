package day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

//Topic : Property file 
//Giving data or creating a new  property

public class Program02 {

	public static void main(String[] args) {
		 try {
			File src= new File(".\\src\\test\\resources\\Newconfig.properties");
			 OutputStream ip =  new FileOutputStream(src);
			 Properties property = new Properties();
			 property.setProperty("browser", "firefox");
			 property.setProperty("screenshot", "./src/test/");
			 property.store(ip,"done and dusted"); 
			 
			 
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		 
		 

	}

}
