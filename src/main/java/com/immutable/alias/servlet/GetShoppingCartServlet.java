package com.immutable.alias.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.immutable.alias.pojos.CartItem;
import com.immutable.alias.pojos.ShoppingCart;

public class GetShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 8724740544690435967L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ShoppingCart cart = (ShoppingCart) session.getAttribute("shoppingcart");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>显示购物车</title></head>");
		out.println("<body>");
		if (cart == null) {
			out.println("<h1>您的购物车为空</h1><br><br>");
			out.println("<a href=\"/showMerchandise.jsp\">浏览商品，添加商品到购物车</a><br>");
			return;
		} else {
			out.println("<h1>显示购物车的内容</h1><br>");
			out.println("<a href=\"/showMerchandise.jsp\">继续浏览商品，添加商品到购物车</a>");
			printCartItem(out, cart);
		}
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}

	private void printCartItem(PrintWriter out, ShoppingCart cart) {
		ArrayList<CartItem> items = cart.getCart();
		CartItem item = null;
		out.println("<table width=\"500\" border=\"1\" align=\"left\">");
		out.println("<tr>");
		out.println("<td width=\"200\">商品名称</td>");
		out.println("<td width=\"100\">价格</td>");
		out.println("<td width=\"100\">数量</td>");
		out.println("<td width=\"100\">小计</td>");
		out.println("</tr>");

		for (int i = 0; i < items.size(); i++) {
			item = items.get(i);
			out.println("<tr>");
			out.println("<td>" + item.getName() + "</td>");
			out.println("<td>" + item.getPrice() + "元</td>");
			out.println("<td>" + item.getQuantity() + "</td>");
			out.println("<td>" + item.getSum() + "元</td>");
			out.println("</tr>");
		}
		out.println("<tr>");
		out.println("<td colspan=\"4\">总计：" + cart.getTotal() + "元</td>");
		out.println("</tr>");
		out.println("</table>");
	}
}
