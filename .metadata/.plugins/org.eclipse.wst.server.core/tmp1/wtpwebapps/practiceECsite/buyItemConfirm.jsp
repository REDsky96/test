<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>購入確認画面</title>
</head>
<body>
  <p>～BuyItemConfirm～</p>
  <s:form action = "BuyItemConfirmAction">
    <p>商品名</p>
    <s:property value = "session.buyItem_name"/>
    <br>
    <p>値段</p>
    <s:property value = "session.buyItem_price"/>
    <span>円</span>
    <br>
    <p>購入個数</p>
    <s:property value = "session.stock"/>
    <span>個</span>
    <br>
    <p>支払い方法</p>
    <s:property value = "session.pay"/>
    <br>
    <s:submit value= "完了"/>
  </s:form>

</body>
</html>