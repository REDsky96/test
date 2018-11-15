package com.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.esite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String, Object>session;

	public String execute() throws SQLException{

		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();
		dao.createUser(session.get("loginUserId").toString(),session.get("loginPassword").toString(), session.get("userName").toString());
        String result = SUCCESS;
        return result;
	}

}
