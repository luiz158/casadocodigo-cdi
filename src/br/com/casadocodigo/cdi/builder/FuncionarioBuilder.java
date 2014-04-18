package br.com.casadocodigo.cdi.builder;

import br.com.casadocodigo.cdi.modelo.Funcionario;

public class FuncionarioBuilder {

	private Funcionario funcionario;
	
	public FuncionarioBuilder() {
		this.funcionario = new Funcionario();
	}
	
	public FuncionarioBuilder comSalario(double salario) {
		this.funcionario.setSalario(salario);
		return this;
	}

	public Funcionario build() {
		return this.funcionario;
	}

}
