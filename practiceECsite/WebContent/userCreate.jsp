<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserCreate</title>
</head>
<body>
  <p>～UserCreate～</p>

  <s:if test = "errorMessage != ''">
  <s:property value = "session.get('error')"/>
  </s:if>

  <s:form action = "UserCreateConfirmAction">
    <label>ログインID</label>
    <input type = "text" name = "loginUserId" value=""/>
  <br>
    <label>ログインPASS</label>
    <input type = "text" name = "loginPassword" value = ""/>
  <br>
    <label>ユーザー名</label>
    <input type = "text" name = "userName" value = ""/>

    <s:submit value = "登録"/>
  </s:form>

  <span>前画面に戻る場合は</span>
  <a href = '<s:url action = "HomeAction"/>'>こちら</a>

</body>
</html>