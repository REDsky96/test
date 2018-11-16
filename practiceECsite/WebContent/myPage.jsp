<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypage</title>
</head>
<body>
  <p>〜mypage〜</p>
  <s:if test = "session.message == ''">
    <h3>ご購入情報は以下になります。</h3>
      <p>商品名</p>
      <s:property value = "session.buyItem_name"/>
      <br>
      <p>値段</p>
      <s:property value = "session.total_price"/>
      <br>
      <p>購入個数</p>
      <s:property value = "session.total_count"/><span>個</span>
      <br>
      <p>支払い方法</p>
      <s:property value = "session.total_payment"/>

      <s:form action = "MyPageAction">
        <input type = "hidden" name = "deleteFlg" value = "1"/>
        <s:submit value = "削除" method = "delete"/>
      </s:form>
  </s:if>

  <s:if test = "session.message != null">
    <h3><s:property value = "session.message"/></h3>
  </s:if>

  <span>前画面に戻る場合は</span>
  <a href = '<s:url action = "HomeAction"/>'>ログアウト</a>
  <span>をお願いします。</span>

</body>
</html>