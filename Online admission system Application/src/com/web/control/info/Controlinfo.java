package com.web.control.info;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.info.Info;
import com.web.info.dao.Infodao;

/**
 * Servlet implementation class Controlinfo
 */
@WebServlet("/Controlinfo")
public class Controlinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollno=(request.getParameter("rollno"));
		String academicyear=(request.getParameter("academicyear"));
		String sname=(request.getParameter("sname")); 
		String fathername  = (request.getParameter("fathername"));
		String mothername  = (request.getParameter("mothername"));
		String permanentaddress  = (request.getParameter("permanentaddress"));
		String birthdate  = (request.getParameter("birthdate"));
		String nationality  = (request.getParameter("nationality"));
		String religion  = (request.getParameter("religion"));
		String bloodgroup  = (request.getParameter("bloodgroup"));
		String examinfo1  = (request.getParameter("examinfo1"));
		String examinfo2  = (request.getParameter("examinfo2"));
		String password  = (request.getParameter("password"));
		
		Infodao dao=new Infodao();
		Info a1 = dao.GetInfo(rollno,academicyear,sname,fathername,mothername,permanentaddress,birthdate,nationality,religion,bloodgroup,examinfo1,examinfo2,password);
		request.setAttribute("info",a1);
		RequestDispatcher rd=request.getRequestDispatcher("Completeadmission.jsp"); 
		rd.forward(request, response);
	}
 
}
