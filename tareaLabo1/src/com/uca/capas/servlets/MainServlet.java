package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		
		String cre_username="hola" ;
		String cre_password="123456" ;
				
		PrintWriter out = response.getWriter();
		
		if( username.equals(cre_username) && password.equals(cre_password)) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>ACCESO CORRECTO</h1>");
			out.println("</body>");
			out.println("</html>");
			
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>ACCESO INCORRECTO</h1>");
			out.println("</body>");
			out.println("</html>");	
		}
	}

}
