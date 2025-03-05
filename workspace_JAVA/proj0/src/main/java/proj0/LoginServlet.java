package proj0;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; carset=utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		
		UserDAO userDAO = new UserDAO();
		boolean result = userDAO.checkLogin(id,pw);
		
		if(result) {
			request.setAttribute("result", result);
			
			String url = "main.jsp";
			response.sendRedirect(url);
		} else {
			request.setAttribute("errorMsg", "아이디 또는 비밀번호가 잘못되었습니다.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
