package br.com.casadocodigo.cdi.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.cdi.modelo.CalculadoraDeSalarios;

@WebServlet(urlPatterns={"/calculadora-salarios"})
public class CalculadoraDeSalariosServlet extends HttpServlet {

	private static final long serialVersionUID = 3612313790540530620L;

	@Inject
	private CalculadoraDeSalarios calculadoraDeSalarios;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		calculadoraDeSalarios.calcula(); 
	}
	
}
