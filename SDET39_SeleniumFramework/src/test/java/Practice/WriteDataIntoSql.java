package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class WriteDataIntoSql {

	public static void main(String[] args) throws Throwable {
		
		//Step1: Register or load the MYSQL Database
		
		Driver driver = new Driver();
	     DriverManager.registerDriver(driver);
	     
	     //Step2: Get Connect To Database
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers_info","root","root");
		
		//Step3: Create SQL Statement
	     Statement stat = conn.createStatement();
	     String query ="insert into teachers(first_name,last_name,address)values('Alley','Singh','Banglore')";
	    
	     //Step4: Execute statement/Query
	     
	     int result = stat.executeUpdate(query);
	     
	    if(result==1)  //primitive datatype content level comparison
	    	           //non-primitive datatype  address level comparison
	     {
	    	 
	    	 System.out.println("User is Created");
	    	 
	     }
	    else
	    {
	    	System.out.println("User is not Created");
	    }
	     
	     //Step5:close the database Connection
	     conn.close();

	}

}
