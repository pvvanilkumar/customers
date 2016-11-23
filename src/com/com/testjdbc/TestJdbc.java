package com.com.testjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;

/**
 * Servlet implementation class TestJdbc
 */
@WebServlet("/TestJdbc")
public class TestJdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestJdbc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = "root";
		String password = "tiger";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		PrintWriter out = response.getWriter();
		try 
		{
			out.println("Loading the driver");
			Class.forName(driver);
			out.println("Setting up the connection");
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			out.println("Connection success");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			out.println("in exception block");
		}
		 
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
