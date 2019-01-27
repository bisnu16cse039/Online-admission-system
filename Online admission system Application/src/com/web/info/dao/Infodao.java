package com.web.info.dao;

import java.sql.*;
import com.web.dao.info.Info;
public class Infodao {

	public Info GetInfo(String rollno,String academicyear,String sname,String fathername,String mothername,String permanentaddress,String birthdate,String nationality,String religion,String bloodgroup,String examinfo1,String examinfo2,String password)
	{
		Info a = new Info();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsinfo","root","");
			Statement st = con.createStatement();
			String query="insert into student " + " (rollno,academicyear,sname,fathername,mothername,permanentaddress,birthdate,nationality,religion,bloodgroup,examinfo1,examinfo2,password)" + " values('"+rollno+"','"+academicyear+"','"+sname+"','"+fathername+"','"+mothername+"','"+permanentaddress+"','"+birthdate+"','"+nationality+"','"+religion+"','"+bloodgroup+"','"+examinfo1+"','"+examinfo2+"','"+password+"')";
			
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
