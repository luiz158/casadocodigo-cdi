package br.com.casadocodigo.cdi.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.cdi.builder.DAO;
import br.com.casadocodigo.cdi.modelo.Pessoa;

@WebServlet("/testa-inject-generico")
public class TestaInjectGenericoServlet extends HttpServlet {

	private static final long serialVersionUID = -7050305656741554692L;

	@Inject
	private DAO<Pessoa> dao;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
