package br.com.casadocodigo.cdi.servlet;

import br.com.casadocodigo.cdi.qualifier.GeradorDeRelatorio;
import br.com.casadocodigo.cdi.qualifier.Relatorio;

@Relatorio
public class GeradorDeRelatorioExcel implements GeradorDeRelatorio {

	@Override
	public void geraRelatorio() {
		System.out.println("Gerando relatorio em Excel");
	}

}
