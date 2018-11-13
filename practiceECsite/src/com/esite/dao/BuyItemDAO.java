package com.esite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.esite.dto.BuyItemDTO;
import com.esite.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
      DBConnector db = new DBConnector();
      Connection con = db.getConnection();
      BuyItemDTO dto = new BuyItemDTO();

      String sql = "select id, item_name, item_price from item_info_transaction";
      try{
    	  PreparedStatement ps = con.prepareStatement(sql);
    	  ResultSet rs = ps.executeQuery();

    	  if(rs.next()){
    		  dto.setId(rs.getInt("id"));
    		  dto.setItemname(rs.getString("item_name"));
    		  dto.setItemprice(rs.getString("item_price"));
    	  }
      }catch (Exception e){
    	  e.printStackTrace();
      }
      try{
    	  con.close();
      }catch(Exception e){
    	  e.printStackTrace();
      }

      return dto;
	}

}
