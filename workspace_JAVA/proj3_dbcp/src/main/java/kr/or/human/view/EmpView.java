package kr.or.human.view;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import kr.or.human.dto.EmpDTO;

public class EmpView {

	public void viewEmp(List<EmpDTO> list, HttpServletResponse response) {
		

		try {
			response.getWriter().println("<style>*{font-size:30px; border:solid 1px red;}</style>");
			response.getWriter().println("<table>");
			response.getWriter().println("<tr>");
			response.getWriter().println("<th>");
			response.getWriter().println("Empno");
			response.getWriter().println("</th>");
			response.getWriter().println("<th>");
			response.getWriter().println("Ename"); 
			response.getWriter().println("</th>");
			response.getWriter().println("<th>");
			response.getWriter().println("Hiredate");
			response.getWriter().println("</th>");
			response.getWriter().println("</tr>");
			
			for (int i = 0; i < list.size(); i++) {
				response.getWriter().println("<tr>");
				response.getWriter().println("<td>");
				response.getWriter().println(list.get(i).getEmpno());
				response.getWriter().println("</td>");
				response.getWriter().println("<td>");
				response.getWriter().println(list.get(i).getEname());
				response.getWriter().println("</td>");
				response.getWriter().println("<td>");
				response.getWriter().println(list.get(i).getHiredate());
				response.getWriter().println("</td>");
				response.getWriter().println("</tr>");
			}
			response.getWriter().println("</table>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
