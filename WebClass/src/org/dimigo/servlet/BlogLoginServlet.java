package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

import com.google.gson.JsonObject;

/**
 * Servlet implementation class BlogLoginServlet
 */
@WebServlet("/bloglogin")
public class BlogLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	   /**
	    * @see HttpServlet#HttpServlet()
	    */
	   public BlogLoginServlet() {
	      super();
	      // TODO Auto-generated constructor stub
	   }

	   /**
	    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	    *      response)
	    */
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	         throws ServletException, IOException {
	      RequestDispatcher rd = request.getRequestDispatcher("/jsp/bloglogin.jsp");
	      rd.forward(request, response);
	   }

	   /**
	    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	    *      response)
	    */
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	         throws ServletException, IOException {
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out = response.getWriter();

	      request.setCharacterEncoding("utf-8");
	      String id = request.getParameter("id");
	      String pwd = request.getParameter("pwd");
	      System.out.printf("id : %s, pwd : %s", id, pwd);

	      
	      if (id.equals("test@naver.com")) {
	         // 세션에 사용자 생성
	         HttpSession session = request.getSession();
	         UserVO user = new UserVO();
	         user.setId(id);
	         user.setName("김주연");

	         session.setAttribute("user", user);
	         
	         RequestDispatcher rd = request.getRequestDispatcher("myblog2.jsp");
	         rd.forward(request, response);
	      } else {
	    	  request.setAttribute("msg", "error");
	    	  RequestDispatcher rd = request.getRequestDispatcher("jsp/bloglogin.jsp");
	          rd.forward(request, response);
	      }
	      out.close();
	   }

	}