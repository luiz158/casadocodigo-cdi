package br.com.casadocodigo.cdi.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello-cdi")
public class IniciandoComCDI extends HttpServlet {

	private static final long serialVersionUID = 1297552244523192638L;

	@Inject
	private CalculadoraDeImpostos calculadoraDeImpostos;
	
	public IniciandoComCDI() {
		System.out.println("Iniciando a Servlet..");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Servlet iniciada, dependencias injetadas e pronta para ser usada!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Funfando!");
	}
	
}
