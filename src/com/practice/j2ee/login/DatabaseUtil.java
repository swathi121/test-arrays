package com.practice.j2ee.login;

import java.sql.*;

public class DatabaseUtil {
	private static DatabaseUtil dbu;
	static Object obj=new Object();
	
	/**
	 * @param args
	 */
	private DatabaseUtil(){}
	
	private static String usr;
	private static String key;	
	private static String email;	
	public static DatabaseUtil getInstance() {
			// TODO Auto-generated method stub
			synchronized(obj){
				if(dbu==null){
					dbu=new DatabaseUtil();
				}
			
			}
		return dbu;
	}
	
	public boolean isUserValid(String usr,String key) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		Statement st=con.createStatement();
		System.out.println("select * from register where name='"+usr+"' and password='"+key+"'");
		ResultSet rs=st.executeQuery("select * from register where name='"+usr+"' and password='"+key+"'");
		while(rs.next()){
		this.usr=rs.getString(1);
		this.key=rs.getString(2);
		}
		if(this.usr==null||this.key==null)
			return false;
		if(this.usr.equals(usr) && this.key.equals(key))
			return true;
		else
			return false;
	
	}
	public boolean registration(String usr,String key,String email) throws SQLException{
		Connection con = getConnection();
		Statement stmt=con.createStatement();
		String usr1=usr;
		String key1=key;
		String email1=email;
		System.out.println("insert into emp2 values("+usr+","+key+","+email+")");
		int n=stmt.executeUpdate("insert into emp2 values("+usr1+","+key1+","+email1+")");
		if(n>0){
			System.out.println("insertion succes");
			return true;
		}
		else{
			System.out.println("insertion failed");
			return false;
		}
	}
	public Connection getConnection() throws SQLException{
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:ora","scott","tiger");
			System.out.println(con);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  con;
	}
	

}
