package br.com.casadocodigo.cdi.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.cdi.builder.FuncionarioBuilder;
import br.com.casadocodigo.cdi.modelo.CalculadoraFolhaPagamento;
import br.com.casadocodigo.cdi.modelo.Funcionario;

@WebServlet("/calcular-folha")
public class CalcularFolhaDePagamento extends HttpServlet {

	private static final long serialVersionUID = 421811972656911491L;

	@Inject
	private CalculadoraFolhaPagamento calculadoraFolhaPagamento;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Funcionario alexandre = new FuncionarioBuilder().comSalario(1000.0).build();
		Funcionario gustavo = new FuncionarioBuilder().comSalario(2000.0).build();
		Funcionario mauricio = new FuncionarioBuilder().comSalario(2000.0).build();
		
		List<Funcionario> funcionarios = Arrays.asList(alexandre, gustavo, mauricio);
		
		calculadoraFolhaPagamento.calculaFolha(funcionarios);
		System.out.println("Folha calculada com sucesso!");
	}
	
}
