package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFileTest {

	public static void main(String[] args) throws Throwable {
		//step1: get the java representation  of physical file
		FileInputStream fis = new FileInputStream("./commonData/skillrraryUk.properties");
		//step2:- create an object to property class to load  all the key
		Properties pobj= new Properties();
		pobj.load(fis);
		//step3:- read the value using key
String URL = pobj.getProperty("url");
System.out.println(URL);
String Browser = pobj.getProperty("browser");
System.out.println(Browser);
	}

}
