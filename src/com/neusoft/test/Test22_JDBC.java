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
			//1.��������
			Class.forName(driver);
			//2.�������ݿ�
			String sql =null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				Connection conn = DriverManager.getConnection(url, user, password);
				//3.����PreparedStatement����
				//4.ִ��sql���
				sql = "select * from emp";
				pstmt = conn.prepareStatement(sql);//��ѯ������������
				rs = pstmt.executeQuery(sql);//��ѯ���ؽ����
				//5.����
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
