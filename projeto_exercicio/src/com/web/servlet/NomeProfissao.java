package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NomeProfissao")
public class NomeProfissao extends HttpServlet {

	private static final long serialVersion = 1L;
	
	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
	
		throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String profissao = request.getParameter("profissao");
		out.println("<html>"
				+"<body>"
				+"<h1>"+ nome + "</h1>"
				+"<h1>"+ profissao +"</h1>"
				+"</body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
	throws ServletException, IOException{
		
	}
}
