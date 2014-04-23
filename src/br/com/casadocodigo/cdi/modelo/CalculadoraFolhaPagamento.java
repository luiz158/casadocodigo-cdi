package br.com.casadocodigo.cdi.modelo;

import java.util.List;


public interface CalculadoraFolhaPagamento {

	Folha calculaFolha(List<Funcionario> funcionarios);
}
