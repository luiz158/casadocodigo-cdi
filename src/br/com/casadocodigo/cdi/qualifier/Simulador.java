package br.com.casadocodigo.cdi.qualifier;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Target({FIELD, METHOD, TYPE, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Simulador {

	PlanoDeCargos planoDeCargos() default PlanoDeCargos.VERSAO_2005; 
}
