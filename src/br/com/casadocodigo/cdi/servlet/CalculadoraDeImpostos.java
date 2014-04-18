package br.com.casadocodigo.cdi.servlet;

import br.com.casadocodigo.cdi.modelo.Funcionario;

public class CalculadoraDeImpostos {

	public Double calculaImpostoDeRendaDo(Funcionario funcionario) {
		return funcionario.getSalario() * 0.10;
	}
	
}
