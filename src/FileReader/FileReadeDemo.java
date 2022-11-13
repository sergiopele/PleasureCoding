package FileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReadeDemo {
	public static void main(String[] args) throws IOException {
		
		var path = "DataDocs/config.properties";        //path of the file (always locate in project folder)
		var fileInputStream = new FileInputStream(path);    //Navigate to the file
		
		var properties = new Properties();        //software to help read file from the file
		properties.load(fileInputStream);        //loads all the data from the file
		
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("URL"));
		fileInputStream.close();		//close the file
		
	}
}
