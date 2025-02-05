package com.java.www.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction호출");
	    //한글처리
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String page = uri.substring(cPath.length());
		String url = "";
		
		if(page.equals("/index.do")) {
			System.out.println("메인페이지 연결");
			url = "index.jsp";
		}else if(page.equals("/login.do") ) {
			System.out.println("로그인페이지 연결");
			url = "login.jsp";
		}else if(page.equals("/member.do")) {
			System.out.println("회원가입페이지 연결");
			url = "member.jsp";
		}else if(page.equals("/logout.do")) {
			System.out.println("로그아웃페이지 연결");
			url = "logout.jsp";
		}else if(page.equals("/bList.do")) {
			System.out.println("게시판페이지 연결");
			url = "blist.jsp";
		}
		
		//url
		System.out.println("url : "+url);
		response.sendRedirect(url);
		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출");
		doAction(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost호출");
		doAction(request,response);
	}

}
