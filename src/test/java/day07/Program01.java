package day07;

//Topic : Property file 
// Reading data from config property

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Program01 {

	public static void main(String[] args) {
		try {
			File src = new File(".\\src\\test\\resources\\config.properties"); // Reading the file location
			InputStream ip = new FileInputStream(src);  // Converting into streamed data
			Properties property = new Properties(); // Creating a property ( object)
			property.load(ip);  // Loading the streamed data
			// Getting property one by one 
			System.out.println(property.getProperty("browser"));
			System.out.println(property.getProperty("url"));
			System.out.println(property.getProperty("sleep")); // If key property is not available in properties it shows null as output
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
