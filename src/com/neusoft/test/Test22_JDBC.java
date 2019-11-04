package com.neusoft.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test22_JDBC {
	public static void main(String[] args) {
		String driver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/scott" ;
		String user = "root";
		String password = "root";
		try {
			//1.加载驱动
			Class.forName(driver);
			//2.连接数据库
			String sql =null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				Connection conn = DriverManager.getConnection(url, user, password);
				//3.创建PreparedStatement对象
				//4.执行sql语句
				sql = "select * from emp";
				pstmt = conn.prepareStatement(sql);//查询表中所有数据
				rs = pstmt.executeQuery(sql);//查询返回结果集
				//5.遍历
				while(rs.next()){
					System.out.println("["+rs.getString("empno")+","+rs.getString("ename")+","+rs.getString("job")+","+rs.getString("mgr")+","+rs.getString("hiredate")+"]");		
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {					
					pstmt.close();
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
}
