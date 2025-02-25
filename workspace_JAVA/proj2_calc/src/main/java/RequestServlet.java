

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/req")
public class RequestServlet extends HttpServlet {
       
    public RequestServlet() {
        super();
        System.out.println("RequestServlet 생성자 실행");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet 시랭1");
		
//		요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
//		응답내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		String num1 = request.getParameter("num1");
		System.out.println("num1 :" + num1);
		String num2 = request.getParameter("num2");
		System.out.println("num2 :" + num2);
		
//		getParameter 		= querySelcetor
//		getParameterValues  = querySelcetorAll
//		같은 name 으로 여러개 온경우
//		String 배열로 모두 받을수있음
//		마찬가지로 없으면 null
		String[] nums = request.getParameterValues("num1");
		if(nums != null) {
			for ( String num : nums ) {
				System.out.println("nums :"+ num);
			}
		}
		
		response.getWriter().println("<strong>num1</strong>의 값은 : " + num1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
