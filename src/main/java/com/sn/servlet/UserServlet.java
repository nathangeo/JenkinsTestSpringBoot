package com.sn.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 669044469826638579L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getOutputStream().print("hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
