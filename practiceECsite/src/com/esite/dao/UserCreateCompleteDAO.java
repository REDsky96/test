package com.esite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.esite.util.DBConnector;
import com.esite.util.DateUtil;

public class UserCreateCompleteDAO {
	private DateUtil U = new DateUtil();

	private String sql = "insert into login_user_transaction(login_id, login_pass, user_name, insert_date)values(?,?,?,?)";

	public void createUser(String loginUserId, String loginPassword, String userName)throws SQLException{

	  DBConnector db = new DBConnector();
	  Connection con = db.getConnection();

	  try{
		  PreparedStatement ps = con.prepareStatement(sql);

		  ps.setString(1, loginUserId);
		  ps.setString(2, loginPassword);
		  ps.setString(3, userName);
		  ps.setString(4, U.getDate());

		  ps.execute();
	  }catch(SQLException e){
		  e.printStackTrace();
	  }
	  finally{
		  con.close();
	  }
	}

}
