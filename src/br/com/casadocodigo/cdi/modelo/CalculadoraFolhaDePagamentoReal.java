package br.com.casadocodigo.cdi.modelo;

import java.util.List;

import javax.enterprise.inject.Default;

@Default
public class CalculadoraFolhaDePagamentoReal implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Calculadora Real da Folha de Pagamentos e salva no Banco de Dados");
		return new Folha();
	}

}
