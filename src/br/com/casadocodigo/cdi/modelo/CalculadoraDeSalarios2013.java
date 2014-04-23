package br.com.casadocodigo.cdi.modelo;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Alternative;

@Alternative
public class CalculadoraDeSalarios2013 implements CalculadoraDeSalarios {

	public CalculadoraDeSalarios2013() {
		System.out.println("Iniciando a Calculadora de Salarios");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Calculadora de Salarios pronta");
	}
	
	public void calcula() {
		System.out.println("Calculando salarios de 2013");
	}
	
}
