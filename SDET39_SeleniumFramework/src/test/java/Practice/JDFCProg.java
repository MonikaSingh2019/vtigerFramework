package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDFCProg {

	public static void main(String[] args) throws Throwable {
		
	//Step1: Register or load the MYSQL Database
		
     Driver driver = new Driver();
     DriverManager.registerDriver(driver);
     
     //Step2: Get Connect To Database
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teachers_info","root","root");
	
	//Step3: Create SQL Statement
     Statement stat = conn.createStatement();
     String selectQuery ="select * from teachers";
    
     //Step4: Execute statement/Query
     
     ResultSet result = stat.executeQuery(selectQuery);
     
     while(result.next())
     {
    	 
    	 System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
     }
     
     //Step5:close the database Connection
     conn.close();
     }
      
      
	
	
	}


