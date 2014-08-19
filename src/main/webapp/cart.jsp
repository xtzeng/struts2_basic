<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
</head>
<body>

<p align="center">购物车</p>
<form  name="form1" method="post" action="/onlineshoppingcart/servlet/shoppingCart" >
<table width="598" border="1" align="center">
  <tr>
    <td width="170">商品名称</td>
    <td width="65">价格</td>
    <td width="83">数量</td>
    <td width="74">小计</td>
    <td width="172">操作</td>
  </tr>
  <tr>
    <td>name</td>
    <td>price</td>	
	<input type="hidden" name="id" value="id" >
    <td><input name="q" type="text" value="1" size="4" maxlength="4"></td>
    <td>100</td>	
    <td><input type="submit" name="method" value="update" >
      <input type="submit" name="method" value="remove" ></td>
  </tr>     
  <tr>
    <td colspan="5">总计：1200</td>
  </tr>
</table>
</form>
</body>
</html>