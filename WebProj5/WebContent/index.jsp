<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INDEX</title>
</head>
<body>
  <s:form action = "HelloStrutsAction">
    <s:submit value="こんにちは!!"/>
  </s:form>

  <s:form action = "WelcomeAction">
    <s:submit value = "ログイン画面"/>
  </s:form>

</body>
</html>