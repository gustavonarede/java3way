package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.RequestDispatcher;

import com.web.model.Livro;

/**
 * Servlet implementation class ServletLivro
 */
@WebServlet("/ServletLivro")
public class ServletLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLivro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Livro livro = new Livro();
		livro.setLivro("Java Como Programar");
		livro.setAutor("Paul Deitel");
		livro.setTitulo("Java Como Programar");
		livro.setDescriao("A melhor introdu��o � programa��o orientada a objetos com a nova JavaTM 2 Standard Edition Development Kit (JDK), vers�o 5.0, JDBCT, Servlets e JSPT, baseada na mais did�tica apresenta��o de exemplos de c�digo a abordagem Live-Code (c�digo ativo) , e escrita por uma das maiores autoridades no assunto! A JavaT � a mais popular linguagem de programa��o orientada a objetos, com quatro milh�es de desenvolvedores! "
				+ "Esta nova edi��o do livro-texto Java mais utilizado"
				+ " do mundo traz uma abordagem baseada na introdu��o a classes e objetos, logo no in�cio do livro.");
		Livro livro1 = new Livro();
		livro1.setLivro("Google Android");
		livro1.setAutor("Ricardo R. Lecheta");
		livro1.setTitulo("Google Androdi");
		livro1.setDescriao("Leitor da 4� edi��o do livro Google Android, visite http://ricardolecheta.com.br/?p=696 para verificar as mudan�as da nova edi��o. O Android � atualmente o sistema operacional m�vel mais utilizado no mundo e est� dispon�vel para diversas plataformas, "
				+ "como smartphones, tablets, TV (Google TV), rel�gios (Android Wear), �culos (Google...");
		
		Livro livro2 = new Livro();
		livro2.setLivro("Google Android");
		livro2.setAutor("Ricardo R. Lecheta");
		livro2.setTitulo("Google Androdi");
		livro2.setDescriao("Leitor da 4� edi��o doe...");
		
		Livro livro3 = new Livro();
		livro3.setLivro("Google Android");
		livro3.setAutor("Ricardo R. Lecheta");
		livro3.setTitulo("Google Androdi");
		livro3.setDescriao("Leitor da 4� edi��o do livro Google Android, visite http://ricardolecheta.com.br/?p=696 para verificar as mudan�as da nova edi��o. O Android � atualmente o sistema operacional m�vel mais utilizado no mundo e est� dispon�vel para diversas plataformas, "
				+ "como smartphones, tablets, TV (Google TV), rel�gios (Android Wear), �culos (Google...");
		
		Livro livro4 = new Livro();
		livro4.setLivro("Google Android");
		livro4.setAutor("Ricardo R. Lecheta");
		livro4.setTitulo("Google Androdi");
		livro4.setDescriao("Leitor da 4� edi��o do livro Google Android, visite http://ricardolecheta.com.br/?p=696 para verificar as mudan�as da nova edi��o. O Android � atualmente o sistema operacional m�vel mais utilizado no mundo e est� dispon�vel para diversas plataformas, "
				+ "como smartphones, tablets, TV (Google TV), rel�gios (Android Wear), �culos (Google...");
		
		
		
		ArrayList<Livro> lista = new ArrayList();
		lista.add(livro);
		lista.add(livro1);
		lista.add(livro2);
		lista.add(livro3);
		lista.add(livro4);
		
		request.setAttribute("listaLivro", lista);
		
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarLivros.jsp");
		javax.servlet.RequestDispatcher  rd = getServletContext().getRequestDispatcher("/listarLivros.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
