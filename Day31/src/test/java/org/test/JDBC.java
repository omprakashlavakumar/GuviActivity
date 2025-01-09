package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	
	public static void main(String[] args) throws Exception {
		// 1. Start the Connection
		String db = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(db,user,password);
		
		if (connection==null) {
			System.out.println("JDBC Not Connected");
		} else {
			System.out.println("JDBC Connected");
		}
		
		// 2. Create Statement
		Statement stmt = connection.createStatement();
		
		String createDatabase = "create database db_sample";
		String useDB = "use db_sample";
		String createTable = "create table Emp_class (EmpID int, EmpName varchar(10), EmpSalary int)";
		String insert = "insert into Emp_class values (123,'ABC',10000),(456,'DEF',20000),(789,'GHI',30000)";
		String select = "Select * from Emp_class";
		String select1 = "Select * from Emp_class where EmpName ='DEF'";
		
		// 3. Executing the Statement
		stmt.execute(createDatabase);
		stmt.execute(useDB);
		stmt.execute(createTable);
		stmt.execute(insert);
		
		// 4. Retrive the data from database
		ResultSet rs = stmt.executeQuery(select);
		ResultSet rs1 = stmt.executeQuery(select1);
		
		// iterating the result
		
		while (rs.next()) {
			System.out.println(rs.getInt("EmpID")+ " " + rs.getString("EmpName") + " " + rs.getInt("EmpSalary"));		
		}
		
		while (rs1.next()) {
			System.out.println(rs.getInt("EmpID")+ " " + rs.getString("EmpName") + " " + rs.getInt("EmpSalary"));		
		}
		
		
		// 5. Close the Connection
		
		connection.close();
	}

}
