package com.ust.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ust.empwebapp.dto.EmployeeInfo;

public class EmployeeDAOJdbcImpl implements IEmployeeDAO {

	final static private String url = "jdbc:mysql://localhost:3306/ust_web_db?user=root&password=root";
	final static private String driver = "com.mysql.jdbc.Driver";
	final static private String select_sql = "select * from employee_info where id = ?";//for search employee
	final static private String insert_sql ="insert into employee_info values(?,?,?,?)";//registerEmployee
	final static private String	update_sql	="update employee_info set password=? where id = ?";//change password
	
	
	@Override
	public EmployeeInfo auth(int id, String password) {
//		String sql = "select * from employee_info where id = ? and password = ?";
		EmployeeInfo info = searchEmployee(id);
		if(info!=null) {
			String pass = info.getPassword();
			if(pass.equals(password)) {
				return info;
			} else {
				return null;
			}
		}
		return null;
	}//end of auth();

	@Override
	public EmployeeInfo searchEmployee(int id) {
		
		try {
			Class.forName(driver);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(select_sql)){
				pstmt.setInt(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						EmployeeInfo emp = new EmployeeInfo();
						emp.setId(rs.getInt("id"));
						emp.setName(rs.getString("name"));
						emp.setEmail(rs.getString("email"));
						emp.setPassword(rs.getString("password"));
						return emp;
					} else {
						return null;
					}
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} 
	}//end of searchEmployee

	@Override
	public boolean changePassword(int id, String password) {
		try {
			Class.forName(driver);
			try(Connection conn =  DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(update_sql)){
				pstmt.setString(1, password);
				pstmt.setInt(2, id);

				int count = pstmt.executeUpdate();
				boolean check = count > 0 ? true : false;
				return check;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return true;
		}
	}

	@Override
	public boolean registerEmployee(EmployeeInfo info) {

		try {
			Class.forName(driver);

			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(insert_sql)){
				pstmt.setInt(1, info.getId());
				pstmt.setString(2,info.getName());
				pstmt.setString(3,info.getEmail());
				pstmt.setString(4,info.getPassword());

				int count = pstmt.executeUpdate();
				if(count>0)
					return true;
				else 
					return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}


	}//end of registerEmployee

}//end of EmployeeDAOJdbcImpl
