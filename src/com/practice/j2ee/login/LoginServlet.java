package com.practice.j2ee.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		System.out.println("User Name is "+usr);
		System.out.println("User Passwd is "+key);
		try{
			boolean b=db.isUserValid(usr,key);
			System.out.println("validation status is "+b);
		
			if(b){
				response.sendRedirect("/AppIntegrate/home.jsp");
			}else{
				response.sendRedirect("/AppIntegrate/error.jsp");
			}
		}catch(SQLException s){
			s.printStackTrace();
		}
			
	}

	
}
