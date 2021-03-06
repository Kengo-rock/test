package com.internousdev.login1.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login1.dto.Login1DTO;
import com.internousdev.login1.util.DBConnector;

public class Login1DAO {
		public Login1DTO select(String name,String password) throws SQLException{
				Login1DTO dto=new Login1DTO();
				DBConnector db = new DBConnector();
				Connection con = db.getConnection();

				String sql="select * from user where user_name=? and password=?";
		try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2,password);

				ResultSet rs=ps.executeQuery();

				if(rs.next()) {
						dto.setName(rs.getString("user_name"));
						dto.setPassword(rs.getString("password"));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				con.close();
			}
			return dto;
		}

}
