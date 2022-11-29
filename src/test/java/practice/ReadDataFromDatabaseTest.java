package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabaseTest {

	public static void main(String[] args) throws Throwable {
	Driver driverRef= new Driver();
//step1:- load mysql database
	DriverManager.registerDriver(driverRef);
	
		//step2:- connect to database
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		//step3:- create query
	Statement stat = conn.createStatement();
	String query="select * from project";
		//step4:- execute query
	ResultSet resultset = stat.executeQuery(query);
	while(resultset.next()) {
		System.out.println(resultset.getString(2));
	}
		
		//step5:- close connection
	conn.close();
	}

}
