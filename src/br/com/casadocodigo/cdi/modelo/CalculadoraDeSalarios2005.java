package br.com.casadocodigo.cdi.modelo;

import javax.annotation.PostConstruct;

public class CalculadoraDeSalarios2005 implements CalculadoraDeSalarios {

	public CalculadoraDeSalarios2005() {
		System.out.println("Iniciando a Calculadora de Salarios");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Calculadora de Salarios pronta");
	}
	
	public void calcula() {
		System.out.println("Calculando salarios padrao");
	}
	
}
