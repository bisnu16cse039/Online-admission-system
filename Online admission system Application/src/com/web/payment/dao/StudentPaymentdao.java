package com.web.payment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.web.student.Student;

public class StudentPaymentdao {
	public Student GetStudent(String rollno,String transactionid,String status)
	{
		Student a = new Student();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsinfo","root","");
			Statement st = con.createStatement();
			String query="insert into paymentinfo " + " (rollno,transactionid,status)" + " values('"+rollno+"','"+transactionid+"','"+status+"')";
			
			st.executeUpdate(query);
			System.out.println("Insert completed");
			st.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return a;
	}
}
