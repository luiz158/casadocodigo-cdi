package br.com.casadocodigo.cdi.modelo;

import javax.inject.Inject;

public class CalculadoraDeImpostos {

	private CalculadoraDeSalarios calculadoraDeSalarios;

	@Inject
	public CalculadoraDeImpostos(CalculadoraDeSalarios calculadoraDeSalarios) {
		this.calculadoraDeSalarios = calculadoraDeSalarios;
		System.out.println("Iniciando Calculadora de Impostos");
	}
	
	public void postConstruct() {
		System.out.println("Calculadora de Impostos pronta para uso!");
	}
	
	public Double calculaImpostoDeRendaDo(Funcionario funcionario) {
		calculadoraDeSalarios.calcula();
		return funcionario.getSalario() * 0.10;
	}
	
}
