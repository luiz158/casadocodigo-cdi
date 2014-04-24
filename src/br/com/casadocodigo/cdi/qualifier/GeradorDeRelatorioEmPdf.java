package br.com.casadocodigo.cdi.qualifier;

public class GeradorDeRelatorioEmPdf implements GeradorDeRelatorio {

	@Override
	public void geraRelatorio() {
		System.out.println("Gerando relatorio em PDF");
	}

}
