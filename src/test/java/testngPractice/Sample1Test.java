package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample1Test {
@Test(dataProvider = "sampledp")
public void creatTest(String src, String dst) {
	System.out.println("from" +src+ "to" + dst);
	
}
@DataProvider
public Object[][] sampledp() {
	Object[][] objarr= new Object[3][2];
	objarr[0][0]="Banglore";
	objarr[0][1]="Goa";
	
	objarr[1][0]="Banglore";
	objarr[1][1]="Mysore";
	
	objarr[2][0]="Banglore";
	objarr[2][1]="Manglore";
	return objarr;
	
}
}
