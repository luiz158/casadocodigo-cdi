package br.com.casadocodigo.cdi.modelo;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Specializes;

import br.com.casadocodigo.cdi.qualifier.Calculadora;

@Calculadora @Specializes
public class CalculadoraAssincronaDeSalarios2013 extends CalculadoraDeSalarios2013 {

	public CalculadoraAssincronaDeSalarios2013() {
		System.out.println("Iniciando a Calculadora de Salarios");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Calculadora de Salarios pronta");
	}
	
	public void calcula() {
		System.out.println("Calculando assincronamente salarios de 2013");
	}
}
