<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>HelloStrutsError</title>
</head>
<body>
  <h1>エラーが発生しました</h1>
  <br>
  <h3><s:property value = "helloStrutsDTOList.get(0).result"/></h3>

</body>
</html>