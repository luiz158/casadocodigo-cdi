package br.com.casadocodigo.cdi.modelo;

import java.util.List;

import br.com.casadocodigo.cdi.qualifier.Simulador;

@Simulador
public class SimuladoraDeFolhaDePagamentoDe2005 implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Efetua a simulacao de 2005");
		return new Folha();
	}

}
