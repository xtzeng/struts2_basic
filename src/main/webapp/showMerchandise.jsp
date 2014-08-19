<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购买商品</title>
</head>
<body>

<center>
			商品显示页，请选购您喜欢的商品
		</center>
		<table width="424" height="583" border="0" align="center">
			<tr>
				<td width="190">
					<img src="images/hppavilion.jpg" width="150" height="150" />
				</td>
				<td width="224">
					<img src="images/lenovo.jpg" width="150" height="150" />
				</td>
			</tr>
			<tr>
				<td>
					HP笔记本电脑
				</td>
				<td>
					移动硬盘
				</td>
			</tr>
			<tr>
				<td>
					价格：5999.00元
				</td>
				<td>
					价格：700.00元
				</td>
			</tr>
			<tr>
				<!—传递“HP笔记本电脑”的参数-->
				<td>
					<a
						href="/servlet/addShoppingCart?id=0001&name=HP笔记本电脑&price=5999.00">
						<img src="images/buybutton.gif" width="71" height="21" border="0" />
					</a>
				</td>
				<!—传递“移动硬盘”的参数-->
				<td>
					<a
						href="/servlet/addShoppingCart?id=0002&name=移动硬盘&price=700.00">
						<img src="images/buybutton.gif" width="71" height="21" border="0" />
					</a>
				</td>
			</tr>
			<tr>
				<td>
					<img src="images/mouse.jpg" width="200" height="200" />
				</td>
				<td>
					<img src="images/lcd.jpg" width="150" height="150" />
				</td>
			</tr>
			<tr>
				<td>
					鼠标
				</td>
				<td>
					LCD显示器
				</td>
			</tr>
			<tr>
				<td>
					价格：80.00元
				</td>
				<td>
					价格：1999.00元
				</td>
			</tr>
			<tr>
				<!—传递“鼠标”的参数-->
				<td>
					<a
						href="/servlet/addShoppingCart?id=0003&name=鼠标&price=80.00">
						<img src="images/buybutton.gif" width="71" height="21" border="0" />
					</a>
				</td>
				<!—传递“LCD显示器”的参数-->
				<td>
					<a
						href="/servlet/addShoppingCart?id=0004&name=LCD显示器&price=1999.00">
						<img src="images/buybutton.gif" width="71" height="21" border="0" />
					</a>
				</td>
			</tr>
			<tr>
				<td>
					<img src="images/learning.jpg" width="150" height="150" />
				</td>
				<td>
					<img src="images/game.jpg" width="200" height="200" />
				</td>
			</tr>
			<tr>
				<td>
					电子词典
				</td>
				<td>
					掌上游戏机
				</td>
			</tr>
			<tr>
				<td>
					价格：438.00元
				</td>
				<td>
					价格：￥638.00 元
				</td>
			</tr>
			<tr>
				<!—传递“电子词典”的参数-->
				<td>
					<a
						href="/servlet/addShoppingCart?id=0005&name=电子词典&price=438.00">
						<img src="images/buybutton.gif" width="71" height="21" border="0" />
					</a>
				</td>
				<!-- 传递“掌上游戏机”的参数-->
				<td>
					<a
						href="/servlet/addShoppingCart?id=0006&name=掌上游戏机&price=638.00">
						<img src="images/buybutton.gif" width="71" height="21" border="0" />
					</a>
				</td>
			</tr>
		</table>
</body>
</html>