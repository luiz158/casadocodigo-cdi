package br.com.casadocodigo.cdi.modelo;

import java.util.List;

import br.com.casadocodigo.cdi.qualifier.PlanoDeCargos;
import br.com.casadocodigo.cdi.qualifier.Simulador;

@Simulador(planoDeCargos = PlanoDeCargos.VERSAO_2013)
public class SimuladoraDeFolhaDePagamentoDe2013 implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Efetua a simulacao de 2013");
		return null;
	}

}
