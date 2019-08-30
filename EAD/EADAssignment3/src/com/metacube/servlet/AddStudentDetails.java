package com.metacube.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet to add Student data into database
 * @author jyoti
 */
public class AddStudentDetails extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("In the servlet are following");
		Student student=new Student();
		student.setFirstName(req.getParameter("first_name"));
		student.setLastName(req.getParameter("last_name"));
		student.setFatherName(req.getParameter("father_name"));
		student.setEmail(req.getParameter("email_id"));
		student.setStudentClass(Integer.parseInt(req.getParameter("class")));
		student.setAge(Integer.parseInt(req.getParameter("age")));
		int added=DatabaseHelper.addStudent(student);
		if(added==1)
			out.println("Added Sucessfully");
		else if(added==1062)
			out.println("This Email Already exists");
		else
			out.println("Not Added");
		
		
	}
}