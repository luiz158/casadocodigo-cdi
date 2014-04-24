package br.com.casadocodigo.cdi.servlet;

import java.io.IOException;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.cdi.annotation.RelatorioAnnotation;
import br.com.casadocodigo.cdi.qualifier.GeradorDeRelatorio;

@WebServlet("/gerar-relatorio")
public class GerarRelatorios extends HttpServlet  {

	private static final long serialVersionUID = -3436478075639356552L;
	
	@Inject @Any
	private Instance<GeradorDeRelatorio> geradorDeRelatorio;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getOutputStream().print("Gerando o Relatorio..\n");
		
		Instance<GeradorDeRelatorio> gerador = geradorDeRelatorio.select(new RelatorioAnnotation());
		gerador.get().geraRelatorio();
		
		resp.getOutputStream().print("Finalizando o Relatorio..");
	}
	
}
