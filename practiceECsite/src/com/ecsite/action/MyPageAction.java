package com.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.esite.dao.MyPageDAO;
import com.esite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public String deleteFlg;
	private String result;

	public String execute()throws SQLException{
        MyPageDAO dao = new MyPageDAO();
        MyPageDTO dto = new MyPageDTO();

        if(deleteFlg == null){
        	String item_transaction_id = session.get("id").toString();
        	String user_name_id = session.get("login_user_id").toString();
        	dto = dao.getMyPageUserInfo(itenm_transaction_id, user_master_id);
        	session.put("buyItem_name", dto.getItemName());
        	session.put("total_price", dto.getTotalPrice());
        	session.put("total_count", dto.getTotalCount());
        	session.put("total_payment",dto.getPaymetn());
        }
	}

}
