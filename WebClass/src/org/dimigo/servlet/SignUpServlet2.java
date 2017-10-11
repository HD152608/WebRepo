package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signup2")
public class SignUpServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher rd = request.getRequestDispatcher("/jsp/signup.jsp");
	      rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
	    String pwd = request.getParameter("pwd");
	    String name = request.getParameter("name");
	    String nickname = request.getParameter("nickname");
	    System.out.printf("id : %s, pwd : %s, name : %s, nickname : %s", id, pwd, name, nickname);
//	    HttpSession session = request.getSession();
	      boolean result = true;
	      if (result) {
	         // 세션에 사용자 생성
	         HttpSession session = request.getSession();
	         UserVO user = new UserVO();
	         user.setId(id);
	         user.setName("홍길동");
	         user.setNickname("의적");

	         session.setAttribute("user", user);
	         
	         RequestDispatcher rd = request.getRequestDispatcher("jsp/home.jsp");
	         rd.forward(request, response);
	      } else {
	    	  request.setAttribute("msg", "error");
	    	  RequestDispatcher rd = request.getRequestDispatcher("jsp/signup.jsp");
	          rd.forward(request, response);
	      }
//	      out.close();
	}

}
