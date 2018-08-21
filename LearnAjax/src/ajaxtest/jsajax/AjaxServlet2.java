package ajaxtest.jsajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet2 extends HttpServlet {

	/**
	 * 
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parameter1 = request.getParameter("name");
		String parameter2 = request.getParameter("age");
		System.out.println(parameter1+":"+parameter2);
		response.getWriter().write("{\"name\":\""+parameter1+"\",\"age\":"+parameter2+"}");
		
	}

	/**
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
