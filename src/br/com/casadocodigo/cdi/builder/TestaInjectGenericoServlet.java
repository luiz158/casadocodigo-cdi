package br.com.casadocodigo.cdi.builder;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.cdi.modelo.PessoaFisica;

@WebServlet("/testa-inject-generico")
public class TestaInjectGenericoServlet extends HttpServlet {

	private static final long serialVersionUID = -7050305656741554692L;

	@Inject
	private DAO<PessoaFisica> dao;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
