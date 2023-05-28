

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Ex08LoginCheck")
public class Ex08LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String suc = "Ex08Main.jsp";
		String fail = "Ex08LoginForm.html";
//		String id = (String)session.getAttribute("id");
//		String pw = (String)session.getAttribute("pw");
		
		if(id.equals("test") && pw.equals("12345")) {
			session.setAttribute("id", id);
			response.sendRedirect(suc);
			
			
		}
		else {
			response.sendRedirect(fail);
			
		}
		
	}

}
