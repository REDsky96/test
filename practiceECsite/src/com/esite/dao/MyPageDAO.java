package com.esite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.esite.dto.MyPageDTO;
import com.esite.util.DBConnector;

public class MyPageDAO {

	public MyPageDTO getMyPageUserInfo(String itenm_transaction_id, String user_master_id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		MyPageDTO dto = new MyPageDTO();

		String sql = "select iit.item_name, ubit.total_price, ubit.total_count, ubit.pay from user_buy_item_transaction ubit left join item_info_transaction iit on ubit.user_master_id = ? order by ubit.insert_date desc";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itenm_transaction_id);
			ps.setString(2, user_master_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				dto.setItemName(rs.getString("item_name"));
				dto.setTotalPrice(rs.getString("total_price"));
				dto.setTotalCount(rs.getString("total_count"));
				dto.setPayment(rs.getString("pay"));
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}

	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from user_buy_item_transaction where item_transaction_id = ? and user_master_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		int result = 0;
		try{
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}

		return result;
	}

}
