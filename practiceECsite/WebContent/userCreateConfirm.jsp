<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
</head>
<body>
  <p>～UserCreateConfirm～</p>
  <h3>登録する内容は以下でよろしいでしょうか？</h3>
  <s:form action = "UserCreateCompleteAction">
    <label>ログインID</label>
    <s:property value = "loginUserId"/>
    <br>
    <label>ログインPASS</label>
    <s:property value = "loginPassword"/>
    <br>
    <label>ユーザー名</label>
    <s:property value = "userName"/>
    <s:submit value = "完了"/>
  </s:form>

</body>
</html>