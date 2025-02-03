package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/StuCom")
public class StuCom extends HttpServlet {
	
	// 학번,이름,국어,영어,수학,합계,평균을 콘솔창,웹페이지로 출력하시오.
	// String -> int Integer.parseInt
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		String stuNo = request.getParameter("stuNo");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		int k = Integer.parseInt("kor");
		int e = Integer.parseInt("eng");
		int m = Integer.parseInt("math");
		int total = k+e+m;
		double avg = total/3.0;
		
		
		response.setContentType("text/html;charset=utf-8"); //html
		request.setCharacterEncoding("utf-8"); //한글인코딩
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>페이지</title></head>");
		writer.println("<body>");
		writer.println("<h2>학생성적 정보</h2>");
		writer.printf("<h4>학번 : %s </h4><br/>",stuNo);
		writer.printf("<h4>이름 : %s </h4><br/>",name);
		writer.printf("<h4>국어 : %s </h4><br/>",kor);
		writer.printf("<h4>영어 : %s </h4><br/>",eng);
		writer.printf("<h4>수학 : %s </h4><br/>",math);
		writer.printf("<h4>합계 : %d </h4><br/>",total);
		writer.printf("<h4>평균 : %.2f </h4><br/>",avg);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request,response);
	}

}
