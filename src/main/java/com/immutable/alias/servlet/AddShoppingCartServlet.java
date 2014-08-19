package com.immutable.alias.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.immutable.alias.pojos.CartItem;
import com.immutable.alias.pojos.ShoppingCart;
import com.immutable.alias.tool.StringTool;


public class AddShoppingCartServlet extends HttpServlet {
	
	private static final long serialVersionUID = -6552354364752194751L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		ShoppingCart cart = (ShoppingCart) session.getAttribute("shoppingcart");
		if (cart == null) {
			cart = new ShoppingCart();
			session.setAttribute("shoppingcart", cart);
		}
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String quantity = request.getParameter("q");
		String price = request.getParameter("price");
		if (StringTool.validateNull(id) || StringTool.validateNull(name) || StringTool.validateNull(price)) {
			printError(request, response);
			return;
		}
		
		id = StringTool.filterHtml(id);
		name = StringTool.filterHtml(name);

		try {
			if (StringTool.validateNull(quantity)) {
				cart.addCartItem(new CartItem(id, name, 1, Double.parseDouble(price)));
			} else {
				cart.addCartItem(new CartItem(id, name, Integer.parseInt(quantity), Double.parseDouble(price)));
			}
		} catch (NumberFormatException e) {
			printError(request, response);
			return;
		}
		response.sendRedirect("/servlet/getShoppingCart");
	}

	private void printError(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>购买商品失败</title></head>");
		out.println("<body>");
		out.println("<h1>缺少商品参数或者商品参数不正确，添加商品到购物车中不成功</h1><br><br>");
		out.println("<a href=\"/showMerchandise.jsp\">继续浏览商品，添加商品到购物车</a><br>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}
}