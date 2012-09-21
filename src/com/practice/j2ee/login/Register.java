package com.practice.j2ee.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DatabaseUtil db=DatabaseUtil.getInstance();
		String usr=request.getParameter("user");
		String key=request.getParameter("key");
		String email=request.getParameter("email");
		
		System.out.println("User Name is "+usr);
		System.out.println("User Passwd is "+key);
		System.out.println("email id  is"+email);
		try{
			boolean b=db.registration(usr,key,email);
			System.out.println("validation status is "+b);
		
			if(b){
				response.sendRedirect("/AppIntegrate/home.jsp");
			}else{
				System.out.println("alert(\"registration failed try again\")");
				response.sendRedirect("/AppIntegrate/register.jsp");
			}
		}catch(SQLException s){
			s.printStackTrace();
		}
			
	}

}
