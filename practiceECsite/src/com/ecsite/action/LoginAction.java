package com.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.esite.dao.BuyItemDAO;
import com.esite.dao.LoginDAO;
import com.esite.dto.BuyItemDTO;
import com.esite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String result;
	private Map<String, Object>session;


  public String execute(){
	LoginDAO dao = new LoginDAO();
	LoginDTO dto = new LoginDTO();
	BuyItemDAO daob = new BuyItemDAO();

	result = ERROR;
	dto = dao.getLoginUserInfo(loginUserId, loginPassword);
	session.put("loginUser", dto);

	if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
		result = SUCCESS;

		BuyItemDTO dtob = daob.getBuyItemInfo();

		session.put("login_user_id",dto.getUserid());
		session.put("id",dtob.getId());
		session.put("buyItem_name", dtob.getItemname());
		session.put("buyItem_price", dtob.getItemprice());
		return result;
	}
	return result;
  }

  public String getLoginUserId(){
	  return loginUserId;
  }

  public void setLoginUserId(String loginUserId){
	  this.loginUserId = loginUserId;
  }

  public String getLoginpPassword(){
	  return loginPassword;
  }

  public void setLoginPassword(String loginPassword){
	  this.loginPassword = loginPassword;
  }

  public Map<String, Object>getSession(){
	  return session;
  }

  public void setSession(Map<String, Object>session){
	  this.session = session;
  }


}
