package com.web.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.payment.dao.StudentPaymentdao;
import com.web.student.Student;


/**
 * Servlet implementation class Controlpayment
 */
@WebServlet("/Controlpayment")
public class Controlpayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollno=(request.getParameter("rollno"));
		String transactionid=(request.getParameter("transactionid"));
		String status="Accepted"; 
	
		StudentPaymentdao dao2=new StudentPaymentdao();
		Student a1=dao2.GetStudent(rollno, transactionid, status);
		request.setAttribute("info",a1);
		RequestDispatcher rd=request.getRequestDispatcher("done.jsp"); 
		rd.forward(request, response);
	}

}
