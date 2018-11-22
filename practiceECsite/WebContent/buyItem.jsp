<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUYITEM</title>
</head>
<body>
  <p>BuyItem</p>
    <span>商品名</span>
    <s:form action = "BuyItemAction">
    <s:property value = "#session.buyItem_name"/>
    <br>
    <span>値段</span>
    <s:property value = "#session.buyItem_price"/><span>円</span>
    <br>
    <span>個数</span>
    <select name = "stock">
      <option value = "1" selected = "selected">1</option>
      <option value = "2">2</option>
      <option value = "3">3</option>
      <option value = "4">4</option>
      <option value = "5">5</option>
    </select>

    <br>
    <span>支払い方法</span>
    <label><input type = "radio" name = "pay" value = "1" checked = "checked">現金支払い</label>
    <label><input type = "radio" name = "pay" value = "2">クレジットカード</label>
    <label><input type = "radio" name = "pay" value = "3">ローン支払い</label>
    <s:submit value = "購入"/>
    </s:form>

    <span>前画面に戻る場合は</span>
    <a href = '<s:url action = "HomeAction"/>'>こちら</a>


</body>
</html>