package br.com.casadocodigo.cdi.producer;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import br.com.casadocodigo.cdi.logger.MyLogger;

public class LoggerProducer {

	@Produces @MeuLogger
	public MyLogger criaLogger(InjectionPoint injectionPoint) {
		return MyLogger.getLogger(injectionPoint.getMember().getDeclaringClass());
	}
	
}
