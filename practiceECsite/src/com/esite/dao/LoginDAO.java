package com.esite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.esite.dto.LoginDTO;
import com.esite.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String loginUserId, String loginPassword){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql = "select * from login_user_transaction where login_id = ? and login_pass = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setUserid(rs.getString("login_id"));
				dto.setPassword(rs.getString("login_pass"));
				dto.setUsername(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))){
					dto.setLoginFlg(true);
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}



}
