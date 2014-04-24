package br.com.casadocodigo.cdi.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.cdi.logger.MyLogger;
import br.com.casadocodigo.cdi.producer.MeuLogger;

@WebServlet(urlPatterns={"/instanciando-logger"})
public class InstanciandoLoggerServlet extends HttpServlet {

	private static final long serialVersionUID = -5189665048662277098L;

	@Inject @MeuLogger
	private MyLogger logger;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("Chamando o doGet do Logger");
	}
	
}
